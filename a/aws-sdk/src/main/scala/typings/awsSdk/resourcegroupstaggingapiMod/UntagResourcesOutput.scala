package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourcesOutput extends StObject {
  
  /**
    * Details of resources that could not be untagged. An error code, status code, and error message are returned for each failed item. 
    */
  var FailedResourcesMap: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.FailedResourcesMap] = js.native
}
object UntagResourcesOutput {
  
  @scala.inline
  def apply(): UntagResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourcesOutput]
  }
  
  @scala.inline
  implicit class UntagResourcesOutputMutableBuilder[Self <: UntagResourcesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedResourcesMap(value: FailedResourcesMap): Self = StObject.set(x, "FailedResourcesMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedResourcesMapUndefined: Self = StObject.set(x, "FailedResourcesMap", js.undefined)
  }
}
