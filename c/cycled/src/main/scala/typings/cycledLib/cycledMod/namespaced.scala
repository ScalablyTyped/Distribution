package typings
package cycledLib.cycledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable:jsdoc-format
@JSImport("cycled", JSImport.Namespace)
@js.native
class namespaced[T] protected () extends Cycled[T] {
  /**
       * Initiates an array subclass with the methods documented below.
       * Since it's an array, you can use all the normal array methods on it.
       *
       * The instance is an iterable that will cycle through the array.
       * It will cycle through the number of elements equaling the length of the array from the current index.
       * ```
  const numberCycle = new Cycled([1,2,3,4,5]);
  
  console.log(...numberCycle);
  //=> 1 2 3 4 5
  ```
       *
       * @param input
       */
  def this(input: js.Array[T]) = this()
}

