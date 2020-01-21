package typings.awsSdkServiceModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/service-model/build/ApiModel/isArrayOf", JSImport.Namespace)
@js.native
object isArrayOfMod extends js.Object {
  def isArrayOf[T](arg: js.Any, determiner: Determiner[T]): /* is std.Array<T> */ Boolean = js.native
  type Determiner[T] = js.Function1[/* arg */ js.Any, /* is T */ Boolean]
}

