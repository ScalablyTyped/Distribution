package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "isType")
@js.native
object isType extends js.Object {
  
  def apply(nodetype: js.UndefOr[scala.Nothing], targetType: String): Boolean = js.native
  def apply(nodetype: String, targetType: String): Boolean = js.native
  def apply(nodetype: Null, targetType: String): Boolean = js.native
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any */](nodetype: String, targetType: T): /* is T */ Boolean = js.native
}
