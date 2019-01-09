package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackMixin[T] extends js.Object {
  @JSName("hidableStacks")
  var hidableStacks_Original: IGetSet[scala.Boolean, T] = js.native
  // title(stackName: string, titleFn: Accessor<any, T>);
  @JSName("stackLayout")
  var stackLayout_Original: IGetSet[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.layout.Stack<Array<any>, any> */ _, 
    T
  ] = js.native
  def hidableStacks(): scala.Boolean = js.native
  def hidableStacks(t: scala.Boolean): scala.Boolean = js.native
  def hideStack(name: java.lang.String): scala.Unit = js.native
  def showStack(name: java.lang.String): scala.Unit = js.native
  def stack(group: js.Any): scala.Unit = js.native
  def stack(group: js.Any, name: java.lang.String): scala.Unit = js.native
  def stack(group: js.Any, name: java.lang.String, accessor: Accessor[_, _]): scala.Unit = js.native
  // title(stackName: string, titleFn: Accessor<any, T>);
  def stackLayout(): js.Any = js.native
  // title(stackName: string, titleFn: Accessor<any, T>);
  def stackLayout(
    t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.layout.Stack<Array<any>, any> */ js.Any
  ): js.Any = js.native
}

