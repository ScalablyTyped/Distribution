package typings.awsSdkNodeConfigProvider

import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromStaticMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist/cjs/fromStatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromStatic[T](defaultValue: FromStaticConfig[T]): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  
  type FromStaticConfig[T] = T | js.Function0[T]
}
