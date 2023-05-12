package typings.awsSdk2Types.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueAttributesResult extends StObject {
  
  /**
    * A map of attributes to their respective values.
    */
  var Attributes: js.UndefOr[QueueAttributeMap] = js.undefined
}
object GetQueueAttributesResult {
  
  inline def apply(): GetQueueAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueAttributesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQueueAttributesResult] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: QueueAttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}
