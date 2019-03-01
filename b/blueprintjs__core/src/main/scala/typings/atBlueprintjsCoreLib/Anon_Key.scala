package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: scala.Nothing
  var valueA: js.Any
  var valueB: js.Any
}

object Anon_Key {
  @scala.inline
  def apply(key: scala.Nothing, valueA: js.Any, valueB: js.Any): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("valueA")(valueA)
    __obj.updateDynamic("valueB")(valueB)
    __obj.asInstanceOf[Anon_Key]
  }
}

