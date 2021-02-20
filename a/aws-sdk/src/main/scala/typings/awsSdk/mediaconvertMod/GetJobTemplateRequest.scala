package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobTemplateRequest extends StObject {
  
  /**
    * The name of the job template.
    */
  var Name: string = js.native
}
object GetJobTemplateRequest {
  
  @scala.inline
  def apply(Name: string): GetJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobTemplateRequest]
  }
  
  @scala.inline
  implicit class GetJobTemplateRequestMutableBuilder[Self <: GetJobTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
