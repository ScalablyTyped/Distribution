package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotDatafeedSubscription extends StObject {
  
  /**
    * The name of the Amazon S3 bucket where the Spot Instance data feed is located.
    */
  var Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.undefined
  
  /**
    * The AWS account ID of the account.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix for the data feed files.
    */
  var Prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the Spot Instance data feed subscription.
    */
  var State: js.UndefOr[DatafeedSubscriptionState] = js.undefined
}
object SpotDatafeedSubscription {
  
  inline def apply(): SpotDatafeedSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotDatafeedSubscription]
  }
  
  extension [Self <: SpotDatafeedSubscription](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setFault(value: SpotInstanceStateFault): Self = StObject.set(x, "Fault", value.asInstanceOf[js.Any])
    
    inline def setFaultUndefined: Self = StObject.set(x, "Fault", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setState(value: DatafeedSubscriptionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
