package typings.bull

import org.scalablytyped.runtime.StringDictionary
import typings.bull.anon.AttemptsMade
import typings.bull.anon.Count
import typings.bull.anon.Data
import typings.bull.anon.Message
import typings.bull.bullBooleans.`false`
import typings.bull.bullStrings.active
import typings.bull.bullStrings.bclient
import typings.bull.bullStrings.cleaned
import typings.bull.bullStrings.client
import typings.bull.bullStrings.completed
import typings.bull.bullStrings.drained
import typings.bull.bullStrings.error
import typings.bull.bullStrings.failed
import typings.bull.bullStrings.paused
import typings.bull.bullStrings.progress
import typings.bull.bullStrings.removed
import typings.bull.bullStrings.resumed
import typings.bull.bullStrings.stalled
import typings.bull.bullStrings.subscriber
import typings.bull.bullStrings.waiting
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Pipeline
import typings.ioredis.mod.Redis
import typings.ioredis.mod.RedisOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the Queue constructor.
  * It creates a new Queue that is persisted in Redis.
  * Everytime the same queue is instantiated it tries to process all the old jobs that may exist from a previous unfinished session.
  */
object mod {
  
  /* tslint:disable:no-unnecessary-generics unified-signatures */
  @JSImport("bull", JSImport.Namespace)
  @js.native
  def apply[T](queueName: String): Queue[T] = js.native
  @JSImport("bull", JSImport.Namespace)
  @js.native
  def apply[T](queueName: String, opts: QueueOptions): Queue[T] = js.native
  @JSImport("bull", JSImport.Namespace)
  @js.native
  def apply[T](queueName: String, url: String): Queue[T] = js.native
  @JSImport("bull", JSImport.Namespace)
  @js.native
  def apply[T](queueName: String, url: String, opts: QueueOptions): Queue[T] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bull", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends Queue[T] {
    def this(queueName: String) = this()
    def this(queueName: String, opts: QueueOptions) = this()
    def this(queueName: String, url: String) = this()
    def this(queueName: String, url: String, opts: QueueOptions) = this()
  }
  
  type ActiveEventCallback[T] = js.Function2[/* job */ Job[T], /* jobPromise */ js.UndefOr[JobPromise], Unit]
  
  @js.native
  trait AdvancedSettings extends StObject {
    
    /**
      * Define a custom backoff strategy
      */
    var backoffStrategies: js.UndefOr[
        StringDictionary[js.Function2[/* attemptsMade */ Double, /* err */ Error, Double]]
      ] = js.native
    
    /**
      * A timeout for when the queue is in `drained` state (empty waiting for jobs).
      * It is used when calling `queue.getNextJob()`, which will pass it to `.brpoplpush` on the Redis client.
      */
    var drainDelay: js.UndefOr[Double] = js.native
    
    /**
      * Poll interval for delayed jobs and added jobs
      */
    var guardInterval: js.UndefOr[Double] = js.native
    
    /**
      * Key expiration time for job locks
      */
    var lockDuration: js.UndefOr[Double] = js.native
    
    /**
      * Interval in milliseconds on which to acquire the job lock.
      */
    var lockRenewTime: js.UndefOr[Double] = js.native
    
    /**
      * Max amount of times a stalled job will be re-processed
      */
    var maxStalledCount: js.UndefOr[Double] = js.native
    
    /**
      * Delay before processing next job in case of internal error
      */
    var retryProcessDelay: js.UndefOr[Double] = js.native
    
    /**
      * How often check for stalled jobs (use 0 for never checking)
      */
    var stalledInterval: js.UndefOr[Double] = js.native
  }
  object AdvancedSettings {
    
    @scala.inline
    def apply(): AdvancedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdvancedSettings]
    }
    
    @scala.inline
    implicit class AdvancedSettingsMutableBuilder[Self <: AdvancedSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoffStrategies(value: StringDictionary[js.Function2[/* attemptsMade */ Double, /* err */ Error, Double]]): Self = StObject.set(x, "backoffStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffStrategiesUndefined: Self = StObject.set(x, "backoffStrategies", js.undefined)
      
      @scala.inline
      def setDrainDelay(value: Double): Self = StObject.set(x, "drainDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrainDelayUndefined: Self = StObject.set(x, "drainDelay", js.undefined)
      
      @scala.inline
      def setGuardInterval(value: Double): Self = StObject.set(x, "guardInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardIntervalUndefined: Self = StObject.set(x, "guardInterval", js.undefined)
      
      @scala.inline
      def setLockDuration(value: Double): Self = StObject.set(x, "lockDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockDurationUndefined: Self = StObject.set(x, "lockDuration", js.undefined)
      
      @scala.inline
      def setLockRenewTime(value: Double): Self = StObject.set(x, "lockRenewTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockRenewTimeUndefined: Self = StObject.set(x, "lockRenewTime", js.undefined)
      
      @scala.inline
      def setMaxStalledCount(value: Double): Self = StObject.set(x, "maxStalledCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStalledCountUndefined: Self = StObject.set(x, "maxStalledCount", js.undefined)
      
      @scala.inline
      def setRetryProcessDelay(value: Double): Self = StObject.set(x, "retryProcessDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryProcessDelayUndefined: Self = StObject.set(x, "retryProcessDelay", js.undefined)
      
      @scala.inline
      def setStalledInterval(value: Double): Self = StObject.set(x, "stalledInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStalledIntervalUndefined: Self = StObject.set(x, "stalledInterval", js.undefined)
    }
  }
  
  @js.native
  trait BackoffOptions extends StObject {
    
    /**
      * Backoff delay, in milliseconds
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Backoff type, which can be either `fixed` or `exponential`
      */
    var `type`: String = js.native
  }
  object BackoffOptions {
    
    @scala.inline
    def apply(`type`: String): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackoffOptions]
    }
    
    @scala.inline
    implicit class BackoffOptionsMutableBuilder[Self <: BackoffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CleanedEventCallback[T] = js.Function2[/* jobs */ js.Array[Job[T]], /* status */ JobStatusClean, Unit]
  
  type CompletedEventCallback[T] = js.Function2[/* job */ Job[T], /* result */ js.Any, Unit]
  
  @js.native
  trait CronRepeatOptions extends RepeatOptions {
    
    /**
      * Cron pattern specifying when the job should execute
      */
    var cron: String = js.native
    
    /**
      * Start date when the repeat job should start repeating (only with cron).
      */
    var startDate: js.UndefOr[Date | String | Double] = js.native
  }
  object CronRepeatOptions {
    
    @scala.inline
    def apply(cron: String): CronRepeatOptions = {
      val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronRepeatOptions]
    }
    
    @scala.inline
    implicit class CronRepeatOptionsMutableBuilder[Self <: CronRepeatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDate(value: Date | String | Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  type DoneCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* value */ js.UndefOr[js.Any], Unit]
  
  type ErrorEventCallback = js.Function1[/* error */ Error, Unit]
  
  type EventCallback = js.Function0[Unit]
  
  @js.native
  trait EveryRepeatOptions extends RepeatOptions {
    
    /**
      * Repeat every millis (cron setting cannot be used together with this setting.)
      */
    var every: Double = js.native
  }
  object EveryRepeatOptions {
    
    @scala.inline
    def apply(every: Double): EveryRepeatOptions = {
      val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
      __obj.asInstanceOf[EveryRepeatOptions]
    }
    
    @scala.inline
    implicit class EveryRepeatOptionsMutableBuilder[Self <: EveryRepeatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    }
  }
  
  type FailedEventCallback[T] = js.Function2[/* job */ Job[T], /* error */ Error, Unit]
  
  @js.native
  trait Job[T] extends StObject {
    
    /**
      * How many attempts where made to run this job
      */
    var attemptsMade: Double = js.native
    
    /**
      * The custom data passed when the job was created
      */
    var data: T = js.native
    
    /**
      * Ensure this job is never ran again even if attemptsMade is less than job.attempts.
      */
    def discard(): js.Promise[Unit] = js.native
    
    var failedReason: js.UndefOr[String] = js.native
    
    /**
      * Returns a promise that resolves to the returned data when the job has been finished.
      * TODO: Add a watchdog to check if the job has finished periodically.
      * since pubsub does not give any guarantees.
      */
    def finished(): js.Promise[_] = js.native
    
    /**
      * When this job was completed (unix milliseconds)
      */
    var finishedOn: js.UndefOr[Double] = js.native
    
    /**
      * Returns a promise resolving to the current job's status.
      * Please take note that the implementation of this method is not very efficient, nor is
      * it atomic. If your queue does have a very large quantity of jobs, you may want to
      * avoid using this method.
      */
    def getState(): js.Promise[JobStatus] = js.native
    
    var id: JobId = js.native
    
    /**
      * Returns a promise resolving to a boolean which, if true, current job's state is active
      */
    def isActive(): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise resolving to a boolean which, if true, current job's state is completed
      */
    def isCompleted(): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise resolving to a boolean which, if true, current job's state is delayed
      */
    def isDelayed(): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise resolving to a boolean which, if true, current job's state is failed
      */
    def isFailed(): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise resolving to a boolean which, if true, current job's state is paused
      */
    def isPaused(): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise resolving to a boolean which, if true, current job's state is stuck
      */
    def isStuck(): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise resolving to a boolean which, if true, current job's state is wait
      */
    def isWaiting(): js.Promise[Boolean] = js.native
    
    /**
      * The lock id of the job
      */
    def lockKey(): String = js.native
    
    /**
      * Logs one row of log data.
      *
      * @param row String with log data to be logged.
      */
    def log(row: String): js.Promise[_] = js.native
    
    /**
      * Moves a job to the `completed` queue. Pulls a job from 'waiting' to 'active'
      * and returns a tuple containing the next jobs data and id. If no job is in the `waiting` queue, returns null.
      */
    def moveToCompleted(): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    def moveToCompleted(returnValue: js.UndefOr[scala.Nothing], ignoreLock: js.UndefOr[scala.Nothing], notFetch: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    def moveToCompleted(returnValue: js.UndefOr[scala.Nothing], ignoreLock: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    def moveToCompleted(returnValue: js.UndefOr[scala.Nothing], ignoreLock: Boolean, notFetch: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    def moveToCompleted(returnValue: String): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    def moveToCompleted(returnValue: String, ignoreLock: js.UndefOr[scala.Nothing], notFetch: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    def moveToCompleted(returnValue: String, ignoreLock: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    def moveToCompleted(returnValue: String, ignoreLock: Boolean, notFetch: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    
    /**
      * Moves a job to the `failed` queue. Pulls a job from 'waiting' to 'active'
      * and returns a tuple containing the next jobs data and id. If no job is in the `waiting` queue, returns null.
      */
    def moveToFailed(errorInfo: Message): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    def moveToFailed(errorInfo: Message, ignoreLock: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
    
    /**
      * The named processor name
      */
    var name: String = js.native
    
    /**
      * Options of the job
      */
    var opts: JobOptions = js.native
    
    /**
      * When this job was started (unix milliseconds)
      */
    var processedOn: js.UndefOr[Double] = js.native
    
    /**
      * Get progress on a job
      */
    def progress(): js.Any = js.native
    /**
      * Report progress on a job
      */
    def progress(value: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Promotes a job that is currently "delayed" to the "waiting" state and executed as soon as possible.
      */
    def promote(): js.Promise[Unit] = js.native
    
    /**
      * Which queue this job was part of
      */
    var queue: Queue[T] = js.native
    
    /**
      * Releases the lock on the job. Only locks owned by the queue instance can be released.
      */
    def releaseLock(): js.Promise[Unit] = js.native
    
    /**
      * Removes a job from the queue and from any lists it may be included in.
      * The returned promise resolves when the job has been removed.
      */
    def remove(): js.Promise[Unit] = js.native
    
    /**
      * Re-run a job that has failed. The returned promise resolves when the job
      * has been scheduled for retry.
      */
    def retry(): js.Promise[Unit] = js.native
    
    var returnvalue: js.Any = js.native
    
    /**
      * The stacktrace for any errors
      */
    var stacktrace: js.Array[String] = js.native
    
    /**
      * Takes a lock for this job so that no other queue worker can process it at the same time.
      */
    def takeLock(): js.Promise[Double | `false`] = js.native
    
    var timestamp: Double = js.native
    
    /**
      * Get job properties as Json Object
      */
    def toJSON(): AttemptsMade[T] = js.native
    
    /**
      * Update a specific job's data. Promise resolves when the job has been updated.
      */
    def update(data: T): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait JobCounts extends StObject {
    
    var active: Double = js.native
    
    var completed: Double = js.native
    
    var delayed: Double = js.native
    
    var failed: Double = js.native
    
    var waiting: Double = js.native
  }
  object JobCounts {
    
    @scala.inline
    def apply(active: Double, completed: Double, delayed: Double, failed: Double, waiting: Double): JobCounts = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], delayed = delayed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobCounts]
    }
    
    @scala.inline
    implicit class JobCountsMutableBuilder[Self <: JobCounts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayed(value: Double): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  type JobId = Double | String
  
  @js.native
  trait JobInformation extends StObject {
    
    var cron: String = js.native
    
    var endDate: js.UndefOr[Double] = js.native
    
    var every: Double = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var key: String = js.native
    
    var name: String = js.native
    
    var next: Double = js.native
    
    var tz: js.UndefOr[String] = js.native
  }
  object JobInformation {
    
    @scala.inline
    def apply(cron: String, every: Double, key: String, name: String, next: Double): JobInformation = {
      val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobInformation]
    }
    
    @scala.inline
    implicit class JobInformationMutableBuilder[Self <: JobInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDate(value: Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
    }
  }
  
  @js.native
  trait JobOptions extends StObject {
    
    /**
      * The total number of attempts to try the job until it completes
      */
    var attempts: js.UndefOr[Double] = js.native
    
    /**
      * Backoff setting for automatic retries if the job fails
      */
    var backoff: js.UndefOr[Double | BackoffOptions] = js.native
    
    /**
      * An amount of miliseconds to wait until this job can be processed.
      * Note that for accurate delays, both server and clients should have their clocks synchronized. [optional]
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Override the job ID - by default, the job ID is a unique
      * integer, but you can use this setting to override it.
      * If you use this option, it is up to you to ensure the
      * jobId is unique. If you attempt to add a job with an id that
      * already exists, it will not be added.
      */
    var jobId: js.UndefOr[JobId] = js.native
    
    /**
      * A boolean which, if true, adds the job to the right
      * of the queue instead of the left (default false)
      */
    var lifo: js.UndefOr[Boolean] = js.native
    
    /**
      * Prevents JSON data from being parsed.
      */
    var preventParsingData: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional priority value. ranges from 1 (highest priority) to MAX_INT  (lowest priority).
      * Note that using priorities has a slight impact on performance, so do not use it if not required
      */
    var priority: js.UndefOr[Double] = js.native
    
    /**
      * A boolean which, if true, removes the job when it successfully completes.
      * When a number, it specifies the amount of jobs to keep.
      * Default behavior is to keep the job in the failed set.
      */
    var removeOnComplete: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * A boolean which, if true, removes the job when it fails after all attempts.
      * When a number, it specifies the amount of jobs to keep.
      * Default behavior is to keep the job in the completed set.
      */
    var removeOnFail: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * Repeat job according to a cron specification
      */
    var repeat: js.UndefOr[CronRepeatOptions | EveryRepeatOptions] = js.native
    
    /**
      * Limits the amount of stack trace lines that will be recorded in the stacktrace.
      */
    var stackTraceLimit: js.UndefOr[Double] = js.native
    
    /**
      *  The number of milliseconds after which the job should be fail with a timeout error
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object JobOptions {
    
    @scala.inline
    def apply(): JobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobOptions]
    }
    
    @scala.inline
    implicit class JobOptionsMutableBuilder[Self <: JobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      @scala.inline
      def setBackoff(value: Double | BackoffOptions): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
      
      @scala.inline
      def setLifo(value: Boolean): Self = StObject.set(x, "lifo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifoUndefined: Self = StObject.set(x, "lifo", js.undefined)
      
      @scala.inline
      def setPreventParsingData(value: Boolean): Self = StObject.set(x, "preventParsingData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventParsingDataUndefined: Self = StObject.set(x, "preventParsingData", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setRemoveOnComplete(value: Boolean | Double): Self = StObject.set(x, "removeOnComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnCompleteUndefined: Self = StObject.set(x, "removeOnComplete", js.undefined)
      
      @scala.inline
      def setRemoveOnFail(value: Boolean | Double): Self = StObject.set(x, "removeOnFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnFailUndefined: Self = StObject.set(x, "removeOnFail", js.undefined)
      
      @scala.inline
      def setRepeat(value: CronRepeatOptions | EveryRepeatOptions): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setStackTraceLimit(value: Double): Self = StObject.set(x, "stackTraceLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackTraceLimitUndefined: Self = StObject.set(x, "stackTraceLimit", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait JobPromise extends StObject {
    
    /**
      * Abort this job
      */
    def cancel(): Unit = js.native
  }
  object JobPromise {
    
    @scala.inline
    def apply(cancel: () => Unit): JobPromise = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[JobPromise]
    }
    
    @scala.inline
    implicit class JobPromiseMutableBuilder[Self <: JobPromise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bull.bullStrings.completed
    - typings.bull.bullStrings.waiting
    - typings.bull.bullStrings.active
    - typings.bull.bullStrings.delayed
    - typings.bull.bullStrings.failed
    - typings.bull.bullStrings.paused
  */
  trait JobStatus extends StObject
  object JobStatus {
    
    @scala.inline
    def active: typings.bull.bullStrings.active = "active".asInstanceOf[typings.bull.bullStrings.active]
    
    @scala.inline
    def completed: typings.bull.bullStrings.completed = "completed".asInstanceOf[typings.bull.bullStrings.completed]
    
    @scala.inline
    def delayed: typings.bull.bullStrings.delayed = "delayed".asInstanceOf[typings.bull.bullStrings.delayed]
    
    @scala.inline
    def failed: typings.bull.bullStrings.failed = "failed".asInstanceOf[typings.bull.bullStrings.failed]
    
    @scala.inline
    def paused: typings.bull.bullStrings.paused = "paused".asInstanceOf[typings.bull.bullStrings.paused]
    
    @scala.inline
    def waiting: typings.bull.bullStrings.waiting = "waiting".asInstanceOf[typings.bull.bullStrings.waiting]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bull.bullStrings.completed
    - typings.bull.bullStrings.wait
    - typings.bull.bullStrings.active
    - typings.bull.bullStrings.delayed
    - typings.bull.bullStrings.failed
    - typings.bull.bullStrings.paused
  */
  trait JobStatusClean extends StObject
  object JobStatusClean {
    
    @scala.inline
    def active: typings.bull.bullStrings.active = "active".asInstanceOf[typings.bull.bullStrings.active]
    
    @scala.inline
    def completed: typings.bull.bullStrings.completed = "completed".asInstanceOf[typings.bull.bullStrings.completed]
    
    @scala.inline
    def delayed: typings.bull.bullStrings.delayed = "delayed".asInstanceOf[typings.bull.bullStrings.delayed]
    
    @scala.inline
    def failed: typings.bull.bullStrings.failed = "failed".asInstanceOf[typings.bull.bullStrings.failed]
    
    @scala.inline
    def paused: typings.bull.bullStrings.paused = "paused".asInstanceOf[typings.bull.bullStrings.paused]
  }
  
  type ProcessCallbackFunction[T] = js.Function2[/* job */ Job[T], /* done */ DoneCallback, Unit]
  
  type ProcessPromiseFunction[T] = js.Function1[/* job */ Job[T], js.Promise[Unit]]
  
  type ProgressEventCallback[T] = js.Function2[/* job */ Job[T], /* progress */ js.Any, Unit]
  
  @js.native
  trait Queue[T] extends EventEmitter {
    
    /* tslint:enable:unified-signatures */
    /**
      * Creates a new job and adds it to the queue.
      * If the queue is empty the job will be executed directly,
      * otherwise it will be placed in the queue and executed as soon as possible.
      */
    def add(data: T): js.Promise[Job[T]] = js.native
    def add(data: T, opts: JobOptions): js.Promise[Job[T]] = js.native
    /**
      * Creates a new named job and adds it to the queue.
      * If the queue is empty the job will be executed directly,
      * otherwise it will be placed in the queue and executed as soon as possible.
      */
    def add(name: String, data: T): js.Promise[Job[T]] = js.native
    def add(name: String, data: T, opts: JobOptions): js.Promise[Job[T]] = js.native
    
    /**
      * Adds an array of jobs to the queue.
      * If the queue is empty the jobs will be executed directly,
      * otherwise they will be placed in the queue and executed as soon as possible.
      */
    def addBulk(jobs: js.Array[Data[T]]): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Returns Queue name in base64 encoded format
      */
    def base64Name(): String = js.native
    
    /**
      * Tells the queue remove all jobs created outside of a grace period in milliseconds.
      * You can clean the jobs with the following states: completed, wait (typo for waiting), active, delayed, and failed.
      * @param grace Grace period in milliseconds.
      * @param status Status of the job to clean. Values are completed, wait, active, delayed, and failed. Defaults to completed.
      * @param limit Maximum amount of jobs to clean per call. If not provided will clean all matching jobs.
      */
    def clean(grace: Double): js.Promise[js.Array[Job[T]]] = js.native
    def clean(grace: Double, status: js.UndefOr[scala.Nothing], limit: Double): js.Promise[js.Array[Job[T]]] = js.native
    def clean(grace: Double, status: JobStatusClean): js.Promise[js.Array[Job[T]]] = js.native
    def clean(grace: Double, status: JobStatusClean, limit: Double): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Queue client (used to add jobs, pause queues, etc);
      */
    var client: Redis = js.native
    
    /**
      * Returns Queue name with keyPrefix (default: 'bull')
      */
    def clientName(): String = js.native
    
    // tslint:disable-line unified-signatures
    /**
      * Array of Redis clients the queue uses
      */
    var clients: js.Array[Redis] = js.native
    
    /**
      * Closes the underlying redis client. Use this to perform a graceful shutdown.
      *
      * `close` can be called from anywhere, with one caveat:
      * if called from within a job handler the queue won't close until after the job has been processed
      */
    def close(): js.Promise[Unit] = js.native
    def close(doNotWaitJobs: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Returns a promise that returns the number of jobs in the queue, waiting or paused.
      * Since there may be other processes adding or processing jobs, this value may be true only for a very small amount of time.
      */
    def count(): js.Promise[Double] = js.native
    
    /**
      * Empties a queue deleting all the input lists and associated jobs.
      */
    def empty(): js.Promise[Unit] = js.native
    
    /**
      * Returns a promise that will return an array with the active jobs between start and end.
      */
    def getActive(): js.Promise[js.Array[Job[T]]] = js.native
    def getActive(start: js.UndefOr[scala.Nothing], end: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getActive(start: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getActive(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Returns a promise that resolves with the quantity of active jobs.
      */
    def getActiveCount(): js.Promise[Double] = js.native
    
    /**
      * Returns a promise that will return an array with the completed jobs between start and end.
      */
    def getCompleted(): js.Promise[js.Array[Job[T]]] = js.native
    def getCompleted(start: js.UndefOr[scala.Nothing], end: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getCompleted(start: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getCompleted(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Returns a promise that resolves with the quantity of completed jobs.
      */
    def getCompletedCount(): js.Promise[Double] = js.native
    
    /**
      * Returns a promise that will return an array with the delayed jobs between start and end.
      */
    def getDelayed(): js.Promise[js.Array[Job[T]]] = js.native
    def getDelayed(start: js.UndefOr[scala.Nothing], end: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getDelayed(start: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getDelayed(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Returns a promise that resolves with the quantity of delayed jobs.
      */
    def getDelayedCount(): js.Promise[Double] = js.native
    
    /**
      * Returns a promise that will return an array with the failed jobs between start and end.
      */
    def getFailed(): js.Promise[js.Array[Job[T]]] = js.native
    def getFailed(start: js.UndefOr[scala.Nothing], end: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getFailed(start: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getFailed(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Returns a promise that resolves with the quantity of failed jobs.
      */
    def getFailedCount(): js.Promise[Double] = js.native
    
    /**
      * Returns a promise that will return the job instance associated with the jobId parameter.
      * If the specified job cannot be located, the promise callback parameter will be set to null.
      */
    def getJob(jobId: JobId): js.Promise[Job[T] | Null] = js.native
    
    /**
      * Returns a promise that resolves with the job counts for the given queue of the given job statuses.
      */
    def getJobCountByTypes(types: js.Array[JobStatus]): js.Promise[JobCounts] = js.native
    def getJobCountByTypes(types: JobStatus): js.Promise[JobCounts] = js.native
    
    /**
      * Returns a promise that resolves with the job counts for the given queue.
      */
    def getJobCounts(): js.Promise[JobCounts] = js.native
    
    /**
      * Returns a object with the logs according to the start and end arguments. The returned count
      * value is the total amount of logs, useful for implementing pagination.
      */
    def getJobLogs(jobId: JobId): js.Promise[Count] = js.native
    def getJobLogs(jobId: JobId, start: js.UndefOr[scala.Nothing], end: Double): js.Promise[Count] = js.native
    def getJobLogs(jobId: JobId, start: Double): js.Promise[Count] = js.native
    def getJobLogs(jobId: JobId, start: Double, end: Double): js.Promise[Count] = js.native
    
    /**
      * Returns a promise that will return an array of job instances of the given job statuses.
      * Optional parameters for range and ordering are provided.
      */
    def getJobs(types: js.Array[JobStatus]): js.Promise[js.Array[Job[T]]] = js.native
    def getJobs(
      types: js.Array[JobStatus],
      start: js.UndefOr[scala.Nothing],
      end: js.UndefOr[scala.Nothing],
      asc: Boolean
    ): js.Promise[js.Array[Job[T]]] = js.native
    def getJobs(types: js.Array[JobStatus], start: js.UndefOr[scala.Nothing], end: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getJobs(types: js.Array[JobStatus], start: js.UndefOr[scala.Nothing], end: Double, asc: Boolean): js.Promise[js.Array[Job[T]]] = js.native
    def getJobs(types: js.Array[JobStatus], start: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getJobs(types: js.Array[JobStatus], start: Double, end: js.UndefOr[scala.Nothing], asc: Boolean): js.Promise[js.Array[Job[T]]] = js.native
    def getJobs(types: js.Array[JobStatus], start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getJobs(types: js.Array[JobStatus], start: Double, end: Double, asc: Boolean): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Returns a promise that resolves with the quantity of paused jobs.
      */
    def getPausedCount(): js.Promise[Double] = js.native
    
    /**
      * Returns a promise that resolves to the quantity of repeatable jobs.
      */
    def getRepeatableCount(): js.Promise[Double] = js.native
    
    /**
      * Returns JobInformation of repeatable jobs (ordered descending). Provide a start and/or an end
      * index to limit the number of results. Start defaults to 0, end to -1 and asc to false.
      */
    def getRepeatableJobs(): js.Promise[js.Array[JobInformation]] = js.native
    def getRepeatableJobs(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], asc: Boolean): js.Promise[js.Array[JobInformation]] = js.native
    def getRepeatableJobs(start: js.UndefOr[scala.Nothing], end: Double): js.Promise[js.Array[JobInformation]] = js.native
    def getRepeatableJobs(start: js.UndefOr[scala.Nothing], end: Double, asc: Boolean): js.Promise[js.Array[JobInformation]] = js.native
    def getRepeatableJobs(start: Double): js.Promise[js.Array[JobInformation]] = js.native
    def getRepeatableJobs(start: Double, end: js.UndefOr[scala.Nothing], asc: Boolean): js.Promise[js.Array[JobInformation]] = js.native
    def getRepeatableJobs(start: Double, end: Double): js.Promise[js.Array[JobInformation]] = js.native
    def getRepeatableJobs(start: Double, end: Double, asc: Boolean): js.Promise[js.Array[JobInformation]] = js.native
    
    /**
      * Returns a promise that will return an array with the waiting jobs between start and end.
      */
    def getWaiting(): js.Promise[js.Array[Job[T]]] = js.native
    def getWaiting(start: js.UndefOr[scala.Nothing], end: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getWaiting(start: Double): js.Promise[js.Array[Job[T]]] = js.native
    def getWaiting(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
    
    /**
      * Returns a promise that resolves with the quantity of waiting jobs.
      */
    def getWaitingCount(): js.Promise[Double] = js.native
    
    /**
      * Returns Redis clients array which belongs to current Queue
      */
    def getWorkers(): js.Promise[js.Array[Redis]] = js.native
    
    /**
      * Returns a promise that resolves when Redis is connected and the queue is ready to accept jobs.
      * This replaces the `ready` event emitted on Queue in previous verisons.
      */
    def isReady(): js.Promise[this.type] = js.native
    
    /**
      * Returns a promise that marks the start of a transaction block.
      */
    def multi(): Pipeline = js.native
    
    /**
      * The name of the queue
      */
    var name: String = js.native
    
    /**
      * ???
      */
    def nextRepeatableJob(name: String, data: js.Any, opts: JobOptions): js.Promise[Job[T]] = js.native
    
    /**
      * A job has started. You can use `jobPromise.cancel()` to abort it
      */
    @JSName("on")
    def on_active(event: active, callback: ActiveEventCallback[T]): this.type = js.native
    /**
      * Old jobs have been cleaned from the queue.
      * `jobs` is an array of jobs that were removed, and `type` is the type of those jobs.
      *
      * @see Queue#clean() for details
      */
    @JSName("on")
    def on_cleaned(event: cleaned, callback: CleanedEventCallback[T]): this.type = js.native
    /**
      * A job successfully completed with a `result`
      */
    @JSName("on")
    def on_completed(event: completed, callback: CompletedEventCallback[T]): this.type = js.native
    /**
      * Emitted every time the queue has processed all the waiting jobs
      * (even if there can be some delayed jobs not yet processed)
      */
    @JSName("on")
    def on_drained(event: drained, callback: EventCallback): this.type = js.native
    /**
      * An error occured
      */
    @JSName("on")
    def on_error(event: error, callback: ErrorEventCallback): this.type = js.native
    /**
      * A job failed with `err` as the reason
      */
    @JSName("on")
    def on_failed(event: failed, callback: FailedEventCallback[T]): this.type = js.native
    /**
      * The queue has been paused
      */
    @JSName("on")
    def on_paused(event: paused, callback: EventCallback): this.type = js.native
    /**
      * A job's progress was updated
      */
    @JSName("on")
    def on_progress(event: progress, callback: ProgressEventCallback[T]): this.type = js.native
    // tslint:disable-line unified-signatures
    /**
      * A job successfully removed.
      */
    @JSName("on")
    def on_removed(event: removed, callback: RemovedEventCallback[T]): this.type = js.native
    /**
      * The queue has been resumed
      */
    @JSName("on")
    def on_resumed(event: resumed, callback: EventCallback): this.type = js.native
    /**
      * A job has been marked as stalled.
      * This is useful for debugging job workers that crash or pause the event loop.
      */
    @JSName("on")
    def on_stalled(event: stalled, callback: StalledEventCallback[T]): this.type = js.native
    /**
      * A Job is waiting to be processed as soon as a worker is idling.
      */
    @JSName("on")
    def on_waiting(event: waiting, callback: WaitingEventCallback): this.type = js.native
    
    /**
      * Returns Redis clients array which belongs to current Queue from string with all redis clients
      *
      * @param list String with all redis clients
      */
    def parseClientList(list: String): js.Array[Redis] = js.native
    
    /**
      * Returns a promise that resolves when the queue is paused.
      *
      * A paused queue will not process new jobs until resumed, but current jobs being processed will continue until
      * they are finalized. The pause can be either global or local. If global, all workers in all queue instances
      * for a given queue will be paused. If local, just this worker will stop processing new jobs after the current
      * lock expires. This can be useful to stop a worker from taking new jobs prior to shutting down.
      *
      * If doNotWaitActive is true, pause will not wait for any active jobs to finish before resolving. Otherwise, pause
      * will wait for active jobs to finish. See Queue#whenCurrentJobsFinished for more information.
      *
      * Pausing a queue that is already paused does nothing.
      */
    def pause(): js.Promise[Unit] = js.native
    def pause(isLocal: js.UndefOr[scala.Nothing], doNotWaitActive: Boolean): js.Promise[Unit] = js.native
    def pause(isLocal: Boolean): js.Promise[Unit] = js.native
    def pause(isLocal: Boolean, doNotWaitActive: Boolean): js.Promise[Unit] = js.native
    
    def process(callback: String): js.Promise[Unit] = js.native
    /* tslint:disable:unified-signatures */
    /**
      * Defines a processing function for the jobs placed into a given Queue.
      *
      * The callback is called everytime a job is placed in the queue.
      * It is passed an instance of the job as first argument.
      *
      * If the callback signature contains the second optional done argument,
      * the callback will be passed a done callback to be called after the job has been completed.
      * The done callback can be called with an Error instance, to signal that the job did not complete successfully,
      * or with a result as second argument (e.g.: done(null, result);) when the job is successful.
      * Errors will be passed as a second argument to the "failed" event; results, as a second argument to the "completed" event.
      *
      * If, however, the callback signature does not contain the done argument,
      * a promise must be returned to signal job completion.
      * If the promise is rejected, the error will be passed as a second argument to the "failed" event.
      * If it is resolved, its value will be the "completed" event's second argument.
      */
    def process(callback: ProcessCallbackFunction[T]): js.Promise[Unit] = js.native
    def process(callback: ProcessPromiseFunction[T]): js.Promise[Unit] = js.native
    def process(concurrency: Double, callback: String): js.Promise[Unit] = js.native
    /**
      * Defines a processing function for the jobs placed into a given Queue.
      *
      * The callback is called everytime a job is placed in the queue.
      * It is passed an instance of the job as first argument.
      *
      * If the callback signature contains the second optional done argument,
      * the callback will be passed a done callback to be called after the job has been completed.
      * The done callback can be called with an Error instance, to signal that the job did not complete successfully,
      * or with a result as second argument (e.g.: done(null, result);) when the job is successful.
      * Errors will be passed as a second argument to the "failed" event; results, as a second argument to the "completed" event.
      *
      * If, however, the callback signature does not contain the done argument,
      * a promise must be returned to signal job completion.
      * If the promise is rejected, the error will be passed as a second argument to the "failed" event.
      * If it is resolved, its value will be the "completed" event's second argument.
      *
      * @param concurrency Bull will then call your handler in parallel respecting this maximum value.
      */
    def process(concurrency: Double, callback: ProcessCallbackFunction[T]): js.Promise[Unit] = js.native
    def process(concurrency: Double, callback: ProcessPromiseFunction[T]): js.Promise[Unit] = js.native
    def process(name: String, callback: String): js.Promise[Unit] = js.native
    /**
      * Defines a processing function for the jobs placed into a given Queue.
      *
      * The callback is called everytime a job is placed in the queue.
      * It is passed an instance of the job as first argument.
      *
      * If the callback signature contains the second optional done argument,
      * the callback will be passed a done callback to be called after the job has been completed.
      * The done callback can be called with an Error instance, to signal that the job did not complete successfully,
      * or with a result as second argument (e.g.: done(null, result);) when the job is successful.
      * Errors will be passed as a second argument to the "failed" event; results, as a second argument to the "completed" event.
      *
      * If, however, the callback signature does not contain the done argument,
      * a promise must be returned to signal job completion.
      * If the promise is rejected, the error will be passed as a second argument to the "failed" event.
      * If it is resolved, its value will be the "completed" event's second argument.
      *
      * @param name Bull will only call the handler if the job name matches
      */
    def process(name: String, callback: ProcessCallbackFunction[T]): js.Promise[Unit] = js.native
    def process(name: String, callback: ProcessPromiseFunction[T]): js.Promise[Unit] = js.native
    def process(name: String, concurrency: Double, callback: String): js.Promise[Unit] = js.native
    /**
      * Defines a processing function for the jobs placed into a given Queue.
      *
      * The callback is called everytime a job is placed in the queue.
      * It is passed an instance of the job as first argument.
      *
      * If the callback signature contains the second optional done argument,
      * the callback will be passed a done callback to be called after the job has been completed.
      * The done callback can be called with an Error instance, to signal that the job did not complete successfully,
      * or with a result as second argument (e.g.: done(null, result);) when the job is successful.
      * Errors will be passed as a second argument to the "failed" event; results, as a second argument to the "completed" event.
      *
      * If, however, the callback signature does not contain the done argument,
      * a promise must be returned to signal job completion.
      * If the promise is rejected, the error will be passed as a second argument to the "failed" event.
      * If it is resolved, its value will be the "completed" event's second argument.
      *
      * @param name Bull will only call the handler if the job name matches
      * @param concurrency Bull will then call your handler in parallel respecting this maximum value.
      */
    def process(name: String, concurrency: Double, callback: ProcessCallbackFunction[T]): js.Promise[Unit] = js.native
    def process(name: String, concurrency: Double, callback: ProcessPromiseFunction[T]): js.Promise[Unit] = js.native
    
    /**
      * Removes all the jobs which jobId matches the given pattern. The pattern must follow redis glob-style pattern
      * (syntax)[redis.io/commands/keys]
      */
    def removeJobs(pattern: String): js.Promise[Unit] = js.native
    
    /**
      * Removes a given repeatable job. The RepeatOptions and JobId needs to be the same as the ones
      * used for the job when it was added.
      *
      * name: The name of the to be removed job
      */
    def removeRepeatable(name: String, repeat: (CronRepeatOptions | EveryRepeatOptions) with typings.bull.anon.JobId): js.Promise[Unit] = js.native
    /**
      * Removes a given repeatable job. The RepeatOptions and JobId needs to be the same as the ones
      * used for the job when it was added.
      */
    def removeRepeatable(repeat: (CronRepeatOptions | EveryRepeatOptions) with typings.bull.anon.JobId): js.Promise[Unit] = js.native
    
    /**
      * Removes a given repeatable job by key.
      */
    def removeRepeatableByKey(key: String): js.Promise[Unit] = js.native
    
    /**
      * Returns a promise that resolves when the queue is resumed after being paused.
      *
      * The resume can be either local or global. If global, all workers in all queue instances for a given queue
      * will be resumed. If local, only this worker will be resumed. Note that resuming a queue globally will not
      * resume workers that have been paused locally; for those, resume(true) must be called directly on their
      * instances.
      *
      * Resuming a queue that is not paused does nothing.
      */
    def resume(): js.Promise[Unit] = js.native
    def resume(isLocal: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Set clientName to Redis.client
      */
    def setWorkerName(): js.Promise[_] = js.native
    
    /**
      * Returns the queue specific key.
      */
    def toKey(queueType: String): String = js.native
    
    /**
      * Returns a promise that resolves when active jobs are finished
      */
    def whenCurrentJobsFinished(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait QueueOptions extends StObject {
    
    /**
      * When specified, the `Queue` will use this function to create new `ioredis` client connections.
      * This is useful if you want to re-use connections or connect to a Redis cluster.
      */
    var createClient: js.UndefOr[
        js.Function2[
          /* type */ client | subscriber | bclient, 
          /* redisOpts */ js.UndefOr[RedisOptions], 
          Redis | Cluster
        ]
      ] = js.native
    
    var defaultJobOptions: js.UndefOr[JobOptions] = js.native
    
    var limiter: js.UndefOr[RateLimiter] = js.native
    
    /**
      * Prefix to use for all redis keys
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Options passed directly to the `ioredis` constructor
      */
    var redis: js.UndefOr[RedisOptions | String] = js.native
    
    var settings: js.UndefOr[AdvancedSettings] = js.native
  }
  object QueueOptions {
    
    @scala.inline
    def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    @scala.inline
    implicit class QueueOptionsMutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateClient(
        value: (/* type */ client | subscriber | bclient, /* redisOpts */ js.UndefOr[RedisOptions]) => Redis | Cluster
      ): Self = StObject.set(x, "createClient", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateClientUndefined: Self = StObject.set(x, "createClient", js.undefined)
      
      @scala.inline
      def setDefaultJobOptions(value: JobOptions): Self = StObject.set(x, "defaultJobOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultJobOptionsUndefined: Self = StObject.set(x, "defaultJobOptions", js.undefined)
      
      @scala.inline
      def setLimiter(value: RateLimiter): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRedis(value: RedisOptions | String): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
      
      @scala.inline
      def setSettings(value: AdvancedSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  @js.native
  trait RateLimiter extends StObject {
    
    /** When jobs get rate limited, they stay in the waiting queue and are not moved to the delayed queue */
    var bounceBack: js.UndefOr[Boolean] = js.native
    
    /** Per duration in milliseconds */
    var duration: Double = js.native
    
    /** Groups jobs with the specified key from the data object passed to the Queue#add ex. "network.handle" */
    var groupKey: js.UndefOr[String] = js.native
    
    /** Max numbers of jobs processed */
    var max: Double = js.native
  }
  object RateLimiter {
    
    @scala.inline
    def apply(duration: Double, max: Double): RateLimiter = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimiter]
    }
    
    @scala.inline
    implicit class RateLimiterMutableBuilder[Self <: RateLimiter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounceBack(value: Boolean): Self = StObject.set(x, "bounceBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceBackUndefined: Self = StObject.set(x, "bounceBack", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  type RemovedEventCallback[T] = js.Function1[/* job */ Job[T], Unit]
  
  @js.native
  trait RepeatOptions extends StObject {
    
    /**
      * End date when the repeat job should stop repeating
      */
    var endDate: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * Number of times the job should repeat at max.
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * Timezone
      */
    var tz: js.UndefOr[String] = js.native
  }
  object RepeatOptions {
    
    @scala.inline
    def apply(): RepeatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepeatOptions]
    }
    
    @scala.inline
    implicit class RepeatOptionsMutableBuilder[Self <: RepeatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndDate(value: Date | String | Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
    }
  }
  
  type StalledEventCallback[T] = js.Function1[/* job */ Job[T], Unit]
  
  type WaitingEventCallback = js.Function1[/* jobId */ JobId, Unit]
}
