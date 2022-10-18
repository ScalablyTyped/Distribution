package typings.checCommerceJs

import typings.checCommerceJs.mod.^
import typings.checCommerceJs.typesMerchantMod.Merchant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresMerchantsMod {
  
  @JSImport("@chec/commerce.js/features/merchants", "Merchants")
  @js.native
  open class Merchants protected () extends StObject {
    def this(commerce: ^) = this()
    
    def about(): js.Promise[Merchant] = js.native
  }
}
