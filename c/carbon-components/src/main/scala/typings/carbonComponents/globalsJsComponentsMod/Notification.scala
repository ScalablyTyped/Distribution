package typings.carbonComponents.globalsJsComponentsMod

import typings.carbonComponents.anon.PartialNotificationOption
import typings.carbonComponents.componentsNotificationNotificationMod.NotificationOptions
import typings.carbonComponents.componentsNotificationNotificationMod.default
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "Notification")
@js.native
open class Notification protected () extends default {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialNotificationOption) = this()
}
object Notification {
  
  @JSImport("carbon-components/globals/js/components", "Notification")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "Notification.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "Notification.options")
  @js.native
  def options: NotificationOptions = js.native
  inline def options_=(x: NotificationOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
