package typings.beanstalkdWorker

import typings.beanstalkd.mod.BeanstalkdJobState
import typings.beanstalkd.mod.BeanstalkdJobStats
import typings.beanstalkd.mod.default
import typings.beanstalkdWorker.beanstalkdWorkerNumbers.`1`
import typings.beanstalkdWorker.beanstalkdWorkerStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("beanstalkd-worker", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BeanstalkdWorker {
    def this(host: String) = this()
    def this(host: String, port: Double) = this()
    def this(host: Unit, port: Double) = this()
    def this(host: String, port: Double, options: js.Object) = this()
    def this(host: String, port: Unit, options: js.Object) = this()
    def this(host: Unit, port: Double, options: js.Object) = this()
    def this(host: Unit, port: Unit, options: js.Object) = this()
  }
  
  trait BeanstalkdHandleBackoff extends StObject {
    
    /** Multiple backoff by N each try. */
    var exponential: js.UndefOr[Double] = js.undefined
    
    /** Initial time to wait (in milliseconds). */
    var initial: js.UndefOr[Double] = js.undefined
  }
  object BeanstalkdHandleBackoff {
    
    inline def apply(): BeanstalkdHandleBackoff = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeanstalkdHandleBackoff]
    }
    
    extension [Self <: BeanstalkdHandleBackoff](x: Self) {
      
      inline def setExponential(value: Double): Self = StObject.set(x, "exponential", value.asInstanceOf[js.Any])
      
      inline def setExponentialUndefined: Self = StObject.set(x, "exponential", js.undefined)
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    }
  }
  
  trait BeanstalkdHandleOptions extends StObject {
    
    /** Backoff handling options */
    var backoff: js.UndefOr[BeanstalkdHandleBackoff] = js.undefined
    
    /** Total amount of tries including the first one. */
    var tries: js.UndefOr[Double] = js.undefined
    
    /** Total number of watcher handling this Tube simultaneously. */
    var width: js.UndefOr[Double] = js.undefined
  }
  object BeanstalkdHandleOptions {
    
    inline def apply(): BeanstalkdHandleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeanstalkdHandleOptions]
    }
    
    extension [Self <: BeanstalkdHandleOptions](x: Self) {
      
      inline def setBackoff(value: BeanstalkdHandleBackoff): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
      
      inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait BeanstalkdSpawnOptions extends StObject {
    
    /** The delay before making the new Job visible (in milliseconds). */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** The priority for the new Job. */
    var priority: js.UndefOr[Double] = js.undefined
    
    /** The timeout for the new Job (in milliseconds). */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BeanstalkdSpawnOptions {
    
    inline def apply(): BeanstalkdSpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeanstalkdSpawnOptions]
    }
    
    extension [Self <: BeanstalkdSpawnOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait BeanstalkdWorker extends StObject {
    
    /**
      * Create or reuse a connection to Beanstalkd with given id.
      *
      * @param id Id for the connection.
      */
    def connection(id: String): js.Promise[default] = js.native
    
    /**
      * Wait for the given job on specifed tube to be done.
      * If provided, calls the `onPoll` handler on each check (500ms).
      *
      * @param tube The tube that contains the job.
      * @param jobId The job id to wait for.
      * @param onPoll The poll handler called on each check.
      */
    def done(tube: String, jobId: String): js.Promise[Unit] = js.native
    def done(tube: String, jobId: String, onPoll: JobPollHandler): js.Promise[Unit] = js.native
    
    /**
      * Handle jobs from given Tube.
      *
      * @param tube The tube to handle jobs on.
      * @param handler The callback for handling jobs.
      * @param options The options for the handler.
      */
    def handle(tube: String, handler: TubeHandler): Unit = js.native
    def handle(tube: String, handler: TubeHandler, options: BeanstalkdHandleOptions): Unit = js.native
    
    var host: js.UndefOr[String] = js.native
    
    /**
      * Creates a new Job representation.
      *
      * @param tube The tube to create job for.
      * @param jobId The job id for the new job.
      */
    def job(tube: String, jobId: String): Job = js.native
    
    var options: js.UndefOr[js.Object] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var running: Boolean = js.native
    
    /**
      * Spawn a new Job on given Tube.
      *
      * @param tube The tube to spawn new job on.
      * @param payload The message payload.
      * @param options The options for the new job.
      */
    def spawn(tube: String, payload: js.Object): js.Promise[Job] = js.native
    def spawn(tube: String, payload: js.Object, options: BeanstalkdSpawnOptions): js.Promise[Job] = js.native
    
    /** Enable handlers and start processing jobs, make sure handlers are setup before calling start. */
    def start(): Unit = js.native
    
    /** Start handling configured tubes. */
    def startTubes(): Unit = js.native
    
    /** Stop the Worker process and all associated tubes. */
    def stop(): js.Promise[Unit] = js.native
    
    /** Stop handling the configured tubes. */
    def stopTubes(): js.Promise[Unit] = js.native
    
    /**
      * Get or create a Tube.
      *
      * @param name The Tube name to get or create.
      */
    def tube(name: String): Tube = js.native
    
    /**
      * Checks if the given tube is currently working.
      *
      * @param tube The tube to check if currently working.
      */
    def working(tube: String): Boolean = js.native
  }
  
  @js.native
  trait Job extends StObject {
    
    /**
      * Executes given command on the Tube that contains the Job.
      *
      * @param command The command to execute.
      * @param args The arguments for the command.
      */
    def command(command: String, args: Any*): js.Promise[Any] = js.native
    
    /**
      * Wait for this job to be done.
      * If provided, calls the `onPoll` handler on each check (500ms).
      *
      * @param onPoll The poll handler called on each check.
      */
    def done(): js.Promise[Unit] = js.native
    def done(onPoll: JobPollHandler): js.Promise[Unit] = js.native
    
    var id: String = js.native
    
    /**
      * Requests stats for this job.
      * If `catchNotFound` is true, and `NOT_FOUND` error is thrown, returns null.
      *
      * @param catchNotFound Whether to catch `NOT_FOUND` error and return null.
      */
    def stats(): js.Promise[BeanstalkdJobStats] = js.native
    def stats(catchNotFound: Boolean): js.Promise[BeanstalkdJobStats] = js.native
    
    /** Query current status for this Job. */
    def status(): js.Promise[JobStatus] = js.native
    
    var tube: String = js.native
  }
  
  type JobPollHandler = js.Function1[/* state */ BeanstalkdJobState, Any]
  
  type JobStatus = BeanstalkdJobState | success
  
  @js.native
  trait Tube extends StObject {
    
    /**
      * Executes given command on this Tube.
      *
      * @param command The command to execute.
      * @param args The arguments for the command.
      */
    def command(command: String, args: Any*): js.Promise[Any] = js.native
    
    /**
      * Gets or creates a new Client for given id.
      *
      * @param id The id for the connection.
      */
    def connection(id: String): js.Promise[default] = js.native
    
    /**
      * Handle jobs from this Tube.
      *
      * @param handler The callback for handling jobs.
      * @param options The options for the handler.
      */
    def handle(handler: TubeHandler): Unit = js.native
    def handle(handler: TubeHandler, options: BeanstalkdHandleOptions): Unit = js.native
    
    /** Start watchers for this Tube. */
    def start(): Unit = js.native
    
    /** Stop watching for new Job on this Tube. */
    def stop(): js.Promise[Unit] = js.native
    
    /** Check whether this Tube is currently working. */
    def working(): Boolean = js.native
  }
  
  type TubeHandler = js.ThisFunction1[/* this */ WatcherJob, /* payload */ js.UndefOr[Any], Any]
  
  @js.native
  trait WatcherJob
    extends StObject
       with Job {
    
    /**
      * Advanced use only! Mainly internal usage.
      * Cancel the configured timeout.
      */
    def cancelTimeout(): Unit = js.native
    
    /**
      * Spawn a new child Job on given Tube and make this Job to wait for its resolution.
      * This automatically touch this Job during the wait time.
      *
      * @param tube The tube to spawn new job on.
      * @param payload The message payload.
      * @param options The options for the new job.
      */
    def child(tube: String, payload: js.Object): js.Promise[Unit] = js.native
    def child(tube: String, payload: js.Object, options: BeanstalkdSpawnOptions): js.Promise[Unit] = js.native
    
    /**
      * Puts current job back in queue with delay (in milliseconds), does not affect retries counter.
      *
      * @param delay The time to delay (in milliseconds).
      * @param exponent The exponent to for calculating the final delay (delay^exponent).
      */
    def delay(): js.Promise[`1`] = js.native
    def delay(delay: Double): js.Promise[`1`] = js.native
    def delay(delay: Double, exponent: Double): js.Promise[`1`] = js.native
    def delay(delay: Unit, exponent: Double): js.Promise[`1`] = js.native
    
    /**
      * Advanced use only! Mainly internal usage.
      * Reset the configured timeout.
      */
    def refreshTimeout(): Unit = js.native
    
    /**
      * Spawn a new Job on given Tube.
      *
      * @param tube The tube to spawn new job on.
      * @param payload The message payload.
      * @param options The options for the new job.
      */
    def spawn(tube: String, payload: js.Object): js.Promise[Job] = js.native
    def spawn(tube: String, payload: js.Object, options: BeanstalkdSpawnOptions): js.Promise[Job] = js.native
    
    /**
      * Initialize a timeout with given delay for this Job.
      *
      * @param delay The delay to wait before rejecting the Promise.
      */
    def timeout(delay: Double): js.Promise[scala.Nothing] = js.native
    /**
      * Initialize a timeout with given delay for specified action.
      *
      * @param delay The delay to wait before rejecting the Promise.
      * @param action The Promise to check for timeout resolution.
      */
    def timeout[T](delay: Double, action: T): js.Promise[T] = js.native
    def timeout[T](delay: Double, action: js.Promise[T]): js.Promise[T] = js.native
    
    /** Inform the server that the client is still processing this job, thus requesting more time to work on it. */
    def touch(): Unit = js.native
    
    /**
      * Wait for the given job on specifed tube to be done.
      * This automatically touch this Job during the wait time.
      *
      * @param tube The tube that contains the job.
      * @param jobId The job id to wait for.
      */
    def wait(tube: String, jobId: String): js.Promise[Unit] = js.native
  }
}
