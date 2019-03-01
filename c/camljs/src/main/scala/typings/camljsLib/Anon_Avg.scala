package typings
package camljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avg
  extends camljsLib.camljsMod.CamlBuilderNs.Aggregation {
  var avg: java.lang.String
}

object Anon_Avg {
  @scala.inline
  def apply(avg: java.lang.String): Anon_Avg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avg")(avg)
    __obj.asInstanceOf[Anon_Avg]
  }
}

