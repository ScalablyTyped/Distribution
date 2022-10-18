package typings.creditCardType

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIsValidInputTypeMod {
  
  @JSImport("credit-card-type/dist/lib/is-valid-input-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidInputType[T](cardNumber: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidInputType")(cardNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
