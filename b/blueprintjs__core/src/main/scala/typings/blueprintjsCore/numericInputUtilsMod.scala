package typings.blueprintjsCore

import typings.react.mod.KeyboardEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericInputUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "clampValue")
  @js.native
  def clampValue(value: Double): Double = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "clampValue")
  @js.native
  def clampValue(value: Double, min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "clampValue")
  @js.native
  def clampValue(value: Double, min: Double): Double = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "clampValue")
  @js.native
  def clampValue(value: Double, min: Double, max: Double): Double = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "getValueOrEmptyValue")
  @js.native
  def getValueOrEmptyValue(): String = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "getValueOrEmptyValue")
  @js.native
  def getValueOrEmptyValue(value: String): String = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "getValueOrEmptyValue")
  @js.native
  def getValueOrEmptyValue(value: Double): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "isValidNumericKeyboardEvent")
  @js.native
  def isValidNumericKeyboardEvent(e: KeyboardEvent[Element]): Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "isValidNumericKeyboardEvent")
  @js.native
  def isValidNumericKeyboardEvent(e: KeyboardEvent[Element], locale: String): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "isValueNumeric")
  @js.native
  def isValueNumeric(value: String): Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "isValueNumeric")
  @js.native
  def isValueNumeric(value: String, locale: String): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "parseStringToStringNumber")
  @js.native
  def parseStringToStringNumber(value: String): String = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "parseStringToStringNumber")
  @js.native
  def parseStringToStringNumber(value: String, locale: String): String = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "parseStringToStringNumber")
  @js.native
  def parseStringToStringNumber(value: Double): String = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "parseStringToStringNumber")
  @js.native
  def parseStringToStringNumber(value: Double, locale: String): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "sanitizeNumericInput")
  @js.native
  def sanitizeNumericInput(value: String): String = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "sanitizeNumericInput")
  @js.native
  def sanitizeNumericInput(value: String, locale: String): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "toLocaleString")
  @js.native
  def toLocaleString_(num: Double): String = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "toLocaleString")
  @js.native
  def toLocaleString_(num: Double, locale: String): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/numericInputUtils", "toMaxPrecision")
  @js.native
  def toMaxPrecision(value: Double, maxPrecision: Double): Double = js.native
}
