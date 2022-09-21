package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceOutput extends StObject {
  
  /**
    * The detailed data of the service being deleted.
    */
  var service: js.UndefOr[Service] = js.undefined
}
object DeleteServiceOutput {
  
  inline def apply(): DeleteServiceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteServiceOutput]
  }
  
  extension [Self <: DeleteServiceOutput](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
