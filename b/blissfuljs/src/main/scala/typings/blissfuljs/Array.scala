package typings.blissfuljs

import typings.blissfuljs.BlissNS.BlissBindedArray
import typings.blissfuljs.BlissNS.BlissCollectionArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array[T] extends StObject {
  
  @JSName("_")
  var _underscore: BlissBindedArray[T] & BlissCollectionArray[T]
}
object Array {
  
  @scala.inline
  def apply[T](_underscore: BlissBindedArray[T] & BlissCollectionArray[T]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
  
  @scala.inline
  implicit class ArrayMutableBuilder[Self <: Array[?], T] (val x: Self & Array[T]) extends AnyVal {
    
    @scala.inline
    def set_underscore(value: BlissBindedArray[T] & BlissCollectionArray[T]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
