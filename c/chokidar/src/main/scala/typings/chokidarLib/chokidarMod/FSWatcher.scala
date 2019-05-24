package typings
package chokidarLib.chokidarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chokidar", "FSWatcher")
@js.native
/**
  * Constructs a new FSWatcher instance with optional WatchOptions parameter.
  */
class FSWatcher ()
  extends nodeLib.fsMod.FSWatcher {
  def this(options: WatchOptions) = this()
  var options: WatchOptions = js.native
  /**
    * Add files, directories, or glob patterns for tracking. Takes an array of strings or just one
    * string.
    */
  def add(paths: java.lang.String): scala.Unit = js.native
  def add(paths: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Returns an object representing all the paths on the file system being watched by this
    * `FSWatcher` instance. The object's keys are all the directories (using absolute paths unless
    * the `cwd` option was used), and the values are arrays of the names of the items contained in
    * each directory.
    */
  def getWatched(): org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def on(
    event: chokidarLib.chokidarLibStrings.all,
    listener: js.Function3[
      /* eventName */ chokidarLib.chokidarLibStrings.add | chokidarLib.chokidarLibStrings.addDir | chokidarLib.chokidarLibStrings.change | chokidarLib.chokidarLibStrings.unlink | chokidarLib.chokidarLibStrings.unlinkDir, 
      /* path */ java.lang.String, 
      /* stats */ js.UndefOr[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_add(
    event: chokidarLib.chokidarLibStrings.add,
    listener: js.Function2[/* path */ java.lang.String, /* stats */ js.UndefOr[nodeLib.fsMod.Stats], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_addDir(
    event: chokidarLib.chokidarLibStrings.addDir,
    listener: js.Function2[/* path */ java.lang.String, /* stats */ js.UndefOr[nodeLib.fsMod.Stats], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_change(
    event: chokidarLib.chokidarLibStrings.change,
    listener: js.Function2[/* path */ java.lang.String, /* stats */ js.UndefOr[nodeLib.fsMod.Stats], scala.Unit]
  ): this.type = js.native
  /**
    * Error occured
    */
  @JSName("on")
  def on_error(
    event: chokidarLib.chokidarLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /**
    * Exposes the native Node `fs.FSWatcher events`
    */
  @JSName("on")
  def on_raw(
    event: chokidarLib.chokidarLibStrings.raw,
    listener: js.Function3[
      /* eventName */ java.lang.String, 
      /* path */ java.lang.String, 
      /* details */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fires when the initial scan is complete
    */
  @JSName("on")
  def on_ready(event: chokidarLib.chokidarLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_unlink(
    event: chokidarLib.chokidarLibStrings.unlink,
    listener: js.Function1[/* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unlinkDir(
    event: chokidarLib.chokidarLibStrings.unlinkDir,
    listener: js.Function1[/* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Stop watching files, directories, or glob patterns. Takes an array of strings or just one
    * string.
    */
  def unwatch(paths: java.lang.String): scala.Unit = js.native
  def unwatch(paths: js.Array[java.lang.String]): scala.Unit = js.native
}

