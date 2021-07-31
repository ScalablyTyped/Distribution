package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCloudFrontOriginAccessIdentityRequest extends StObject {
  
  /**
    * The origin access identity's ID.
    */
  var Id: String
  
  /**
    * The value of the ETag header you received from a previous GET or PUT request. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteCloudFrontOriginAccessIdentityRequest {
  
  @scala.inline
  def apply(Id: String): DeleteCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCloudFrontOriginAccessIdentityRequest]
  }
  
  @scala.inline
  implicit class DeleteCloudFrontOriginAccessIdentityRequestMutableBuilder[Self <: DeleteCloudFrontOriginAccessIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
