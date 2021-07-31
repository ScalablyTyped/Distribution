package typings.dc.mod

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
  
  def stack(group: js.Any): Unit = js.native
  def stack(group: js.Any, name: String): Unit = js.native
  def stack(group: js.Any, name: String, accessor: Accessor[js.Any, js.Any]): Unit = js.native
  def stack(group: js.Any, name: Unit, accessor: Accessor[js.Any, js.Any]): Unit = js.native
  
  // title(stackName: string, titleFn: Accessor<any, T>);
  def stackLayout(): js.Any = js.native
  // title(stackName: string, titleFn: Accessor<any, T>);
  def stackLayout(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.layout.Stack<Array<any>, any> */ js.Any
  ): T = js.native
  // title(stackName: string, titleFn: Accessor<any, T>);
  @JSName("stackLayout")
  var stackLayout_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.layout.Stack<Array<any>, any> */ js.Any, 
    T
  ] = js.native
}
