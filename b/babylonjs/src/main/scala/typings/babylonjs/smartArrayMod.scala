package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smartArrayMod {
  
  @JSImport("babylonjs/Misc/smartArray", "SmartArray")
  @js.native
  class SmartArray[T] protected () extends ISmartArrayLike[T] {
    /**
      * Instantiates a Smart Array.
      * @param capacity defines the default capacity of the array.
      */
    def this(capacity: Double) = this()
    
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
  /* static members */
  object SmartArray {
    
    @JSImport("babylonjs/Misc/smartArray", "SmartArray")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/smartArray", "SmartArray._GlobalId")
    @js.native
    def _GlobalId: js.Any = js.native
    @scala.inline
    def _GlobalId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GlobalId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/smartArray", "SmartArrayNoDuplicate")
  @js.native
  class SmartArrayNoDuplicate[T] protected () extends SmartArray[T] {
    /**
      * Instantiates a Smart Array.
      * @param capacity defines the default capacity of the array.
      */
    def this(capacity: Double) = this()
    
    var _duplicateId: js.Any = js.native
    
    /**
      * Concats the active data with a given array.
      * This ensures no dupplicate will be present in the result.
      * @param array defines the data to concatenate with.
      */
    def concatWithNoDuplicate(array: js.Any): Unit = js.native
    
    /**
      * Pushes a value at the end of the active data.
      * If the data is already present, it won t be added again
      * @param value defines the object to push in the array.
      * @returns true if added false if it was already present
      */
    def pushNoDuplicate(value: T): Boolean = js.native
  }
  
  @js.native
  trait ISmartArrayLike[T] extends StObject {
    
    /**
      * The data of the array.
      */
    var data: js.Array[T] = js.native
    
    /**
      * The active length of the array.
      */
    var length: Double = js.native
  }
  object ISmartArrayLike {
    
    @scala.inline
    def apply[T](data: js.Array[T], length: Double): ISmartArrayLike[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISmartArrayLike[T]]
    }
    
    @scala.inline
    implicit class ISmartArrayLikeMutableBuilder[Self <: ISmartArrayLike[_], T] (val x: Self with ISmartArrayLike[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
