package typings.dbus

import typings.dbus.mod.busType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbusStrings {
  
  @scala.inline
  def PickMatching: PickMatching = "PickMatching".asInstanceOf[PickMatching]
  
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait PickMatching extends js.Object
  
  @js.native
  sealed trait session extends busType
  
  @js.native
  sealed trait system extends busType
}
