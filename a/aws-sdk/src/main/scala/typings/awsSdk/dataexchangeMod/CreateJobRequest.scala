package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobRequest extends StObject {
  
  /**
    * The details for the CreateJob request.
    */
  var Details: RequestDetails = js.native
  
  /**
    * The type of job to be created.
    */
  var Type: typings.awsSdk.dataexchangeMod.Type = js.native
}
object CreateJobRequest {
  
  @scala.inline
  def apply(Details: RequestDetails, Type: Type): CreateJobRequest = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  @scala.inline
  implicit class CreateJobRequestMutableBuilder[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: RequestDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
