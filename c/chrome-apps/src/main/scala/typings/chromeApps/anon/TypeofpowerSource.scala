package typings.chromeApps.anon

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.system.powerSource.PowerSourceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpowerSource extends StObject {
  
  /**
    * Requests information on attached power sources.
    * @param callback The callback to invoke with the results or undefined if the power source information is not known.
    */
  def getPowerSourceInfo(callback: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit]): Unit
  
  /**
    * Event for changes in the set of connected power sources.
    */
  val onPowerChanged: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]]
  
  /**
    * Requests a power source status update.
    * Resulting power source status updates are observable using *onPowerChanged*.
    */
  def requestStatusUpdate(): Unit
}
object TypeofpowerSource {
  
  inline def apply(
    getPowerSourceInfo: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit] => Unit,
    onPowerChanged: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]],
    requestStatusUpdate: () => Unit
  ): TypeofpowerSource = {
    val __obj = js.Dynamic.literal(getPowerSourceInfo = js.Any.fromFunction1(getPowerSourceInfo), onPowerChanged = onPowerChanged.asInstanceOf[js.Any], requestStatusUpdate = js.Any.fromFunction0(requestStatusUpdate))
    __obj.asInstanceOf[TypeofpowerSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofpowerSource] (val x: Self) extends AnyVal {
    
    inline def setGetPowerSourceInfo(value: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit] => Unit): Self = StObject.set(x, "getPowerSourceInfo", js.Any.fromFunction1(value))
    
    inline def setOnPowerChanged(value: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]]): Self = StObject.set(x, "onPowerChanged", value.asInstanceOf[js.Any])
    
    inline def setRequestStatusUpdate(value: () => Unit): Self = StObject.set(x, "requestStatusUpdate", js.Any.fromFunction0(value))
  }
}
