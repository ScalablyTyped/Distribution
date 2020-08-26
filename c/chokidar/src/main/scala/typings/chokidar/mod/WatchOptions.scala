package typings.chokidar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions extends js.Object {
  /**
    * If relying upon the [`fs.Stats`](https://nodejs.org/api/fs.html#fs_class_fs_stats) object that
    * may get passed with `add`, `addDir`, and `change` events, set this to `true` to ensure it is
    * provided even in cases where it wasn't already available from the underlying watch events.
    */
  var alwaysStat: js.UndefOr[Boolean] = js.native
  /**
    * `true` if `useFsEvents` and `usePolling` are `false`). Automatically filters out artifacts
    * that occur when using editors that use "atomic writes" instead of writing directly to the
    * source file. If a file is re-added within 100 ms of being deleted, Chokidar emits a `change`
    * event rather than `unlink` then `add`. If the default of 100 ms does not work well for you,
    * you can override it by setting `atomic` to a custom value, in milliseconds.
    */
  var atomic: js.UndefOr[Boolean | Double] = js.native
  /**
    * can be set to an object in order to adjust timing params:
    */
  var awaitWriteFinish: js.UndefOr[AwaitWriteFinishOptions | Boolean] = js.native
  /**
    * Interval of file system polling for binary files. ([see list of binary extensions](https://gi
    * thub.com/sindresorhus/binary-extensions/blob/master/binary-extensions.json))
    */
  var binaryInterval: js.UndefOr[Double] = js.native
  /**
    * The base directory from which watch `paths` are to be derived. Paths emitted with events will
    * be relative to this.
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * If set, limits how many levels of subdirectories will be traversed.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    *  If set to true then the strings passed to .watch() and .add() are treated as literal path
    *  names, even if they look like globs. Default: false.
    */
  var disableGlobbing: js.UndefOr[Boolean] = js.native
  /**
    * When `false`, only the symlinks themselves will be watched for changes instead of following
    * the link references and bubbling events through the link's path.
    */
  var followSymlinks: js.UndefOr[Boolean] = js.native
  /**
    * If set to `false` then `add`/`addDir` events are also emitted for matching paths while
    * instantiating the watching as chokidar discovers these file paths (before the `ready` event).
    */
  var ignoreInitial: js.UndefOr[Boolean] = js.native
  /**
    *  Indicates whether to watch files that don't have read permissions if possible. If watching
    *  fails due to `EPERM` or `EACCES` with this set to `true`, the errors will be suppressed
    *  silently.
    */
  var ignorePermissionErrors: js.UndefOr[Boolean] = js.native
  /**
    * ([anymatch](https://github.com/micromatch/anymatch)-compatible definition) Defines files/paths to
    * be ignored. The whole relative or absolute path is tested, not just filename. If a function
    * with two arguments is provided, it gets called twice per path - once with a single argument
    * (the path), second time with two arguments (the path and the
    * [`fs.Stats`](https://nodejs.org/api/fs.html#fs_class_fs_stats) object of that path).
    */
  var ignored: js.UndefOr[js.Any] = js.native
  /**
    * Interval of file system polling.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the process should continue to run as long as files are being watched. If
    * set to `false` when using `fsevents` to watch, no more events will be emitted after `ready`,
    * even if the process continues to run.
    */
  var persistent: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the `fsevents` watching interface if available. When set to `true` explicitly
    * and `fsevents` is available this supercedes the `usePolling` setting. When set to `false` on
    * OS X, `usePolling: true` becomes the default.
    */
  var useFsEvents: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use fs.watchFile (backed by polling), or fs.watch. If polling leads to high CPU
    * utilization, consider setting this to `false`. It is typically necessary to **set this to
    * `true` to successfully watch files over a network**, and it may be necessary to successfully
    * watch files in other non-standard situations. Setting to `true` explicitly on OS X overrides
    * the `useFsEvents` default.
    */
  var usePolling: js.UndefOr[Boolean] = js.native
}

object WatchOptions {
  @scala.inline
  def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlwaysStat(value: Boolean): Self = this.set("alwaysStat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysStat: Self = this.set("alwaysStat", js.undefined)
    @scala.inline
    def setAtomic(value: Boolean | Double): Self = this.set("atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtomic: Self = this.set("atomic", js.undefined)
    @scala.inline
    def setAwaitWriteFinish(value: AwaitWriteFinishOptions | Boolean): Self = this.set("awaitWriteFinish", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitWriteFinish: Self = this.set("awaitWriteFinish", js.undefined)
    @scala.inline
    def setBinaryInterval(value: Double): Self = this.set("binaryInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryInterval: Self = this.set("binaryInterval", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setDisableGlobbing(value: Boolean): Self = this.set("disableGlobbing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableGlobbing: Self = this.set("disableGlobbing", js.undefined)
    @scala.inline
    def setFollowSymlinks(value: Boolean): Self = this.set("followSymlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowSymlinks: Self = this.set("followSymlinks", js.undefined)
    @scala.inline
    def setIgnoreInitial(value: Boolean): Self = this.set("ignoreInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreInitial: Self = this.set("ignoreInitial", js.undefined)
    @scala.inline
    def setIgnorePermissionErrors(value: Boolean): Self = this.set("ignorePermissionErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePermissionErrors: Self = this.set("ignorePermissionErrors", js.undefined)
    @scala.inline
    def setIgnored(value: js.Any): Self = this.set("ignored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
    @scala.inline
    def setUseFsEvents(value: Boolean): Self = this.set("useFsEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFsEvents: Self = this.set("useFsEvents", js.undefined)
    @scala.inline
    def setUsePolling(value: Boolean): Self = this.set("usePolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePolling: Self = this.set("usePolling", js.undefined)
  }
  
}

