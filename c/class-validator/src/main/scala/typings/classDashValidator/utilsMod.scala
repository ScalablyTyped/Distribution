package typings.classDashValidator

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def convertToArray[T](`val`: js.Array[T]): js.Array[T] = js.native
  def convertToArray[T](`val`: Map[_, T]): js.Array[T] = js.native
  def convertToArray[T](`val`: Set[T]): js.Array[T] = js.native
  def isPromise[T](p: js.Any): /* is std.Promise<T> */ Boolean = js.native
}

