package typings.blueprintjsCore.reactUtilsMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", "ensureElement")
@js.native
object ensureElement extends js.Object {
  
  def apply(): js.UndefOr[ReactElement] = js.native
  def apply(
    child: js.UndefOr[ReactNode],
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ): js.UndefOr[ReactElement] = js.native
  def apply(child: ReactNode): js.UndefOr[ReactElement] = js.native
}
