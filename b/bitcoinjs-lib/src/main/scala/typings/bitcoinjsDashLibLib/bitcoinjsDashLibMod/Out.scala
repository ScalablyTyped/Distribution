package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Out extends js.Object {
  var script: nodeLib.Buffer
  var value: scala.Double
}

object Out {
  @scala.inline
  def apply(script: nodeLib.Buffer, value: scala.Double): Out = {
    val __obj = js.Dynamic.literal(script = script, value = value)
  
    __obj.asInstanceOf[Out]
  }
}

