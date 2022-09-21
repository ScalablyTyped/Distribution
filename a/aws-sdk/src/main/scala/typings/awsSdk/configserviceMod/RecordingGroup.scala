package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingGroup extends StObject {
  
  /**
    * Specifies whether Config records configuration changes for every supported type of regional resource. If you set this option to true, when Config adds support for a new type of regional resource, it starts recording resources of that type automatically. If you set this option to true, you cannot enumerate a list of resourceTypes.
    */
  var allSupported: js.UndefOr[AllSupported] = js.undefined
  
  /**
    * Specifies whether Config includes all supported types of global resources (for example, IAM resources) with the resources that it records. Before you can set this option to true, you must set the allSupported option to true. If you set this option to true, when Config adds support for a new type of global resource, it starts recording resources of that type automatically. The configuration details for any global resource are the same in all regions. To prevent duplicate configuration items, you should consider customizing Config in only one region to record global resources.
    */
  var includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes] = js.undefined
  
  /**
    * A comma-separated list that specifies the types of Amazon Web Services resources for which Config records configuration changes (for example, AWS::EC2::Instance or AWS::CloudTrail::Trail). To record all configuration changes, you must set the allSupported option to true. If you set this option to false, when Config adds support for a new type of resource, it will not record resources of that type unless you manually add that type to your recording group. For a list of valid resourceTypes values, see the resourceType Value column in Supported Amazon Web Services resource Types.
    */
  var resourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
}
object RecordingGroup {
  
  inline def apply(): RecordingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingGroup]
  }
  
  extension [Self <: RecordingGroup](x: Self) {
    
    inline def setAllSupported(value: AllSupported): Self = StObject.set(x, "allSupported", value.asInstanceOf[js.Any])
    
    inline def setAllSupportedUndefined: Self = StObject.set(x, "allSupported", js.undefined)
    
    inline def setIncludeGlobalResourceTypes(value: IncludeGlobalResourceTypes): Self = StObject.set(x, "includeGlobalResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setIncludeGlobalResourceTypesUndefined: Self = StObject.set(x, "includeGlobalResourceTypes", js.undefined)
    
    inline def setResourceTypes(value: ResourceTypeList): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
  }
}
