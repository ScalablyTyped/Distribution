package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsEthereumAddress", JSImport.Namespace)
@js.native
object isEthereumAddressMod extends js.Object {
  
  val IS_ETHEREUM_ADDRESS: /* "isEthereumAddress" */ String = js.native
  
  @JSName("IsEthereumAddress")
  def IsEthereumAddress_(): PropertyDecorator = js.native
  @JSName("IsEthereumAddress")
  def IsEthereumAddress_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isEthereumAddress(value: js.Any): Boolean = js.native
}
