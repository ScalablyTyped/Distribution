package typings.dc.mod

import typings.d3Shape.mod.Stack_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackMixin[T] extends StObject {
  
  def hidableStacks(): Boolean = js.native
  def hidableStacks(t: Boolean): T = js.native
  @JSName("hidableStacks")
  var hidableStacks_Original: IGetSet[Boolean, T] = js.native
  
  def hideStack(name: String): Unit = js.native
  
  def showStack(name: String): Unit = js.native
  
  def stack(group: Any): Unit = js.native
  def stack(group: Any, name: String): Unit = js.native
  def stack(group: Any, name: String, accessor: Accessor[Any, Any]): Unit = js.native
  def stack(group: Any, name: Unit, accessor: Accessor[Any, Any]): Unit = js.native
  
  // title(stackName: string, titleFn: Accessor<any, T>);
  def stackLayout(): Stack_[Any, Any, Any] = js.native
  // title(stackName: string, titleFn: Accessor<any, T>);
  def stackLayout(t: Stack_[Any, Any, Any]): T = js.native
  // title(stackName: string, titleFn: Accessor<any, T>);
  @JSName("stackLayout")
  var stackLayout_Original: IGetSet[Stack_[Any, Any, Any], T] = js.native
}
