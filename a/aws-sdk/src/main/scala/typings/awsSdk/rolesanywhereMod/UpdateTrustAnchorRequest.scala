package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrustAnchorRequest extends StObject {
  
  /**
    * The name of the trust anchor.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The trust anchor type and its related certificate data.
    */
  var source: js.UndefOr[Source] = js.undefined
  
  /**
    * The unique identifier of the trust anchor.
    */
  var trustAnchorId: Uuid
}
object UpdateTrustAnchorRequest {
  
  inline def apply(trustAnchorId: Uuid): UpdateTrustAnchorRequest = {
    val __obj = js.Dynamic.literal(trustAnchorId = trustAnchorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustAnchorRequest]
  }
  
  extension [Self <: UpdateTrustAnchorRequest](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTrustAnchorId(value: Uuid): Self = StObject.set(x, "trustAnchorId", value.asInstanceOf[js.Any])
  }
}
