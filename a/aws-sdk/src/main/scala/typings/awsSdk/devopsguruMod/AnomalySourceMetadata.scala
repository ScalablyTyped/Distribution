package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalySourceMetadata extends StObject {
  
  /**
    * The source of the anomaly.
    */
  var Source: js.UndefOr[AnomalySource] = js.undefined
  
  /**
    * The name of the anomaly's resource.
    */
  var SourceResourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The anomaly's resource type.
    */
  var SourceResourceType: js.UndefOr[ResourceType] = js.undefined
}
object AnomalySourceMetadata {
  
  inline def apply(): AnomalySourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalySourceMetadata]
  }
  
  extension [Self <: AnomalySourceMetadata](x: Self) {
    
    inline def setSource(value: AnomalySource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceName(value: ResourceName): Self = StObject.set(x, "SourceResourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceNameUndefined: Self = StObject.set(x, "SourceResourceName", js.undefined)
    
    inline def setSourceResourceType(value: ResourceType): Self = StObject.set(x, "SourceResourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceTypeUndefined: Self = StObject.set(x, "SourceResourceType", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
