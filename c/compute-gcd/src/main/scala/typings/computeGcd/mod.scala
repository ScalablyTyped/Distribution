package typings.computeGcd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(firstValue: Double, secondValue: Double, values: Double*): Double = (^.asInstanceOf[js.Dynamic].apply((List(firstValue.asInstanceOf[js.Any], secondValue.asInstanceOf[js.Any])).`++`(values.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def apply(singleValue: js.Array[Double]): Null = ^.asInstanceOf[js.Dynamic].apply(singleValue.asInstanceOf[js.Any]).asInstanceOf[Null]
  // If provided an array with a length less than 2 or a single integer argument, the function returns `null`.
  inline def apply(singleValue: Double): Null = ^.asInstanceOf[js.Dynamic].apply(singleValue.asInstanceOf[js.Any]).asInstanceOf[Null]
  inline def apply(values: Array[Double]): Double = ^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(values: Double*): Double | Null = ^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double | Null]
  inline def apply[T](singleValue: js.Array[T], accessor: Accessor[T]): Double | Null = (^.asInstanceOf[js.Dynamic].apply(singleValue.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  inline def apply[T](values: Array[T], accessor: Accessor[T]): Double = (^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("compute-gcd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Accessor[T] = js.Function1[/* item */ T, Double]
}
