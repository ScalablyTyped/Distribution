package typings.awsSdkUtilUserAgentBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-user-agent-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultUserAgent(packageName: String, packageVersion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultUserAgent")(packageName.asInstanceOf[js.Any], packageVersion.asInstanceOf[js.Any])).asInstanceOf[String]
}
