package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotDatafeedSubscription extends js.Object {
  
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
  implicit class SpotDatafeedSubscriptionOps[Self <: SpotDatafeedSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    
    @scala.inline
    def setFault(value: SpotInstanceStateFault): Self = this.set("Fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFault: Self = this.set("Fault", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setState(value: DatafeedSubscriptionState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
