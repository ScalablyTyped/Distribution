package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCanaryRequest extends StObject {
  
  /**
    * The name of the canary that you want to delete. To find the names of your canaries, use DescribeCanaries.
    */
  var Name: CanaryName
}
object DeleteCanaryRequest {
  
  @scala.inline
  def apply(Name: CanaryName): DeleteCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCanaryRequest]
  }
  
  @scala.inline
  implicit class DeleteCanaryRequestMutableBuilder[Self <: DeleteCanaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
