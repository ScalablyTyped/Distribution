package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Out extends js.Object {
  var script: Buffer
  var value: Double
}

object Out {
  @scala.inline
  def apply(script: Buffer, value: Double): Out = {
    val __obj = js.Dynamic.literal(script = script, value = value)
  
    __obj.asInstanceOf[Out]
  }
}

