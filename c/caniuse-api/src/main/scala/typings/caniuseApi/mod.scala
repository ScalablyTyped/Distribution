package typings.caniuseApi

import org.scalablytyped.runtime.StringDictionary
import typings.caniuseApi.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("caniuse-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("caniuse-api", "features")
  @js.native
  val features: js.Array[String] = js.native
  
  inline def find(query: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getBrowserScope(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserScope")().asInstanceOf[js.Array[String]]
  
  inline def getLatestStableBrowsers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestStableBrowsers")().asInstanceOf[js.Array[String]]
  
  inline def getSupport(feature: String): BrowserSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupport")(feature.asInstanceOf[js.Any]).asInstanceOf[BrowserSupport]
  
  inline def isSupported(feature: String, browsers: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(feature.asInstanceOf[js.Any], browsers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSupported(feature: String, browsers: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(feature.asInstanceOf[js.Any], browsers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setBrowserScope(browserscope: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBrowserScope")(browserscope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBrowserScope(browserscope: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBrowserScope")(browserscope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type BrowserSupport = StringDictionary[A]
}
