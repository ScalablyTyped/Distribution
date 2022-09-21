package typings.awsSdkInvalidDependency

import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invalidProviderMod {
  
  @JSImport("@aws-sdk/invalid-dependency/dist-types/invalidProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invalidProvider(message: String): Provider[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidProvider")(message.asInstanceOf[js.Any]).asInstanceOf[Provider[Any]]
}
