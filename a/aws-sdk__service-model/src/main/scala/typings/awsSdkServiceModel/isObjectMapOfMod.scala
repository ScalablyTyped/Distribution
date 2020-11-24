package typings.awsSdkServiceModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/service-model/build/ApiModel/isObjectMapOf", JSImport.Namespace)
@js.native
object isObjectMapOfMod extends js.Object {
  
  def isObjectMapOf[T](arg: js.Any, determiner: Determiner[T]): Boolean = js.native
  
  type Determiner[T] = js.Function1[/* arg */ js.Any, /* is T */ Boolean]
}
