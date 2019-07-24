package typings
package baseuiLib.baseuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStyleFn extends js.Object {
  def apply[C /* <: styletronDashReactLib.styletronDashReactMod.StyletronComponent[_] */](component: C, style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): styletronDashReactLib.styletronDashReactMod.StyletronComponent[reactLib.reactMod.ComponentProps[C]] = js.native
  def apply[C /* <: styletronDashReactLib.styletronDashReactMod.StyletronComponent[_] */, P /* <: js.Object */](
    component: C,
    style: js.Function1[
      /* props */ P with baseuiLib.Anon_Theme, 
      styletronDashStandardLib.styletronDashStandardMod.StyleObject
    ]
  ): styletronDashReactLib.styletronDashReactMod.StyletronComponent[reactLib.reactMod.ComponentProps[C] with P] = js.native
}

