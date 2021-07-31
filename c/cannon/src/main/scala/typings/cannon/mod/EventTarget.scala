package typings.cannon.mod

import typings.cannon.CANNON.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "EventTarget")
@js.native
class EventTarget ()
  extends StObject
     with typings.cannon.CANNON.EventTarget {
  
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function): typings.cannon.CANNON.EventTarget = js.native
  
  /* CompleteClass */
  override def dispatchEvent(event: IEvent): IEvent = js.native
  
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function): typings.cannon.CANNON.EventTarget = js.native
}
