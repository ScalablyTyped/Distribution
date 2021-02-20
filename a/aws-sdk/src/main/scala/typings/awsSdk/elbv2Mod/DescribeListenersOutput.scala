package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeListenersOutput extends StObject {
  
  /**
    * Information about the listeners.
    */
  var Listeners: js.UndefOr[typings.awsSdk.elbv2Mod.Listeners] = js.native
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}
object DescribeListenersOutput {
  
  @scala.inline
  def apply(): DescribeListenersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenersOutput]
  }
  
  @scala.inline
  implicit class DescribeListenersOutputMutableBuilder[Self <: DescribeListenersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
