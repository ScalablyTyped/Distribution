package typings.combinations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](arr: js.Array[T]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
  @scala.inline
  def apply[T](arr: js.Array[T], min: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  @scala.inline
  def apply[T](arr: js.Array[T], min: Double, max: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  @scala.inline
  def apply[T](arr: js.Array[T], min: Unit, max: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  @JSImport("combinations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
