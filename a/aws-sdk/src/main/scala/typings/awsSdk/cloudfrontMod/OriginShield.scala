package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginShield extends js.Object {
  
  /**
    * A flag that specifies whether Origin Shield is enabled. When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your origin. When it’s disabled, CloudFront might send requests directly to your origin from multiple edge locations or regional edge caches.
    */
  var Enabled: Boolean = js.native
  
  /**
    * The AWS Region for Origin Shield. Specify the AWS Region that has the lowest latency to your origin. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2. When you enable CloudFront Origin Shield, you must specify the AWS Region for Origin Shield. For the list of AWS Regions that you can specify, and for help choosing the best Region for your origin, see Choosing the AWS Region for Origin Shield in the Amazon CloudFront Developer Guide.
    */
  var OriginShieldRegion: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginShieldRegion] = js.native
}
object OriginShield {
  
  @scala.inline
  def apply(Enabled: Boolean): OriginShield = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginShield]
  }
  
  @scala.inline
  implicit class OriginShieldOps[Self <: OriginShield] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginShieldRegion(value: OriginShieldRegion): Self = this.set("OriginShieldRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginShieldRegion: Self = this.set("OriginShieldRegion", js.undefined)
  }
}
