package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBillingGroupResponse extends StObject {
  
  /**
    * The latest version of the billing group.
    */
  var version: js.UndefOr[Version] = js.native
}
object UpdateBillingGroupResponse {
  
  @scala.inline
  def apply(): UpdateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBillingGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateBillingGroupResponseMutableBuilder[Self <: UpdateBillingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
