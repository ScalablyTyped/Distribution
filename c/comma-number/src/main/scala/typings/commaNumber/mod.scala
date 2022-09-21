package typings.commaNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(inputNumber: String): String = ^.asInstanceOf[js.Dynamic].apply(inputNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(inputNumber: String, optionalSeparator: String): String = (^.asInstanceOf[js.Dynamic].apply(inputNumber.asInstanceOf[js.Any], optionalSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(inputNumber: String, optionalSeparator: String, optionalDecimalChar: String): String = (^.asInstanceOf[js.Dynamic].apply(inputNumber.asInstanceOf[js.Any], optionalSeparator.asInstanceOf[js.Any], optionalDecimalChar.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(inputNumber: String, optionalSeparator: Unit, optionalDecimalChar: String): String = (^.asInstanceOf[js.Dynamic].apply(inputNumber.asInstanceOf[js.Any], optionalSeparator.asInstanceOf[js.Any], optionalDecimalChar.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(inputNumber: Double): String = ^.asInstanceOf[js.Dynamic].apply(inputNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(inputNumber: Double, optionalSeparator: String): String = (^.asInstanceOf[js.Dynamic].apply(inputNumber.asInstanceOf[js.Any], optionalSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(inputNumber: Double, optionalSeparator: String, optionalDecimalChar: String): String = (^.asInstanceOf[js.Dynamic].apply(inputNumber.asInstanceOf[js.Any], optionalSeparator.asInstanceOf[js.Any], optionalDecimalChar.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(inputNumber: Double, optionalSeparator: Unit, optionalDecimalChar: String): String = (^.asInstanceOf[js.Dynamic].apply(inputNumber.asInstanceOf[js.Any], optionalSeparator.asInstanceOf[js.Any], optionalDecimalChar.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("comma-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindWith(separator: String, decimalChar: String): js.Function1[/* num */ Double | String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindWith")(separator.asInstanceOf[js.Any], decimalChar.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* num */ Double | String, String]]
}
