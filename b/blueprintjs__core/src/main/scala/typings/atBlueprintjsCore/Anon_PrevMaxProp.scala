package typings.atBlueprintjsCore

import typings.react.reactMod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrevMaxProp extends js.Object {
  var prevMaxProp: Double
  var prevMinProp: Double
  var prevValueProp: ReactText
  var stepMaxPrecision: Double
  var value: String
}

object Anon_PrevMaxProp {
  @scala.inline
  def apply(
    prevMaxProp: Double,
    prevMinProp: Double,
    prevValueProp: ReactText,
    stepMaxPrecision: Double,
    value: String
  ): Anon_PrevMaxProp = {
    val __obj = js.Dynamic.literal(prevMaxProp = prevMaxProp, prevMinProp = prevMinProp, prevValueProp = prevValueProp.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision, value = value)
  
    __obj.asInstanceOf[Anon_PrevMaxProp]
  }
}

