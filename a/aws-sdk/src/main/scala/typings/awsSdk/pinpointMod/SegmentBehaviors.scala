package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentBehaviors extends StObject {
  
  /**
    * The dimension settings that are based on how recently an endpoint was active.
    */
  var Recency: js.UndefOr[RecencyDimension] = js.undefined
}
object SegmentBehaviors {
  
  inline def apply(): SegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentBehaviors]
  }
  
  extension [Self <: SegmentBehaviors](x: Self) {
    
    inline def setRecency(value: RecencyDimension): Self = StObject.set(x, "Recency", value.asInstanceOf[js.Any])
    
    inline def setRecencyUndefined: Self = StObject.set(x, "Recency", js.undefined)
  }
}
