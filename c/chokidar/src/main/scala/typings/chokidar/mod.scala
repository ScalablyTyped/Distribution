package typings.chokidar

import org.scalablytyped.runtime.StringDictionary
import typings.anymatch.mod.AnymatchMatcher
import typings.anymatch.mod.AnymatchPattern
import typings.chokidar.chokidarStrings.add
import typings.chokidar.chokidarStrings.addDir
import typings.chokidar.chokidarStrings.all
import typings.chokidar.chokidarStrings.change
import typings.chokidar.chokidarStrings.error
import typings.chokidar.chokidarStrings.raw
import typings.chokidar.chokidarStrings.ready
import typings.chokidar.chokidarStrings.unlink
import typings.chokidar.chokidarStrings.unlinkDir
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chokidar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chokidar", "FSWatcher")
  @js.native
  /**
    * Constructs a new FSWatcher instance with optional WatchOptions parameter.
    */
  open class FSWatcher ()
    extends EventEmitter
       with typings.node.fsMod.FSWatcher {
    def this(options: WatchOptions) = this()
    
    /**
      * Add files, directories, or glob patterns for tracking. Takes an array of strings or just one
      * string.
      */
    def add(paths: String): this.type = js.native
    def add(paths: js.Array[String]): this.type = js.native
    
    /**
      * Alias for `emitter.on(eventName, listener)`.
      * @since v0.1.26
      */
    /* InferMemberOverrides */
    override def addListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Returns an object representing all the paths on the file system being watched by this
      * `FSWatcher` instance. The object's keys are all the directories (using absolute paths unless
      * the `cwd` option was used), and the values are arrays of the names of the items contained in
      * each directory.
      */
    def getWatched(): StringDictionary[js.Array[String]] = js.native
    
    /**
      * Adds the `listener` function to the end of the listeners array for the
      * event named `eventName`. No checks are made to see if the `listener` has
      * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
      * times.
      *
      * ```js
      * server.on('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      *
      * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
      * event listener to the beginning of the listeners array.
      *
      * ```js
      * const myEE = new EventEmitter();
      * myEE.on('foo', () => console.log('a'));
      * myEE.prependListener('foo', () => console.log('b'));
      * myEE.emit('foo');
      * // Prints:
      * //   b
      * //   a
      * ```
      * @since v0.1.101
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    /* InferMemberOverrides */
    override def on(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: unlink | unlinkDir, listener: js.Function1[/* path */ String, Unit]): this.type = js.native
    def on(
      event: add | addDir | change,
      listener: js.Function2[/* path */ String, /* stats */ js.UndefOr[Stats], Unit]
    ): this.type = js.native
    def on(
      event: all,
      listener: js.Function3[
          /* eventName */ add | addDir | change | unlink | unlinkDir, 
          /* path */ String, 
          /* stats */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    /**
      * Error occurred
      */
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    /**
      * Exposes the native Node `fs.FSWatcher events`
      */
    @JSName("on")
    def on_raw(
      event: raw,
      listener: js.Function3[/* eventName */ String, /* path */ String, /* details */ Any, Unit]
    ): this.type = js.native
    /**
      * Fires when the initial scan is complete
      */
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Adds a **one-time**`listener` function for the event named `eventName`. The
      * next time `eventName` is triggered, this listener is removed and then invoked.
      *
      * ```js
      * server.once('connection', (stream) => {
      *   console.log('Ah, we have our first user!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      *
      * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
      * event listener to the beginning of the listeners array.
      *
      * ```js
      * const myEE = new EventEmitter();
      * myEE.once('foo', () => console.log('a'));
      * myEE.prependOnceListener('foo', () => console.log('b'));
      * myEE.emit('foo');
      * // Prints:
      * //   b
      * //   a
      * ```
      * @since v0.3.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    /* InferMemberOverrides */
    override def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    var options: WatchOptions = js.native
    
    /**
      * Adds the `listener` function to the _beginning_ of the listeners array for the
      * event named `eventName`. No checks are made to see if the `listener` has
      * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
      * times.
      *
      * ```js
      * server.prependListener('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v6.0.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    /* InferMemberOverrides */
    override def prependListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a **one-time**`listener` function for the event named `eventName` to the _beginning_ of the listeners array. The next time `eventName` is triggered, this
      * listener is removed, and then invoked.
      *
      * ```js
      * server.prependOnceListener('connection', (stream) => {
      *   console.log('Ah, we have our first user!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v6.0.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    /* InferMemberOverrides */
    override def prependOnceListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Stop watching files, directories, or glob patterns. Takes an array of strings or just one
      * string.
      */
    def unwatch(paths: String): this.type = js.native
    def unwatch(paths: js.Array[String]): this.type = js.native
  }
  
  inline def watch(paths: String): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(paths.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
  inline def watch(paths: String, options: WatchOptions): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(paths: js.Array[String]): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(paths.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
  inline def watch(paths: js.Array[String], options: WatchOptions): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  
  trait AwaitWriteFinishOptions extends StObject {
    
    /**
      * File size polling interval.
      */
    var pollInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Amount of time in milliseconds for a file size to remain constant before emitting its event.
      */
    var stabilityThreshold: js.UndefOr[Double] = js.undefined
  }
  object AwaitWriteFinishOptions {
    
    inline def apply(): AwaitWriteFinishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwaitWriteFinishOptions]
    }
    
    extension [Self <: AwaitWriteFinishOptions](x: Self) {
      
      inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
      
      inline def setStabilityThreshold(value: Double): Self = StObject.set(x, "stabilityThreshold", value.asInstanceOf[js.Any])
      
      inline def setStabilityThresholdUndefined: Self = StObject.set(x, "stabilityThreshold", js.undefined)
    }
  }
  
  trait WatchOptions extends StObject {
    
    /**
      * If relying upon the [`fs.Stats`](https://nodejs.org/api/fs.html#fs_class_fs_stats) object that
      * may get passed with `add`, `addDir`, and `change` events, set this to `true` to ensure it is
      * provided even in cases where it wasn't already available from the underlying watch events.
      */
    var alwaysStat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `true` if `useFsEvents` and `usePolling` are `false`). Automatically filters out artifacts
      * that occur when using editors that use "atomic writes" instead of writing directly to the
      * source file. If a file is re-added within 100 ms of being deleted, Chokidar emits a `change`
      * event rather than `unlink` then `add`. If the default of 100 ms does not work well for you,
      * you can override it by setting `atomic` to a custom value, in milliseconds.
      */
    var atomic: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * can be set to an object in order to adjust timing params:
      */
    var awaitWriteFinish: js.UndefOr[AwaitWriteFinishOptions | Boolean] = js.undefined
    
    /**
      * Interval of file system polling for binary files. ([see list of binary extensions](https://gi
      * thub.com/sindresorhus/binary-extensions/blob/master/binary-extensions.json))
      */
    var binaryInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * The base directory from which watch `paths` are to be derived. Paths emitted with events will
      * be relative to this.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * If set, limits how many levels of subdirectories will be traversed.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      *  If set to true then the strings passed to .watch() and .add() are treated as literal path
      *  names, even if they look like globs. Default: false.
      */
    var disableGlobbing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `false`, only the symlinks themselves will be watched for changes instead of following
      * the link references and bubbling events through the link's path.
      */
    var followSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `false` then `add`/`addDir` events are also emitted for matching paths while
      * instantiating the watching as chokidar discovers these file paths (before the `ready` event).
      */
    var ignoreInitial: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  Indicates whether to watch files that don't have read permissions if possible. If watching
      *  fails due to `EPERM` or `EACCES` with this set to `true`, the errors will be suppressed
      *  silently.
      */
    var ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ([anymatch](https://github.com/micromatch/anymatch)-compatible definition) Defines files/paths to
      * be ignored. The whole relative or absolute path is tested, not just filename. If a function
      * with two arguments is provided, it gets called twice per path - once with a single argument
      * (the path), second time with two arguments (the path and the
      * [`fs.Stats`](https://nodejs.org/api/fs.html#fs_class_fs_stats) object of that path).
      */
    var ignored: js.UndefOr[AnymatchMatcher] = js.undefined
    
    /**
      * Interval of file system polling.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates whether the process should continue to run as long as files are being watched. If
      * set to `false` when using `fsevents` to watch, no more events will be emitted after `ready`,
      * even if the process continues to run.
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use the `fsevents` watching interface if available. When set to `true` explicitly
      * and `fsevents` is available this supercedes the `usePolling` setting. When set to `false` on
      * OS X, `usePolling: true` becomes the default.
      */
    var useFsEvents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use fs.watchFile (backed by polling), or fs.watch. If polling leads to high CPU
      * utilization, consider setting this to `false`. It is typically necessary to **set this to
      * `true` to successfully watch files over a network**, and it may be necessary to successfully
      * watch files in other non-standard situations. Setting to `true` explicitly on OS X overrides
      * the `useFsEvents` default.
      */
    var usePolling: js.UndefOr[Boolean] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    extension [Self <: WatchOptions](x: Self) {
      
      inline def setAlwaysStat(value: Boolean): Self = StObject.set(x, "alwaysStat", value.asInstanceOf[js.Any])
      
      inline def setAlwaysStatUndefined: Self = StObject.set(x, "alwaysStat", js.undefined)
      
      inline def setAtomic(value: Boolean | Double): Self = StObject.set(x, "atomic", value.asInstanceOf[js.Any])
      
      inline def setAtomicUndefined: Self = StObject.set(x, "atomic", js.undefined)
      
      inline def setAwaitWriteFinish(value: AwaitWriteFinishOptions | Boolean): Self = StObject.set(x, "awaitWriteFinish", value.asInstanceOf[js.Any])
      
      inline def setAwaitWriteFinishUndefined: Self = StObject.set(x, "awaitWriteFinish", js.undefined)
      
      inline def setBinaryInterval(value: Double): Self = StObject.set(x, "binaryInterval", value.asInstanceOf[js.Any])
      
      inline def setBinaryIntervalUndefined: Self = StObject.set(x, "binaryInterval", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setDisableGlobbing(value: Boolean): Self = StObject.set(x, "disableGlobbing", value.asInstanceOf[js.Any])
      
      inline def setDisableGlobbingUndefined: Self = StObject.set(x, "disableGlobbing", js.undefined)
      
      inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
      
      inline def setIgnoreInitial(value: Boolean): Self = StObject.set(x, "ignoreInitial", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInitialUndefined: Self = StObject.set(x, "ignoreInitial", js.undefined)
      
      inline def setIgnorePermissionErrors(value: Boolean): Self = StObject.set(x, "ignorePermissionErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnorePermissionErrorsUndefined: Self = StObject.set(x, "ignorePermissionErrors", js.undefined)
      
      inline def setIgnored(value: AnymatchMatcher): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFunction1(value: /* testString */ String => Boolean): Self = StObject.set(x, "ignored", js.Any.fromFunction1(value))
      
      inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      inline def setIgnoredVarargs(value: AnymatchPattern*): Self = StObject.set(x, "ignored", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      
      inline def setUseFsEvents(value: Boolean): Self = StObject.set(x, "useFsEvents", value.asInstanceOf[js.Any])
      
      inline def setUseFsEventsUndefined: Self = StObject.set(x, "useFsEvents", js.undefined)
      
      inline def setUsePolling(value: Boolean): Self = StObject.set(x, "usePolling", value.asInstanceOf[js.Any])
      
      inline def setUsePollingUndefined: Self = StObject.set(x, "usePolling", js.undefined)
    }
  }
}
