package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriggerModule extends js.Object

@JSGlobal("CbServer.TriggerModule")
@js.native
object TriggerModule extends js.Object {
  @js.native
  sealed trait DEVICE extends TriggerModule
  
  @js.native
  sealed trait Data extends TriggerModule
  
  @js.native
  sealed trait MESSAGING extends TriggerModule
  
  @js.native
  sealed trait USER extends TriggerModule
  
}

