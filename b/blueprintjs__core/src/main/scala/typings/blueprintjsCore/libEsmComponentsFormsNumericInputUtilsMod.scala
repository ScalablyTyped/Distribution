package typings.blueprintjsCore

import typings.react.mod.KeyboardEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsFormsNumericInputUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clampValue(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clampValue")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def clampValue(value: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clampValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clampValue(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clampValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clampValue(value: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clampValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getValueOrEmptyValue(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueOrEmptyValue")().asInstanceOf[String]
  inline def getValueOrEmptyValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueOrEmptyValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getValueOrEmptyValue(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueOrEmptyValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidNumericKeyboardEvent(e: KeyboardEvent[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericKeyboardEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidNumericKeyboardEvent(e: KeyboardEvent[Element], locale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericKeyboardEvent")(e.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValueNumeric(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValueNumeric(value: String, locale: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValueNumeric")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseStringToStringNumber(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStringToStringNumber")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parseStringToStringNumber(value: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringToStringNumber")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseStringToStringNumber(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStringToStringNumber")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parseStringToStringNumber(value: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringToStringNumber")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sanitizeNumericInput(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNumericInput")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitizeNumericInput(value: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNumericInput")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toLocaleString_(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toLocaleString_(num: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")(num.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toMaxPrecision(value: Double, maxPrecision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toMaxPrecision")(value.asInstanceOf[js.Any], maxPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
}
