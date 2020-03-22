package typings.cathoQuantum

import typings.cathoQuantum.buttonMod.ButtonProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@catho/quantum/SocialButton", JSImport.Namespace)
@js.native
object socialButtonMod extends js.Object {
  @js.native
  trait SocialButtonProps extends ButtonProps {
    var provider: String = js.native
  }
  
  @js.native
  class default ()
    extends Component[SocialButtonProps, js.Object, js.Any]
  
  type SocialButton = Component[SocialButtonProps, js.Object, js.Any]
}

