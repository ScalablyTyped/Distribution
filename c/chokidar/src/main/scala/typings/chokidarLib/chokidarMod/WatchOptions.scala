package typings
package chokidarLib.chokidarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WatchOptions extends js.Object {
  /**
       * If relying upon the [`fs.Stats`](http://nodejs.org/api/fs.html#fs_class_fs_stats) object that
       * may get passed with `add`, `addDir`, and `change` events, set this to `true` to ensure it is
       * provided even in cases where it wasn't already available from the underlying watch events.
       */
  var alwaysStat: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * `true` if `useFsEvents` and `usePolling` are `false`). Automatically filters out artifacts
       * that occur when using editors that use "atomic writes" instead of writing directly to the
       * source file. If a file is re-added within 100 ms of being deleted, Chokidar emits a `change`
       * event rather than `unlink` then `add`. If the default of 100 ms does not work well for you,
       * you can override it by setting `atomic` to a custom value, in milliseconds.
       */
  var atomic: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
       * can be set to an object in order to adjust timing params:
       */
  var awaitWriteFinish: js.UndefOr[AwaitWriteFinishOptions | scala.Boolean] = js.undefined
  /**
       * Interval of file system polling for binary files. ([see list of binary extensions](https://gi
       * thub.com/sindresorhus/binary-extensions/blob/master/binary-extensions.json))
       */
  var binaryInterval: js.UndefOr[scala.Double] = js.undefined
  /**
       * The base directory from which watch `paths` are to be derived. Paths emitted with events will
       * be relative to this.
       */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If set, limits how many levels of subdirectories will be traversed.
       */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
       *  If set to true then the strings passed to .watch() and .add() are treated as literal path
       *  names, even if they look like globs. Default: false.
       */
  var disableGlobbing: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When `false`, only the symlinks themselves will be watched for changes instead of following
       * the link references and bubbling events through the link's path.
       */
  var followSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set to `false` then `add`/`addDir` events are also emitted for matching paths while
       * instantiating the watching as chokidar discovers these file paths (before the `ready` event).
       */
  var ignoreInitial: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  Indicates whether to watch files that don't have read permissions if possible. If watching
       *  fails due to `EPERM` or `EACCES` with this set to `true`, the errors will be suppressed
       *  silently.
       */
  var ignorePermissionErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * ([anymatch](https://github.com/es128/anymatch)-compatible definition) Defines files/paths to
       * be ignored. The whole relative or absolute path is tested, not just filename. If a function
       * with two arguments is provided, it gets called twice per path - once with a single argument
       * (the path), second time with two arguments (the path and the
       * [`fs.Stats`](http://nodejs.org/api/fs.html#fs_class_fs_stats) object of that path).
       */
  var ignored: js.UndefOr[js.Any] = js.undefined
  /**
       * Interval of file system polling.
       */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
       * Indicates whether the process should continue to run as long as files are being watched. If
       * set to `false` when using `fsevents` to watch, no more events will be emitted after `ready`,
       * even if the process continues to run.
       */
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to use the `fsevents` watching interface if available. When set to `true` explicitly
       * and `fsevents` is available this supercedes the `usePolling` setting. When set to `false` on
       * OS X, `usePolling: true` becomes the default.
       */
  var useFsEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to use fs.watchFile (backed by polling), or fs.watch. If polling leads to high CPU
       * utilization, consider setting this to `false`. It is typically necessary to **set this to
       * `true` to successfully watch files over a network**, and it may be necessary to successfully
       * watch files in other non-standard situations. Setting to `true` explicitly on OS X overrides
       * the `useFsEvents` default.
       */
  var usePolling: js.UndefOr[scala.Boolean] = js.undefined
}

