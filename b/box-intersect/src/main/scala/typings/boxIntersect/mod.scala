package typings.boxIntersect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(x: js.Array[js.Array[Double]]): js.Array[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].apply(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  @scala.inline
  def apply(x: js.Array[js.Array[Double]], visit: js.Function2[/* i */ Double, /* j */ Double, Unit]): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].apply(x.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  @scala.inline
  def apply[T /* <: js.Array[Double] */](red: js.Array[T], blue: js.Array[T]): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].apply(red.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  @scala.inline
  def apply[T /* <: js.Array[Double] */](red: js.Array[T], blue: js.Array[T], visit: js.Function2[/* i */ Double, /* j */ Double, Unit]): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].apply(red.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  @scala.inline
  def apply[T /* <: js.Array[Double] */](red: js.Array[T], blue: Unit, visit: js.Function2[/* i */ Double, /* j */ Double, Unit]): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].apply(red.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  @JSImport("box-intersect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
