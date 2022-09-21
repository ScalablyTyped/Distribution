package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentCardUtilsMod {
  
  @JSImport("baseui/payment-card/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addGaps(gaps: js.Array[Double], value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addGaps")(gaps.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCaretPosition(value: String, prevValue: String, position: Double): js.Array[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCaretPosition")(value.asInstanceOf[js.Any], prevValue.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double]]
  
  inline def sanitizeNumber(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNumber")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
