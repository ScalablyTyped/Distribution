package typings.clearbladejsDashServer.CbServerNs

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
  
  /* "Device" */ val DEVICE: typings.clearbladejsDashServer.CbServerNs.TriggerModule.DEVICE with String = js.native
  /* "Data" */ val Data: typings.clearbladejsDashServer.CbServerNs.TriggerModule.Data with String = js.native
  /* "Messaging" */ val MESSAGING: typings.clearbladejsDashServer.CbServerNs.TriggerModule.MESSAGING with String = js.native
  /* "User" */ val USER: typings.clearbladejsDashServer.CbServerNs.TriggerModule.USER with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TriggerModule with String] = js.native
}

