package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCloudFrontOriginAccessIdentityRequest extends StObject {
  
  /**
    * The identity's ID.
    */
  var Id: String
}
object GetCloudFrontOriginAccessIdentityRequest {
  
  @scala.inline
  def apply(Id: String): GetCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityRequest]
  }
  
  @scala.inline
  implicit class GetCloudFrontOriginAccessIdentityRequestMutableBuilder[Self <: GetCloudFrontOriginAccessIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
