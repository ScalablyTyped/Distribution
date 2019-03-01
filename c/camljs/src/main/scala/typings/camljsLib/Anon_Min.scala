package typings
package camljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Min
  extends camljsLib.camljsMod.CamlBuilderNs.Aggregation {
  var min: java.lang.String
}

object Anon_Min {
  @scala.inline
  def apply(min: java.lang.String): Anon_Min = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[Anon_Min]
  }
}

