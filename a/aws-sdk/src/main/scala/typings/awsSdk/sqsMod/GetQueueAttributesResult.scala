package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQueueAttributesResult extends StObject {
  
  /**
    * A map of attributes to their respective values.
    */
  var Attributes: js.UndefOr[QueueAttributeMap] = js.native
}
object GetQueueAttributesResult {
  
  @scala.inline
  def apply(): GetQueueAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueAttributesResult]
  }
  
  @scala.inline
  implicit class GetQueueAttributesResultMutableBuilder[Self <: GetQueueAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: QueueAttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}
