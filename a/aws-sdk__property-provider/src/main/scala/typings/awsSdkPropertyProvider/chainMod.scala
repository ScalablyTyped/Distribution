package typings.awsSdkPropertyProvider

import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/property-provider/dist/cjs/chain", JSImport.Namespace)
@js.native
object chainMod extends js.Object {
  
  def chain[T](providers: Provider[T]*): Provider[T] = js.native
}
