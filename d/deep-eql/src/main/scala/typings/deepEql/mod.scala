package typings.deepEql

import typings.deepEql.deepEqlBooleans.`false`
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Assert deeply nested sameValue equality between two objects of any type.
    *
    * @param leftHandOperand
    * @param rightHandOperand
    * @param [options] Additional options
    * @return equal match
    */
  inline def apply[T1, T2](leftHandOperand: T1, rightHandOperand: T2): Boolean = (^.asInstanceOf[js.Dynamic].apply(leftHandOperand.asInstanceOf[js.Any], rightHandOperand.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[T1, T2](leftHandOperand: T1, rightHandOperand: T2, options: DeepEqualOptions[T1, T2]): Boolean = (^.asInstanceOf[js.Dynamic].apply(leftHandOperand.asInstanceOf[js.Any], rightHandOperand.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("deep-eql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Memoization class used to speed up comparison.
    */
  @JSImport("deep-eql", "MemoizeMap")
  @js.native
  open class MemoizeMap ()
    extends StObject
       with WeakMap[js.Object, MemoizeMap | Boolean]
  
  trait DeepEqualOptions[T1, T2] extends StObject {
    
    /**
      * Override default algorithm, determining custom equality.
      */
    var comparator: js.UndefOr[
        js.Function2[/* leftHandOperand */ T1, /* rightHandOperand */ T2, Boolean | Null]
      ] = js.undefined
    
    /**
      * Provide a custom memoization object which will cache the results of
      * complex objects for a speed boost.
      *
      * By passing `false` you can disable memoization, but this will cause circular
      * references to blow the stack.
      */
    var memoize: js.UndefOr[MemoizeMap | `false`] = js.undefined
  }
  object DeepEqualOptions {
    
    inline def apply[T1, T2](): DeepEqualOptions[T1, T2] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepEqualOptions[T1, T2]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeepEqualOptions[?, ?], T1, T2] (val x: Self & (DeepEqualOptions[T1, T2])) extends AnyVal {
      
      inline def setComparator(value: (/* leftHandOperand */ T1, /* rightHandOperand */ T2) => Boolean | Null): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setMemoize(value: MemoizeMap | `false`): Self = StObject.set(x, "memoize", value.asInstanceOf[js.Any])
      
      inline def setMemoizeUndefined: Self = StObject.set(x, "memoize", js.undefined)
    }
  }
}
