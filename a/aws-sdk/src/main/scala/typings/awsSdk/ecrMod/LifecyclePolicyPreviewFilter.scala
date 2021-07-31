package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecyclePolicyPreviewFilter extends StObject {
  
  /**
    * The tag status of the image.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.undefined
}
object LifecyclePolicyPreviewFilter {
  
  @scala.inline
  def apply(): LifecyclePolicyPreviewFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewFilter]
  }
  
  @scala.inline
  implicit class LifecyclePolicyPreviewFilterMutableBuilder[Self <: LifecyclePolicyPreviewFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagStatus(value: TagStatus): Self = StObject.set(x, "tagStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagStatusUndefined: Self = StObject.set(x, "tagStatus", js.undefined)
  }
}
