package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    * The name of the project to be described.
    */
  var projectName: ProjectName
}
object DescribeProjectRequest {
  
  @scala.inline
  def apply(projectName: ProjectName): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  @scala.inline
  implicit class DescribeProjectRequestMutableBuilder[Self <: DescribeProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
