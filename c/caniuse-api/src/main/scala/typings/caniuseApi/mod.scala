package typings.caniuseApi

import org.scalablytyped.runtime.StringDictionary
import typings.caniuseApi.anon.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("caniuse-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val features: js.Array[String] = js.native
  def find(query: String): js.Array[String] = js.native
  def getBrowserScope(): js.Array[String] = js.native
  def getLatestStableBrowsers(): js.Array[String] = js.native
  def getSupport(feature: String): BrowserSupport = js.native
  def isSupported(feature: String, browsers: String): Boolean = js.native
  def isSupported(feature: String, browsers: js.Array[String]): Boolean = js.native
  def setBrowserScope(browserscope: String): Unit = js.native
  def setBrowserScope(browserscope: js.Array[String]): Unit = js.native
  type BrowserSupport = StringDictionary[A]
}

