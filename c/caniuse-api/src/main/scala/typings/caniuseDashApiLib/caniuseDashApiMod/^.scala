package typings
package caniuseDashApiLib.caniuseDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("caniuse-api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val features: js.Array[java.lang.String] = js.native
  def find(query: java.lang.String): js.Array[java.lang.String] = js.native
  def getBrowserScope(): js.Array[java.lang.String] = js.native
  def getLatestStableBrowsers(): js.Array[java.lang.String] = js.native
  def getSupport(feature: java.lang.String): BrowserSupport = js.native
  def isSupported(feature: java.lang.String, browsers: java.lang.String): scala.Boolean = js.native
  def isSupported(feature: java.lang.String, browsers: js.Array[java.lang.String]): scala.Boolean = js.native
  def setBrowserScope(browserscope: java.lang.String): scala.Unit = js.native
  def setBrowserScope(browserscope: js.Array[java.lang.String]): scala.Unit = js.native
}

