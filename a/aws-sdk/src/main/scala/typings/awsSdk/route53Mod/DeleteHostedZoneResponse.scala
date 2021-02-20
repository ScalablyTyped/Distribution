package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHostedZoneResponse extends StObject {
  
  /**
    * A complex type that contains the ID, the status, and the date and time of a request to delete a hosted zone.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
}
object DeleteHostedZoneResponse {
  
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): DeleteHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostedZoneResponse]
  }
  
  @scala.inline
  implicit class DeleteHostedZoneResponseMutableBuilder[Self <: DeleteHostedZoneResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
