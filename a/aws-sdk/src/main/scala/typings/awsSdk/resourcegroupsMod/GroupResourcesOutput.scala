package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupResourcesOutput extends StObject {
  
  /**
    * The ARNs of the resources that failed to be added to the group by this operation.
    */
  var Failed: js.UndefOr[FailedResourceList] = js.undefined
  
  /**
    * The ARNs of the resources that were successfully added to the group by this operation.
    */
  var Succeeded: js.UndefOr[ResourceArnList] = js.undefined
}
object GroupResourcesOutput {
  
  @scala.inline
  def apply(): GroupResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupResourcesOutput]
  }
  
  @scala.inline
  implicit class GroupResourcesOutputMutableBuilder[Self <: GroupResourcesOutput] (val x: Self) extends AnyVal {
    
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
