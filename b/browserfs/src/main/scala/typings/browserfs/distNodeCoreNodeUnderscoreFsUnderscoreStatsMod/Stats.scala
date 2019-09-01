package typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats
  extends typings.node.fsMod.Stats {
  var fileData: Buffer | Null = js.native
  /**
    * Change the mode of the file. We use this helper function to prevent messing
    * up the type of the file, which is encoded in mode.
    */
  def chmod(mode: Double): Unit = js.native
  def toBuffer(): Buffer = js.native
}

