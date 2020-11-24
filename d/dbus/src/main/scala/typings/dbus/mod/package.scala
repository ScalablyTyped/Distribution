package typings.dbus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyInterfaceMethod = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]]
  
  type DBusInterface[T] = typings.dbus.anon.Bus with (typings.dbus.mod.PickMatching[T, js.Function1[/* repeated */ _, scala.Unit]])
  
  type PickMatching[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends U? T[P] : never}
    */ typings.dbus.dbusStrings.PickMatching with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type PropsCB = js.Function2[/* err */ js.UndefOr[typings.dbus.mod.Error], /* value */ js.Any, scala.Unit]
}
