package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourcesOutput extends StObject {
  
  /**
    * A map containing a key-value pair for each failed item that couldn't be untagged. The key is the ARN of the failed resource. The value is a FailureInfo object that contains an error code, a status code, and an error message. If there are no errors, the FailedResourcesMap is empty.
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
