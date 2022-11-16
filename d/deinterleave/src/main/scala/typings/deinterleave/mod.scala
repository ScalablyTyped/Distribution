package typings.deinterleave

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Rearrange source elements so that it has planar layout:
    *
    * `[a,b,c, a,b,c, ...]` → `[a,a,a,..., b,b,b,..., c,c,c]`
    *
    * @param src The array to rearrange.
    * @param [stride=2] Indicates number of elements per group, eg. in case of audio buffer it is number of channels.
    *
    * @example
    * import deinterleave = require('deinterleave')
    *
    * const array = [1,0,1,0,1,0,1,0]
    * deinterleave(array, 2)
    *
    * // array is [1,1,1,1,0,0,0,0]
    */
  inline def apply[TArr /* <: MutableArrayLike[Any] */](src: TArr): TArr = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[TArr]
  inline def apply[TArr /* <: MutableArrayLike[Any] */](src: TArr, stride: Double): TArr = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[TArr]
  
  @JSImport("deinterleave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MutableArrayLike[T]
    extends StObject
       with /* n */ NumberDictionary[T] {
    
    var length: Double
  }
  object MutableArrayLike {
    
    inline def apply[T](length: Double): MutableArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableArrayLike[T]]
    }
    
    extension [Self <: MutableArrayLike[?], T](x: Self & MutableArrayLike[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
