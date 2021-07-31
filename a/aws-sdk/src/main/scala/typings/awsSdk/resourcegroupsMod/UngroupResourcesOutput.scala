package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UngroupResourcesOutput extends StObject {
  
  /**
    * The resources that failed to be removed from the group.
    */
  var Failed: js.UndefOr[FailedResourceList] = js.undefined
  
  /**
    * The ARNs of the resources that were successfully removed from the group.
    */
  var Succeeded: js.UndefOr[ResourceArnList] = js.undefined
}
object UngroupResourcesOutput {
  
  @scala.inline
  def apply(): UngroupResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UngroupResourcesOutput]
  }
  
  @scala.inline
  implicit class UngroupResourcesOutputMutableBuilder[Self <: UngroupResourcesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: FailedResourceList): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    @scala.inline
    def setFailedVarargs(value: FailedResource*): Self = StObject.set(x, "Failed", js.Array(value :_*))
    
    @scala.inline
    def setSucceeded(value: ResourceArnList): Self = StObject.set(x, "Succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededUndefined: Self = StObject.set(x, "Succeeded", js.undefined)
    
    @scala.inline
    def setSucceededVarargs(value: ResourceArn*): Self = StObject.set(x, "Succeeded", js.Array(value :_*))
  }
}
