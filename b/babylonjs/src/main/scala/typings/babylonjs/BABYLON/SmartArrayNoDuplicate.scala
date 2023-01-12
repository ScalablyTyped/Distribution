package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartArrayNoDuplicate[T]
  extends StObject
     with SmartArray[T] {
  
  /* private */ var _duplicateId: Any
  
  /**
    * Concats the active data with a given array.
    * This ensures no duplicate will be present in the result.
    * @param array defines the data to concatenate with.
    */
  def concatWithNoDuplicate(array: Any): Unit
  
  /**
    * Pushes a value at the end of the active data.
    * If the data is already present, it won t be added again
    * @param value defines the object to push in the array.
    * @returns true if added false if it was already present
    */
  def pushNoDuplicate(value: T): Boolean
}
object SmartArrayNoDuplicate {
  
  inline def apply[T](
    _duplicateId: Any,
    _id: Double,
    concat: Any => Unit,
    concatWithNoDuplicate: Any => Unit,
    contains: T => Boolean,
    data: js.Array[T],
    dispose: () => Unit,
    forEach: js.Function1[T, Unit] => Unit,
    indexOf: T => Double,
    length: Double,
    push: T => Unit,
    pushNoDuplicate: T => Boolean,
    reset: () => Unit,
    sort: js.Function2[T, T, Double] => Unit
  ): SmartArrayNoDuplicate[T] = {
    val __obj = js.Dynamic.literal(_duplicateId = _duplicateId.asInstanceOf[js.Any], _id = _id.asInstanceOf[js.Any], concat = js.Any.fromFunction1(concat), concatWithNoDuplicate = js.Any.fromFunction1(concatWithNoDuplicate), contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), forEach = js.Any.fromFunction1(forEach), indexOf = js.Any.fromFunction1(indexOf), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), pushNoDuplicate = js.Any.fromFunction1(pushNoDuplicate), reset = js.Any.fromFunction0(reset), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[SmartArrayNoDuplicate[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartArrayNoDuplicate[?], T] (val x: Self & SmartArrayNoDuplicate[T]) extends AnyVal {
    
    inline def setConcatWithNoDuplicate(value: Any => Unit): Self = StObject.set(x, "concatWithNoDuplicate", js.Any.fromFunction1(value))
    
    inline def setPushNoDuplicate(value: T => Boolean): Self = StObject.set(x, "pushNoDuplicate", js.Any.fromFunction1(value))
    
    inline def set_duplicateId(value: Any): Self = StObject.set(x, "_duplicateId", value.asInstanceOf[js.Any])
  }
}
