package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    * The name of the project to be described.
    */
  var Name: ProjectName
}
object DescribeProjectRequest {
  
  @scala.inline
  def apply(Name: ProjectName): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  @scala.inline
  implicit class DescribeProjectRequestMutableBuilder[Self <: DescribeProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
