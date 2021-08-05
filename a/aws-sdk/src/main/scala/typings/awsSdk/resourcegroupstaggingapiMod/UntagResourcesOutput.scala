package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourcesOutput extends StObject {
  
  /**
    * Details of resources that could not be untagged. An error code, status code, and error message are returned for each failed item. 
    */
  var FailedResourcesMap: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.FailedResourcesMap] = js.undefined
}
object UntagResourcesOutput {
  
  inline def apply(): UntagResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourcesOutput]
  }
  
  extension [Self <: UntagResourcesOutput](x: Self) {
    
    inline def setFailedResourcesMap(value: FailedResourcesMap): Self = StObject.set(x, "FailedResourcesMap", value.asInstanceOf[js.Any])
    
    inline def setFailedResourcesMapUndefined: Self = StObject.set(x, "FailedResourcesMap", js.undefined)
  }
}
