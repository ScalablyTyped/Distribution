package typings.awsSdkTokenProviders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesValidateTokenKeyMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/validateTokenKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateTokenKey(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateTokenKey")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateTokenKey(key: String, value: Any, forRefresh: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateTokenKey")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], forRefresh.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
