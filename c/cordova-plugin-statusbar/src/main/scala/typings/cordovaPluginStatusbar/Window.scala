package typings.cordovaPluginStatusbar

import typings.cordovaPluginStatusbar.cordovaPluginStatusbarStrings.statusTap
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var StatusBar: typings.cordovaPluginStatusbar.StatusBar = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event_, _], useCapture: Boolean): Unit = js.native
}

