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
  
  inline def apply(): LifecyclePolicyPreviewFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewFilter]
  }
  
  extension [Self <: LifecyclePolicyPreviewFilter](x: Self) {
    
    inline def setTagStatus(value: TagStatus): Self = StObject.set(x, "tagStatus", value.asInstanceOf[js.Any])
    
    inline def setTagStatusUndefined: Self = StObject.set(x, "tagStatus", js.undefined)
  }
}
