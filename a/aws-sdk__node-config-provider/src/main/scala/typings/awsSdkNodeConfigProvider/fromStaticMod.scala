package typings.awsSdkNodeConfigProvider

import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromStaticMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist/cjs/fromStatic", "fromStatic")
  @js.native
  def fromStatic[T](defaultValue: FromStaticConfig[T]): Provider[T] = js.native
  
  type FromStaticConfig[T] = T | js.Function0[T]
}
