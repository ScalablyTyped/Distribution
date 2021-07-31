package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecyclePolicyPreviewSummary extends StObject {
  
  /**
    * The number of expiring images.
    */
  var expiringImageTotalCount: js.UndefOr[ImageCount] = js.undefined
}
object LifecyclePolicyPreviewSummary {
  
  @scala.inline
  def apply(): LifecyclePolicyPreviewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewSummary]
  }
  
  @scala.inline
  implicit class LifecyclePolicyPreviewSummaryMutableBuilder[Self <: LifecyclePolicyPreviewSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiringImageTotalCount(value: ImageCount): Self = StObject.set(x, "expiringImageTotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiringImageTotalCountUndefined: Self = StObject.set(x, "expiringImageTotalCount", js.undefined)
  }
}
