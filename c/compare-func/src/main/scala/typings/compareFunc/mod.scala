package typings.compareFunc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](): js.Function2[/* e1 */ T, /* e2 */ T, Double] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function2[/* e1 */ T, /* e2 */ T, Double]]
  @scala.inline
  def apply[T](prop: String): js.Function2[/* e1 */ T, /* e2 */ T, Double] = ^.asInstanceOf[js.Dynamic].apply(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e1 */ T, /* e2 */ T, Double]]
  @scala.inline
  def apply[T](prop: js.Array[String | extractFunc[T]]): js.Function2[/* e1 */ T, /* e2 */ T, Double] = ^.asInstanceOf[js.Dynamic].apply(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e1 */ T, /* e2 */ T, Double]]
  @scala.inline
  def apply[T](prop: extractFunc[T]): js.Function2[/* e1 */ T, /* e2 */ T, Double] = ^.asInstanceOf[js.Dynamic].apply(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e1 */ T, /* e2 */ T, Double]]
  
  @JSImport("compare-func", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type extractFunc[T] = js.Function1[/* e */ T, Double | String]
}
