package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSelection extends StObject {
  
  /**
    * The maximum video bitrate (bps) to include in output.
    */
  var MaxVideoBitsPerSecond: js.UndefOr[integer] = js.undefined
  
  /**
    * The minimum video bitrate (bps) to include in output.
    */
  var MinVideoBitsPerSecond: js.UndefOr[integer] = js.undefined
  
  /**
    * A directive that determines the order of streams in the output.
    */
  var StreamOrder: js.UndefOr[typings.awsSdk.mediapackageMod.StreamOrder] = js.undefined
}
object StreamSelection {
  
  @scala.inline
  def apply(): StreamSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSelection]
  }
  
  @scala.inline
  implicit class StreamSelectionMutableBuilder[Self <: StreamSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxVideoBitsPerSecond(value: integer): Self = StObject.set(x, "MaxVideoBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVideoBitsPerSecondUndefined: Self = StObject.set(x, "MaxVideoBitsPerSecond", js.undefined)
    
    @scala.inline
    def setMinVideoBitsPerSecond(value: integer): Self = StObject.set(x, "MinVideoBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVideoBitsPerSecondUndefined: Self = StObject.set(x, "MinVideoBitsPerSecond", js.undefined)
    
    @scala.inline
    def setStreamOrder(value: StreamOrder): Self = StObject.set(x, "StreamOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamOrderUndefined: Self = StObject.set(x, "StreamOrder", js.undefined)
  }
}
