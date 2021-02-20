package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeResourceRecordSetsResponse extends StObject {
  
  /**
    * A complex type that contains information about changes made to your hosted zone. This element contains an ID that you use when performing a GetChange action to get detailed information about the change.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
}
object ChangeResourceRecordSetsResponse {
  
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): ChangeResourceRecordSetsResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeResourceRecordSetsResponse]
  }
  
  @scala.inline
  implicit class ChangeResourceRecordSetsResponseMutableBuilder[Self <: ChangeResourceRecordSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
