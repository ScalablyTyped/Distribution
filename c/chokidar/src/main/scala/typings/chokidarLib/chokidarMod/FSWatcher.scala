package typings
package chokidarLib.chokidarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chokidar", "FSWatcher")
@js.native
class FSWatcher ()
  extends nodeLib.fsMod.FSWatcher {
  /**
       * Constructs a new FSWatcher instance with optional WatchOptions parameter.
       */
  def this(options: WatchOptions) = this()
  /**
       * Add files, directories, or glob patterns for tracking. Takes an array of strings or just one
       * string.
       */
  def add(paths: java.lang.String): scala.Unit = js.native
  /**
       * Add files, directories, or glob patterns for tracking. Takes an array of strings or just one
       * string.
       */
  def add(paths: js.Array[java.lang.String]): scala.Unit = js.native
  /**
       * Returns an object representing all the paths on the file system being watched by this
       * `FSWatcher` instance. The object's keys are all the directories (using absolute paths unless
       * the `cwd` option was used), and the values are arrays of the names of the items contained in
       * each directory.
       */
  def getWatched(): WatchedPaths = js.native
  /**
       * Stop watching files, directories, or glob patterns. Takes an array of strings or just one
       * string.
       */
  def unwatch(paths: java.lang.String): scala.Unit = js.native
  /**
       * Stop watching files, directories, or glob patterns. Takes an array of strings or just one
       * string.
       */
  def unwatch(paths: js.Array[java.lang.String]): scala.Unit = js.native
}

