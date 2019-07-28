package typings.batchDashStream.batchDashStreamMod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStream extends Transform {
  var batch: js.Array[_] = js.native
  var size: Double = js.native
}

