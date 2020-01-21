package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def isArray(x: js.Any): Boolean = js.native
  def isObservable[T](x: js.Any): /* is baconjs.baconjs/types/observable.default<T> */ Boolean = js.native
  def nop(): Unit = js.native
}

