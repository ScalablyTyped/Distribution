package typings.cannon.global.CANNON

import typings.cannon.CANNON.IBodyOptions
import typings.cannon.CANNON.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Body")
@js.native
class Body ()
  extends typings.cannon.CANNON.Body {
  def this(options: IBodyOptions) = this()
}
/* static members */
@JSGlobal("CANNON.Body")
@js.native
object Body extends js.Object {
  
  var AWAKE: Double = js.native
  
  var DYNAMIC: Double = js.native
  
  var KINEMATIC: Double = js.native
  
  var SLEEPING: Double = js.native
  
  var SLEEPY: Double = js.native
  
  var STATIC: Double = js.native
  
  var sleepEvent: IEvent = js.native
  
  var sleepyEvent: IEvent = js.native
}
