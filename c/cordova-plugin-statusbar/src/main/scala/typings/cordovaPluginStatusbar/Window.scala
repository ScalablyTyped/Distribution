package typings.cordovaPluginStatusbar

import typings.cordovaPluginStatusbar.cordovaPluginStatusbarStrings.statusTap
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var StatusBar: typings.cordovaPluginStatusbar.StatusBar = js.native
  
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
}
