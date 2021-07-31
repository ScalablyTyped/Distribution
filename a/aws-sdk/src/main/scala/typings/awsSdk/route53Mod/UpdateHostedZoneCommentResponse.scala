package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHostedZoneCommentResponse extends StObject {
  
  /**
    * A complex type that contains the response to the UpdateHostedZoneComment request.
    */
  var HostedZone: typings.awsSdk.route53Mod.HostedZone
}
object UpdateHostedZoneCommentResponse {
  
  @scala.inline
  def apply(HostedZone: HostedZone): UpdateHostedZoneCommentResponse = {
    val __obj = js.Dynamic.literal(HostedZone = HostedZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHostedZoneCommentResponse]
  }
  
  @scala.inline
  implicit class UpdateHostedZoneCommentResponseMutableBuilder[Self <: UpdateHostedZoneCommentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZone(value: HostedZone): Self = StObject.set(x, "HostedZone", value.asInstanceOf[js.Any])
  }
}
