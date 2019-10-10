package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "isType")
@js.native
object isType extends js.Object {
  def apply(nodetype: js.UndefOr[scala.Nothing], targetType: String): Boolean = js.native
  def apply(nodetype: String, targetType: String): Boolean = js.native
  def apply(nodetype: Null, targetType: String): Boolean = js.native
  def apply[T /* <: /* import warning: ImportType.apply Failed type conversion: @babel/types.@babel/types.Node['type'] */ js.Any */](nodetype: String, targetType: T): /* is T */ Boolean = js.native
}

