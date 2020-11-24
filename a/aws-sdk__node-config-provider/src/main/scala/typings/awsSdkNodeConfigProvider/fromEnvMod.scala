package typings.awsSdkNodeConfigProvider

import typings.awsSdkTypes.utilMod.Provider
import typings.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-config-provider/dist/cjs/fromEnv", JSImport.Namespace)
@js.native
object fromEnvMod extends js.Object {
  
  def fromEnv[T](envVarSelector: GetterFromEnv[T]): Provider[T] = js.native
  
  type GetterFromEnv[T] = js.Function1[/* env */ ProcessEnv, js.UndefOr[T]]
}
