package typings.awsSdkNodeConfigProvider

import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-config-provider/dist/cjs/fromStatic", JSImport.Namespace)
@js.native
object fromStaticMod extends js.Object {
  
  def fromStatic[T](defaultValue: FromStaticConfig[T]): Provider[T] = js.native
  
  type FromStaticConfig[T] = T | js.Function0[T]
}
