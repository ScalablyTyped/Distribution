package typings.compareFunc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("compare-func", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T](): js.Function2[/* e1 */ T, /* e2 */ T, Double] = js.native
  def apply[T](prop: String): js.Function2[/* e1 */ T, /* e2 */ T, Double] = js.native
  def apply[T](prop: js.Array[String | extractFunc[T]]): js.Function2[/* e1 */ T, /* e2 */ T, Double] = js.native
  def apply[T](prop: extractFunc[T]): js.Function2[/* e1 */ T, /* e2 */ T, Double] = js.native
  
  type extractFunc[T] = js.Function1[/* e */ T, Double | String]
}
