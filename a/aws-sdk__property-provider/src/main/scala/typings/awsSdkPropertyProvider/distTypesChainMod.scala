package typings.awsSdkPropertyProvider

import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChainMod {
  
  @JSImport("@aws-sdk/property-provider/dist-types/chain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chain[T](providers: Provider[T]*): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(providers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Provider[T]]
}
