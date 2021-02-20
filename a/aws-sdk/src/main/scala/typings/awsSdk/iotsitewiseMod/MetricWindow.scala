package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricWindow extends StObject {
  
  /**
    * The tumbling time interval window.
    */
  var tumbling: js.UndefOr[TumblingWindow] = js.native
}
object MetricWindow {
  
  @scala.inline
  def apply(): MetricWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricWindow]
  }
  
  @scala.inline
  implicit class MetricWindowMutableBuilder[Self <: MetricWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTumbling(value: TumblingWindow): Self = StObject.set(x, "tumbling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTumblingUndefined: Self = StObject.set(x, "tumbling", js.undefined)
  }
}
