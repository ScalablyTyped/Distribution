package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId
  
  /**
    *  If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS CloudFormation stacks in the AWS Mobile Hub project. 
    */
  var syncFromResources: js.UndefOr[Boolean] = js.undefined
}
object DescribeProjectRequest {
  
  inline def apply(projectId: ProjectId): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  extension [Self <: DescribeProjectRequest](x: Self) {
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setSyncFromResources(value: Boolean): Self = StObject.set(x, "syncFromResources", value.asInstanceOf[js.Any])
    
    inline def setSyncFromResourcesUndefined: Self = StObject.set(x, "syncFromResources", js.undefined)
  }
}
