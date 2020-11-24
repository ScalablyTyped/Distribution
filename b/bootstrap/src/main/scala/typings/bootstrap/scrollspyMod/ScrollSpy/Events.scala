package typings.bootstrap.scrollspyMod.ScrollSpy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends js.Object
@JSImport("bootstrap/js/dist/scrollspy", "ScrollSpy.Events")
@js.native
object Events extends js.Object {
  
  /**
    * This event fires on the scroll element whenever a new item becomes
    * activated by the scrollspy.
    */
  @js.native
  sealed trait activate extends Events
}
