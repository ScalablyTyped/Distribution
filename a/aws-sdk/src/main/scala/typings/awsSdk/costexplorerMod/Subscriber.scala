package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscriber extends StObject {
  
  /**
    *  The email address or SNS Amazon Resource Name (ARN), depending on the Type. 
    */
  var Address: js.UndefOr[SubscriberAddress] = js.native
  
  /**
    *  Indicates if the subscriber accepts the notifications. 
    */
  var Status: js.UndefOr[SubscriberStatus] = js.native
  
  /**
    *  The notification delivery channel. 
    */
  var Type: js.UndefOr[SubscriberType] = js.native
}
object Subscriber {
  
  @scala.inline
  def apply(): Subscriber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscriber]
  }
  
  @scala.inline
  implicit class SubscriberMutableBuilder[Self <: Subscriber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: SubscriberAddress): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setStatus(value: SubscriberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setType(value: SubscriberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
