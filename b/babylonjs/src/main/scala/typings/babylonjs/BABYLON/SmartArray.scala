package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartArray[T] extends ISmartArrayLike[T] {
  
  var _id: Double = js.native
  
  /**
    * Concats the active data with a given array.
    * @param array defines the data to concatenate with.
    */
  def concat(array: js.Any): Unit = js.native
  
  /**
    * Returns whether an element is part of the active data.
    * @param value defines the value to look for
    * @returns true if found in the active data otherwise false
    */
  def contains(value: T): Boolean = js.native
  
  /**
    * Releases all the data from the array as well as the array.
    */
  def dispose(): Unit = js.native
  
  /**
    * Iterates over the active data and apply the lambda to them.
    * @param func defines the action to apply on each value.
    */
  def forEach(func: js.Function1[/* content */ T, Unit]): Unit = js.native
  
  /**
    * Returns the position of a value in the active data.
    * @param value defines the value to find the index for
    * @returns the index if found in the active data otherwise -1
    */
  def indexOf(value: T): Double = js.native
  
  /**
    * Pushes a value at the end of the active data.
    * @param value defines the object to push in the array.
    */
  def push(value: T): Unit = js.native
  
  /**
    * Resets the active data to an empty array.
    */
  def reset(): Unit = js.native
  
  /**
    * Sorts the full sets of data.
    * @param compareFn defines the comparison function to apply.
    */
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
}
object SmartArray {
  
  @scala.inline
  def apply[T](
    _id: Double,
    concat: js.Any => Unit,
    contains: T => Boolean,
    data: js.Array[T],
    dispose: () => Unit,
    forEach: js.Function1[/* content */ T, Unit] => Unit,
    indexOf: T => Double,
    length: Double,
    push: T => Unit,
    reset: () => Unit,
    sort: js.Function2[/* a */ T, /* b */ T, Double] => Unit
  ): SmartArray[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], concat = js.Any.fromFunction1(concat), contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), forEach = js.Any.fromFunction1(forEach), indexOf = js.Any.fromFunction1(indexOf), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[SmartArray[T]]
  }
  
  @scala.inline
  implicit class SmartArrayOps[Self <: SmartArray[_], T] (val x: Self with SmartArray[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_id(value: Double): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcat(value: js.Any => Unit): Self = this.set("concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContains(value: T => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForEach(value: js.Function1[/* content */ T, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOf(value: T => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPush(value: T => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSort(value: js.Function2[/* a */ T, /* b */ T, Double] => Unit): Self = this.set("sort", js.Any.fromFunction1(value))
  }
}
