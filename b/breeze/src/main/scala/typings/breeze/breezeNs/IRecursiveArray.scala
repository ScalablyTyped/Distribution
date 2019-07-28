package typings.breeze.breezeNs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRecursiveArray[T] extends /* i */ NumberDictionary[T | IRecursiveArray[T]]

object IRecursiveArray {
  @scala.inline
  def apply[T](NumberDictionary: /* i */ NumberDictionary[T | IRecursiveArray[T]] = null): IRecursiveArray[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[IRecursiveArray[T]]
  }
}

