package typings.breeze.breeze

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRecursiveArray[T] extends /* i */ NumberDictionary[T | IRecursiveArray[T]]

object IRecursiveArray {
  @scala.inline
  def apply[T](): IRecursiveArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecursiveArray[T]]
  }
}

