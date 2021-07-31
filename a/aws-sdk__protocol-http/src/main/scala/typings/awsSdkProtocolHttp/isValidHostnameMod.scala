package typings.awsSdkProtocolHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidHostnameMod {
  
  @JSImport("@aws-sdk/protocol-http/dist/cjs/isValidHostname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isValidHostname(hostname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHostname")(hostname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
