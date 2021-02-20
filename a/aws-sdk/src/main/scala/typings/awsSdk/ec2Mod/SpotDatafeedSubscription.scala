package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotDatafeedSubscription extends StObject {
  
  /**
    * The name of the Amazon S3 bucket where the Spot Instance data feed is located.
    */
  var Bucket: js.UndefOr[String] = js.native
  
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.native
  
  /**
    * The AWS account ID of the account.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The prefix for the data feed files.
    */
  var Prefix: js.UndefOr[String] = js.native
  
  /**
    * The state of the Spot Instance data feed subscription.
    */
  var State: js.UndefOr[DatafeedSubscriptionState] = js.native
}
object SpotDatafeedSubscription {
  
  @scala.inline
  def apply(): SpotDatafeedSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotDatafeedSubscription]
  }
  
  @scala.inline
  implicit class SpotDatafeedSubscriptionMutableBuilder[Self <: SpotDatafeedSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setFault(value: SpotInstanceStateFault): Self = StObject.set(x, "Fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultUndefined: Self = StObject.set(x, "Fault", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setState(value: DatafeedSubscriptionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
