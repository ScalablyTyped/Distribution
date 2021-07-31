package typings.cannon.mod

import typings.cannon.CANNON.IBodyOptions
import typings.cannon.CANNON.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Body")
@js.native
class Body ()
  extends StObject
     with typings.cannon.CANNON.Body {
  def this(options: IBodyOptions) = this()
  
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function): typings.cannon.CANNON.EventTarget = js.native
  
  /* CompleteClass */
  override def dispatchEvent(event: IEvent): IEvent = js.native
  
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function): typings.cannon.CANNON.EventTarget = js.native
}
/* static members */
object Body {
  
  @JSImport("cannon", "Body")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cannon", "Body.AWAKE")
  @js.native
  def AWAKE: Double = js.native
  @scala.inline
  def AWAKE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAKE")(x.asInstanceOf[js.Any])
  
  @JSImport("cannon", "Body.DYNAMIC")
  @js.native
  def DYNAMIC: Double = js.native
  @scala.inline
  def DYNAMIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DYNAMIC")(x.asInstanceOf[js.Any])
  
  @JSImport("cannon", "Body.KINEMATIC")
  @js.native
  def KINEMATIC: Double = js.native
  @scala.inline
  def KINEMATIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KINEMATIC")(x.asInstanceOf[js.Any])
  
  @JSImport("cannon", "Body.SLEEPING")
  @js.native
  def SLEEPING: Double = js.native
  @scala.inline
  def SLEEPING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSImport("cannon", "Body.SLEEPY")
  @js.native
  def SLEEPY: Double = js.native
  @scala.inline
  def SLEEPY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPY")(x.asInstanceOf[js.Any])
  
  @JSImport("cannon", "Body.STATIC")
  @js.native
  def STATIC: Double = js.native
  @scala.inline
  def STATIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATIC")(x.asInstanceOf[js.Any])
  
  @JSImport("cannon", "Body.sleepEvent")
  @js.native
  def sleepEvent: IEvent = js.native
  @scala.inline
  def sleepEvent_=(x: IEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sleepEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("cannon", "Body.sleepyEvent")
  @js.native
  def sleepyEvent: IEvent = js.native
  @scala.inline
  def sleepyEvent_=(x: IEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sleepyEvent")(x.asInstanceOf[js.Any])
}
