package typings.blueprintjsCore.anon

import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrevMaxProp extends js.Object {
  var prevMaxProp: Double
  var prevMinProp: Double
  var prevValueProp: ReactText
  var stepMaxPrecision: Double
  var value: String
}

object PrevMaxProp {
  @scala.inline
  def apply(
    prevMaxProp: Double,
    prevMinProp: Double,
    prevValueProp: ReactText,
    stepMaxPrecision: Double,
    value: String
  ): PrevMaxProp = {
    val __obj = js.Dynamic.literal(prevMaxProp = prevMaxProp.asInstanceOf[js.Any], prevMinProp = prevMinProp.asInstanceOf[js.Any], prevValueProp = prevValueProp.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevMaxProp]
  }
}

