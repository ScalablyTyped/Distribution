package typings.awsSdkPropertyProvider

import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainMod {
  
  @JSImport("@aws-sdk/property-provider/dist/cjs/chain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chain[T](providers: Provider[T]*): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(providers.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
}
