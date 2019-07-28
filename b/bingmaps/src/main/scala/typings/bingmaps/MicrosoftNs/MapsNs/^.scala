package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps")
@js.native
object ^ extends js.Object {
  var Credentials: String = js.native
  def getIsBirdseyeAvailable(loc: Location, heading: Double, callback: js.Function1[/* isAvailable */ Boolean, Unit]): Unit = js.native
  def getIsBirdseyeAvailable(loc: Location, heading: Heading, callback: js.Function1[/* isAvailable */ Boolean, Unit]): Unit = js.native
  def loadModule(moduleName: String): Unit = js.native
  def loadModule(moduleName: String, options: js.Function0[Unit]): Unit = js.native
  def loadModule(moduleName: String, options: IModuleOptions): Unit = js.native
  def loadModule(moduleName: js.Array[String]): Unit = js.native
  def loadModule(moduleName: js.Array[String], options: js.Function0[Unit]): Unit = js.native
  def loadModule(moduleName: js.Array[String], options: IModuleOptions): Unit = js.native
  def moduleLoaded(moduleName: String): Unit = js.native
  def registerModule(moduleName: String, url: String): Unit = js.native
  def registerModule(moduleName: String, url: String, styles: IStyleUrl): Unit = js.native
}

