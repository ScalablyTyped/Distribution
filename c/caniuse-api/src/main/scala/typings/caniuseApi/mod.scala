package typings.caniuseApi

import org.scalablytyped.runtime.StringDictionary
import typings.caniuseApi.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("caniuse-api", "features")
  @js.native
  val features: js.Array[String] = js.native
  
  @JSImport("caniuse-api", "find")
  @js.native
  def find(query: String): js.Array[String] = js.native
  
  @JSImport("caniuse-api", "getBrowserScope")
  @js.native
  def getBrowserScope(): js.Array[String] = js.native
  
  @JSImport("caniuse-api", "getLatestStableBrowsers")
  @js.native
  def getLatestStableBrowsers(): js.Array[String] = js.native
  
  @JSImport("caniuse-api", "getSupport")
  @js.native
  def getSupport(feature: String): BrowserSupport = js.native
  
  @JSImport("caniuse-api", "isSupported")
  @js.native
  def isSupported(feature: String, browsers: String): Boolean = js.native
  @JSImport("caniuse-api", "isSupported")
  @js.native
  def isSupported(feature: String, browsers: js.Array[String]): Boolean = js.native
  
  @JSImport("caniuse-api", "setBrowserScope")
  @js.native
  def setBrowserScope(browserscope: String): Unit = js.native
  @JSImport("caniuse-api", "setBrowserScope")
  @js.native
  def setBrowserScope(browserscope: js.Array[String]): Unit = js.native
  
  type BrowserSupport = StringDictionary[A]
}
