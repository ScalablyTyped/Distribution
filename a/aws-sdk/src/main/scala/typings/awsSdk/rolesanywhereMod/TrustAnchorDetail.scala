package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustAnchorDetail extends StObject {
  
  /**
    * The ISO-8601 timestamp when the trust anchor was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the trust anchor is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the trust anchor.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The trust anchor type and its related certificate data.
    */
  var source: js.UndefOr[Source] = js.undefined
  
  /**
    * The ARN of the trust anchor.
    */
  var trustAnchorArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the trust anchor.
    */
  var trustAnchorId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The ISO-8601 timestamp when the trust anchor was last updated. 
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object TrustAnchorDetail {
  
  inline def apply(): TrustAnchorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustAnchorDetail]
  }
  
  extension [Self <: TrustAnchorDetail](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTrustAnchorArn(value: String): Self = StObject.set(x, "trustAnchorArn", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorArnUndefined: Self = StObject.set(x, "trustAnchorArn", js.undefined)
    
    inline def setTrustAnchorId(value: Uuid): Self = StObject.set(x, "trustAnchorId", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorIdUndefined: Self = StObject.set(x, "trustAnchorId", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
