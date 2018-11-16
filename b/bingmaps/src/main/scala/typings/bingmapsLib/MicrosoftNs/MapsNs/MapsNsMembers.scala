package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps")
@js.native
object MapsNsMembers extends js.Object {
  var Credentials: java.lang.String = js.native
  def getIsBirdseyeAvailable(
    loc: Location,
    heading: Heading,
    callback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def getIsBirdseyeAvailable(
    loc: Location,
    heading: scala.Double,
    callback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def loadModule(moduleName: java.lang.String): scala.Unit = js.native
  def loadModule(moduleName: java.lang.String, options: IModuleOptions): scala.Unit = js.native
  def loadModule(moduleName: java.lang.String, options: js.Function0[scala.Unit]): scala.Unit = js.native
  def loadModule(moduleName: js.Array[java.lang.String]): scala.Unit = js.native
  def loadModule(moduleName: js.Array[java.lang.String], options: IModuleOptions): scala.Unit = js.native
  def loadModule(moduleName: js.Array[java.lang.String], options: js.Function0[scala.Unit]): scala.Unit = js.native
  def moduleLoaded(moduleName: java.lang.String): scala.Unit = js.native
  def registerModule(moduleName: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def registerModule(moduleName: java.lang.String, url: java.lang.String, styles: IStyleUrl): scala.Unit = js.native
}

