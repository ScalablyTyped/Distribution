package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReusableDelegationSetRequest extends StObject {
  
  /**
    * The ID of the reusable delegation set that you want to delete.
    */
  var Id: ResourceId
}
object DeleteReusableDelegationSetRequest {
  
  @scala.inline
  def apply(Id: ResourceId): DeleteReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReusableDelegationSetRequest]
  }
  
  @scala.inline
  implicit class DeleteReusableDelegationSetRequestMutableBuilder[Self <: DeleteReusableDelegationSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
