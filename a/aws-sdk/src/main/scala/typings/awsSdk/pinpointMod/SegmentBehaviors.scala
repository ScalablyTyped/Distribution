package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentBehaviors extends StObject {
  
  /**
    * The dimension settings that are based on how recently an endpoint was active.
    */
  var Recency: js.UndefOr[RecencyDimension] = js.native
}
object SegmentBehaviors {
  
  @scala.inline
  def apply(): SegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentBehaviors]
  }
  
  @scala.inline
  implicit class SegmentBehaviorsMutableBuilder[Self <: SegmentBehaviors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecency(value: RecencyDimension): Self = StObject.set(x, "Recency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecencyUndefined: Self = StObject.set(x, "Recency", js.undefined)
  }
}
