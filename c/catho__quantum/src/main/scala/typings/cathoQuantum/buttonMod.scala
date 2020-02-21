package typings.cathoQuantum

import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.reset
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.submit
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import typings.cathoQuantum.iconButtonMod.IconButton
import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@catho/quantum/components/Button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  trait ButtonProps[T] extends js.Object {
    @JSName("$as")
    var $as: js.UndefOr[Element | String] = js.native
    var center: js.UndefOr[Boolean] = js.native
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var full: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[String] = js.native
    var id: js.UndefOr[String] = js.native
    var onClick: js.UndefOr[MouseEventHandler[T]] = js.native
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
    var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.native
    var stroked: js.UndefOr[Boolean] = js.native
    var theme: js.UndefOr[AnonBaseFontSizeBreakpoints] = js.native
    var `type`: js.UndefOr[button | reset | submit] = js.native
  }
  
  @js.native
  class default[T] ()
    extends Component[ButtonProps[T], js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Icon: IconButton = js.native
  }
  
  type Button[T] = Component[ButtonProps[T], js.Object, js.Any]
}

