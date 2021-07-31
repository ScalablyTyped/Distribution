package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    * The ID of the project.
    */
  var id: ProjectId
}
object DescribeProjectRequest {
  
  @scala.inline
  def apply(id: ProjectId): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  @scala.inline
  implicit class DescribeProjectRequestMutableBuilder[Self <: DescribeProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
