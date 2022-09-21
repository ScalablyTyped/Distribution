package typings.bconnorwhiteModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionMod {
  
  @JSImport("@bconnorwhite/module/build/package-json/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVersion(dirname: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(dirname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getVersionSync(dirname: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionSync")(dirname.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
