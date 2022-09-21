package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceCollection extends StObject {
  
  /**
    * An array of strings that each specifies the name of an Amazon Web Services service.
    */
  var ServiceNames: js.UndefOr[typings.awsSdk.devopsguruMod.ServiceNames] = js.undefined
}
object ServiceCollection {
  
  inline def apply(): ServiceCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceCollection]
  }
  
  extension [Self <: ServiceCollection](x: Self) {
    
    inline def setServiceNames(value: ServiceNames): Self = StObject.set(x, "ServiceNames", value.asInstanceOf[js.Any])
    
    inline def setServiceNamesUndefined: Self = StObject.set(x, "ServiceNames", js.undefined)
    
    inline def setServiceNamesVarargs(value: ServiceName*): Self = StObject.set(x, "ServiceNames", js.Array(value*))
  }
}
