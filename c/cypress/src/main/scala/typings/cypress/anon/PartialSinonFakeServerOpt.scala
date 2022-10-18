package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.cypress/types/sinon.SinonFakeServerOptions> */
trait PartialSinonFakeServerOpt extends StObject {
  
  var autoRespond: js.UndefOr[Boolean] = js.undefined
  
  var autoRespondAfter: js.UndefOr[Double] = js.undefined
  
  var fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined
  
  var respondImmediately: js.UndefOr[Boolean] = js.undefined
}
object PartialSinonFakeServerOpt {
  
  inline def apply(): PartialSinonFakeServerOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonFakeServerOpt]
  }
  
  extension [Self <: PartialSinonFakeServerOpt](x: Self) {
    
    inline def setAutoRespond(value: Boolean): Self = StObject.set(x, "autoRespond", value.asInstanceOf[js.Any])
    
    inline def setAutoRespondAfter(value: Double): Self = StObject.set(x, "autoRespondAfter", value.asInstanceOf[js.Any])
    
    inline def setAutoRespondAfterUndefined: Self = StObject.set(x, "autoRespondAfter", js.undefined)
    
    inline def setAutoRespondUndefined: Self = StObject.set(x, "autoRespond", js.undefined)
    
    inline def setFakeHTTPMethods(value: Boolean): Self = StObject.set(x, "fakeHTTPMethods", value.asInstanceOf[js.Any])
    
    inline def setFakeHTTPMethodsUndefined: Self = StObject.set(x, "fakeHTTPMethods", js.undefined)
    
    inline def setRespondImmediately(value: Boolean): Self = StObject.set(x, "respondImmediately", value.asInstanceOf[js.Any])
    
    inline def setRespondImmediatelyUndefined: Self = StObject.set(x, "respondImmediately", js.undefined)
  }
}
