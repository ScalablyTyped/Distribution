package typings.awsSdkNodeConfigProvider.fromSharedConfigFilesMod

import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-config-provider/dist/cjs/fromSharedConfigFiles", "fromSharedConfigFiles")
@js.native
object fromSharedConfigFiles extends js.Object {
  
  def apply[T](configSelector: GetterFromConfig[T]): Provider[T] = js.native
  def apply[T](configSelector: GetterFromConfig[T], hasPreferredFileInit: SharedConfigInit): Provider[T] = js.native
}
