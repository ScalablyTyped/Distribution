package typings.dbus

import typings.dbus.mod.busType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbusStrings {
  
  @js.native
  sealed trait PickMatching extends StObject
  inline def PickMatching: PickMatching = "PickMatching".asInstanceOf[PickMatching]
  
  @js.native
  sealed trait session
    extends StObject
       with busType
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait system
    extends StObject
       with busType
  inline def system: system = "system".asInstanceOf[system]
}
