package typings.babelTypes.mod

import typings.babelTypes.AnonType
import typings.std.Extract
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "is")
@js.native
object is extends js.Object {
  def apply(`type`: String): /* is @babel/types.@babel/types.Node */ Boolean = js.native
  def apply(`type`: String, n: js.UndefOr[Node], required: Partial[Node]): /* is @babel/types.@babel/types.Node */ Boolean = js.native
  def apply(`type`: String, n: Null, required: Partial[Node]): /* is @babel/types.@babel/types.Node */ Boolean = js.native
  def apply(`type`: String, n: Node): /* is @babel/types.@babel/types.Node */ Boolean = js.native
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237 */ js.Any */](`type`: T): /* is std.Extract<@babel/types.@babel/types.Node, @babel/types.AnonType<T>> */ Boolean = js.native
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237 */ js.Any */](`type`: T, n: Node): /* is std.Extract<@babel/types.@babel/types.Node, @babel/types.AnonType<T>> */ Boolean = js.native
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237 */ js.Any */, P /* <: Extract[Node, AnonType[T]] */](`type`: T, n: js.UndefOr[Node], required: Partial[P]): /* is P */ Boolean = js.native
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237 */ js.Any */, P /* <: Extract[Node, AnonType[T]] */](`type`: T, n: Null, required: Partial[P]): /* is P */ Boolean = js.native
}

