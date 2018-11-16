package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriggerModule extends js.Object

@JSGlobal("CbServer.TriggerModule")
@js.native
object TriggerModule extends js.Object {
  @js.native
  sealed trait DEVICE
    extends clearbladejsDashServerLib.CbServerNs.TriggerModule
  
  @js.native
  sealed trait Data
    extends clearbladejsDashServerLib.CbServerNs.TriggerModule
  
  @js.native
  sealed trait MESSAGING
    extends clearbladejsDashServerLib.CbServerNs.TriggerModule
  
  @js.native
  sealed trait USER
    extends clearbladejsDashServerLib.CbServerNs.TriggerModule
  
  /* "Device" */ val DEVICE: DEVICE with java.lang.String = js.native
  /* "Data" */ val Data: Data with java.lang.String = js.native
  /* "Messaging" */ val MESSAGING: MESSAGING with java.lang.String = js.native
  /* "User" */ val USER: USER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[clearbladejsDashServerLib.CbServerNs.TriggerModule with java.lang.String] = js.native
}

