package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAttributesResponse extends StObject {
  
  /**
    * The attributes applied to your resource.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
}
object PutAttributesResponse {
  
  inline def apply(): PutAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAttributesResponse]
  }
  
  extension [Self <: PutAttributesResponse](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
  }
}
