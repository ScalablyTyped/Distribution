package typings.awsSdkInvalidDependency

import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/invalid-dependency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invalidFunction(message: String): js.Function0[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidFunction")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function0[scala.Nothing]]
  
  inline def invalidProvider(message: String): Provider[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidProvider")(message.asInstanceOf[js.Any]).asInstanceOf[Provider[Any]]
}
