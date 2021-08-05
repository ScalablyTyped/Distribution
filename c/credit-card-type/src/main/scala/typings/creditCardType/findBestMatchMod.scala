package typings.creditCardType

import typings.creditCardType.typesMod.CreditCardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findBestMatchMod {
  
  @JSImport("credit-card-type/dist/lib/find-best-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findBestMatch(results: js.Array[CreditCardType]): CreditCardType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findBestMatch")(results.asInstanceOf[js.Any]).asInstanceOf[CreditCardType | Null]
}
