package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerBuilder[T /* <: Component */, TLayout, TItemLayout]
  extends StObject
     with ComponentBuilder[T] {
  
  def withItems(components: js.Array[Component]): ContainerBuilder[T, TLayout, TItemLayout] = js.native
  def withItems(components: js.Array[Component], itemLayout: TItemLayout): ContainerBuilder[T, TLayout, TItemLayout] = js.native
  
  def withLayout(layout: TLayout): ContainerBuilder[T, TLayout, TItemLayout] = js.native
}
