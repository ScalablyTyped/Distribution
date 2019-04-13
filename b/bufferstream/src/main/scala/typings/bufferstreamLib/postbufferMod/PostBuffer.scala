package typings
package bufferstreamLib.postbufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostBuffer
  extends bufferstreamLib.bufferstreamMod.^ {
  /** set a callback to get all post data from a http server request */
  def onEnd(callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
}

