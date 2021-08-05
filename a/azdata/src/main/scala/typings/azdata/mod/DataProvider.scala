package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProvider extends StObject {
  
  var handle: js.UndefOr[Double] = js.undefined
  
  val providerId: String
}
object DataProvider {
  
  inline def apply(providerId: String): DataProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProvider]
  }
  
  extension [Self <: DataProvider](x: Self) {
    
    inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
