package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProjectRequest extends StObject {
  
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId = js.native
  
  /**
    *  If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS CloudFormation stacks in the AWS Mobile Hub project. 
    */
  var syncFromResources: js.UndefOr[Boolean] = js.native
}
object DescribeProjectRequest {
  
  @scala.inline
  def apply(projectId: ProjectId): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  @scala.inline
  implicit class DescribeProjectRequestMutableBuilder[Self <: DescribeProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncFromResources(value: Boolean): Self = StObject.set(x, "syncFromResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncFromResourcesUndefined: Self = StObject.set(x, "syncFromResources", js.undefined)
  }
}
