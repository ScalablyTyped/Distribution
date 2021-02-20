package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginShield extends StObject {
  
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
  implicit class OriginShieldMutableBuilder[Self <: OriginShield] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginShieldRegion(value: OriginShieldRegion): Self = StObject.set(x, "OriginShieldRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginShieldRegionUndefined: Self = StObject.set(x, "OriginShieldRegion", js.undefined)
  }
}
