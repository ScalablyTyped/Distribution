package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostedZoneRequest extends StObject {
  
  /**
    * The ID of the hosted zone that you want to get information about.
    */
  var Id: ResourceId = js.native
}
object GetHostedZoneRequest {
  
  @scala.inline
  def apply(Id: ResourceId): GetHostedZoneRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneRequest]
  }
  
  @scala.inline
  implicit class GetHostedZoneRequestMutableBuilder[Self <: GetHostedZoneRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
