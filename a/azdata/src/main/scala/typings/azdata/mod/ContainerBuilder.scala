package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerBuilder[TComponent /* <: Component */, TLayout, TItemLayout, TPropertyBag /* <: ContainerProperties */]
  extends StObject
     with ComponentBuilder[TComponent, TPropertyBag] {
  
  def withItems(components: js.Array[Component]): ContainerBuilder[TComponent, TLayout, TItemLayout, TPropertyBag] = js.native
  def withItems(components: js.Array[Component], itemLayout: TItemLayout): ContainerBuilder[TComponent, TLayout, TItemLayout, TPropertyBag] = js.native
  
  def withLayout(layout: TLayout): ContainerBuilder[TComponent, TLayout, TItemLayout, TPropertyBag] = js.native
}
