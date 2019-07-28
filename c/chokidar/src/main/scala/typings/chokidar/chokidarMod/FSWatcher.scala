package typings.chokidar.chokidarMod

import org.scalablytyped.runtime.StringDictionary
import typings.chokidar.chokidarStrings.add
import typings.chokidar.chokidarStrings.addDir
import typings.chokidar.chokidarStrings.all
import typings.chokidar.chokidarStrings.change
import typings.chokidar.chokidarStrings.error
import typings.chokidar.chokidarStrings.raw
import typings.chokidar.chokidarStrings.ready
import typings.chokidar.chokidarStrings.unlink
import typings.chokidar.chokidarStrings.unlinkDir
import typings.node.fsMod.Stats
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chokidar", "FSWatcher")
@js.native
/**
  * Constructs a new FSWatcher instance with optional WatchOptions parameter.
  */
class FSWatcher ()
  extends typings.node.fsMod.FSWatcher {
  def this(options: WatchOptions) = this()
  var options: WatchOptions = js.native
  /**
    * Add files, directories, or glob patterns for tracking. Takes an array of strings or just one
    * string.
    */
  def add(paths: String): Unit = js.native
  def add(paths: js.Array[String]): Unit = js.native
  /**
    * Returns an object representing all the paths on the file system being watched by this
    * `FSWatcher` instance. The object's keys are all the directories (using absolute paths unless
    * the `cwd` option was used), and the values are arrays of the names of the items contained in
    * each directory.
    */
  def getWatched(): StringDictionary[js.Array[String]] = js.native
  def on(
    event: all,
    listener: js.Function3[
      /* eventName */ add | addDir | change | unlink | unlinkDir, 
      /* path */ String, 
      /* stats */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_add(event: add, listener: js.Function2[/* path */ String, /* stats */ js.UndefOr[Stats], Unit]): this.type = js.native
  @JSName("on")
  def on_addDir(event: addDir, listener: js.Function2[/* path */ String, /* stats */ js.UndefOr[Stats], Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, listener: js.Function2[/* path */ String, /* stats */ js.UndefOr[Stats], Unit]): this.type = js.native
  /**
    * Error occured
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  /**
    * Exposes the native Node `fs.FSWatcher events`
    */
  @JSName("on")
  def on_raw(
    event: raw,
    listener: js.Function3[/* eventName */ String, /* path */ String, /* details */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Fires when the initial scan is complete
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_unlink(event: unlink, listener: js.Function1[/* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_unlinkDir(event: unlinkDir, listener: js.Function1[/* path */ String, Unit]): this.type = js.native
  /**
    * Stop watching files, directories, or glob patterns. Takes an array of strings or just one
    * string.
    */
  def unwatch(paths: String): Unit = js.native
  def unwatch(paths: js.Array[String]): Unit = js.native
}

