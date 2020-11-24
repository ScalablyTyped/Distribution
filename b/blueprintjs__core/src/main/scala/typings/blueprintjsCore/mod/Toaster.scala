package typings.blueprintjsCore.mod

import typings.blueprintjsCore.toasterMod.IToaster
import typings.blueprintjsCore.toasterMod.IToasterProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Toaster")
@js.native
class Toaster ()
  extends typings.blueprintjsCore.componentsMod.Toaster
/* static members */
@JSImport("@blueprintjs/core", "Toaster")
@js.native
object Toaster extends js.Object {
  
  /**
    * Create a new `Toaster` instance that can be shared around your application.
    * The `Toaster` will be rendered into a new element appended to the given container.
    */
  def create(): IToaster = js.native
  def create(props: js.UndefOr[scala.Nothing], container: HTMLElement): IToaster = js.native
  def create(props: IToasterProps): IToaster = js.native
  def create(props: IToasterProps, container: HTMLElement): IToaster = js.native
  
  var defaultProps: IToasterProps = js.native
  
  var displayName: String = js.native
}
