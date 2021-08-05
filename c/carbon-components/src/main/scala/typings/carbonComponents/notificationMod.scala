package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("carbon-components/components/notification/notification", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Notification {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _changeState(state: js.Any, callback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def remove(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/notification/notification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/notification/notification", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object options {
      
      @JSImport("carbon-components/components/notification/notification", "default.options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/notification/notification", "default.options.eventAfterDeleteNotification")
      @js.native
      def eventAfterDeleteNotification: String = js.native
      inline def eventAfterDeleteNotification_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventAfterDeleteNotification")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/notification/notification", "default.options.eventBeforeDeleteNotification")
      @js.native
      def eventBeforeDeleteNotification: String = js.native
      inline def eventBeforeDeleteNotification_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventBeforeDeleteNotification")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/notification/notification", "default.options.selectorButton")
      @js.native
      def selectorButton: String = js.native
      inline def selectorButton_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorButton")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/notification/notification", "default.options.selectorInit")
      @js.native
      def selectorInit: String = js.native
      inline def selectorInit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorInit")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Notification extends StObject {
    
    def _changeState(state: js.Any, callback: js.Any): Unit
    
    def remove(): Unit
  }
  object Notification {
    
    inline def apply(_changeState: (js.Any, js.Any) => Unit, remove: () => Unit): Notification = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction2(_changeState), remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Notification]
    }
    
    extension [Self <: Notification](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def set_changeState(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction2(value))
    }
  }
}
