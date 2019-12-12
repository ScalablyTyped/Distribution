package typings.clearbladejsDashServer.CbServer

import org.scalablytyped.runtime.TopLevel
import typings.clearbladejsDashServer.CbServer.TriggerModule.DEVICE
import typings.clearbladejsDashServer.CbServer.TriggerModule.Data
import typings.clearbladejsDashServer.CbServer.TriggerModule.MESSAGING
import typings.clearbladejsDashServer.CbServer.TriggerModule.USER
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TriggerModule with String] = js.native
  /* "Device" */ @js.native
  object DEVICE extends TopLevel[DEVICE with String]
  
  /* "Data" */ @js.native
  object Data extends TopLevel[Data with String]
  
  /* "Messaging" */ @js.native
  object MESSAGING extends TopLevel[MESSAGING with String]
  
  /* "User" */ @js.native
  object USER extends TopLevel[USER with String]
  
}

