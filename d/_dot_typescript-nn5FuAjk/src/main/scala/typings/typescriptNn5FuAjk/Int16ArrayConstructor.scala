package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Int16ArrayConstructor
  extends StObject
     with Instantiable0[Int16Array]
     with Instantiable1[
      (/* array */ ArrayBufferLike) | (/* array */ ArrayLike[Double]) | (/* length */ Double) | (/* elements */ Iterable[Double]), 
      Int16Array
    ]
     with Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ Double, Int16Array]
     with Instantiable3[
      /* buffer */ ArrayBufferLike, 
      (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
      /* length */ Double, 
      Int16Array
    ] {
  
  /**
    * The size in bytes of each element in the array.
    */
  val BYTES_PER_ELEMENT: Double = js.native
  
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    */
  def from(arrayLike: ArrayLike[Double]): Int16Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(arrayLike: Iterable[Double]): Int16Array = js.native
  def from(arrayLike: Iterable[Double], mapfn: js.Function2[/* v */ Double, /* k */ Double, Double]): Int16Array = js.native
  def from(
    arrayLike: Iterable[Double],
    mapfn: js.Function2[/* v */ Double, /* k */ Double, Double],
    thisArg: Any
  ): Int16Array = js.native
  def from(arrayLike: Iterable[Double], mapfn: Unit, thisArg: Any): Int16Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from[T](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double]): Int16Array = js.native
  def from[T](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double], thisArg: Any): Int16Array = js.native
  
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of(items: Double*): Int16Array = js.native
}
