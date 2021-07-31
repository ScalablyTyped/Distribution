package typings.carbonComponents.mod

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Notification")
@js.native
class Notification protected ()
  extends typings.carbonComponents.componentsMod.Notification {
  def this(element: js.Any, options: js.Any) = this()
}
object Notification {
  
  @JSImport("carbon-components", "Notification")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "Notification.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object options {
    
    @JSImport("carbon-components", "Notification.options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "Notification.options.eventAfterDeleteNotification")
    @js.native
    def eventAfterDeleteNotification: String = js.native
    @scala.inline
    def eventAfterDeleteNotification_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventAfterDeleteNotification")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Notification.options.eventBeforeDeleteNotification")
    @js.native
    def eventBeforeDeleteNotification: String = js.native
    @scala.inline
    def eventBeforeDeleteNotification_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventBeforeDeleteNotification")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Notification.options.selectorButton")
    @js.native
    def selectorButton: String = js.native
    @scala.inline
    def selectorButton_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorButton")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Notification.options.selectorInit")
    @js.native
    def selectorInit: String = js.native
    @scala.inline
    def selectorInit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorInit")(x.asInstanceOf[js.Any])
  }
}
