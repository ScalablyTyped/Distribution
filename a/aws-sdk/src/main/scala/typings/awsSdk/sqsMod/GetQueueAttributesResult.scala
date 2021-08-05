package typings.awsSdk.sqsMod

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
  
  extension [Self <: GetQueueAttributesResult](x: Self) {
    
    inline def setAttributes(value: QueueAttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}
