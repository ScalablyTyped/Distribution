package typings
package batchDashStreamLib.batchDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStream
  extends nodeLib.streamMod.Transform {
  var batch: js.Array[_] = js.native
  var size: scala.Double = js.native
}

