package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointsResponse extends StObject {
  
  /**
    * <p>List of endpoints.</p>
    */
  var Endpoints: js.UndefOr[js.Array[Endpoint]] = js.undefined
}
object DescribeEndpointsResponse {
  
  inline def apply(): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEndpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
  }
}
