package typings
package dbusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dbusLibStrings {
  @js.native
  sealed trait session
    extends dbusLib.dbusMod.busType
  
  @js.native
  sealed trait system
    extends dbusLib.dbusMod.busType
  
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  @scala.inline
  def system: system = "system".asInstanceOf[system]
}

