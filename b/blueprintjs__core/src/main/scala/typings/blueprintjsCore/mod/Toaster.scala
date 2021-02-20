package typings.blueprintjsCore.mod

import typings.blueprintjsCore.toasterMod.IToaster
import typings.blueprintjsCore.toasterMod.IToasterProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Toaster")
@js.native
class Toaster protected ()
  extends typings.blueprintjsCore.componentsMod.Toaster {
  def this(props: IToasterProps) = this()
  def this(props: IToasterProps, context: js.Any) = this()
}
/* static members */
object Toaster {
  
  @JSImport("@blueprintjs/core", "Toaster")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new `Toaster` instance that can be shared around your application.
    * The `Toaster` will be rendered into a new element appended to the given container.
    */
  @JSImport("@blueprintjs/core", "Toaster.create")
  @js.native
  def create(): IToaster = js.native
  @JSImport("@blueprintjs/core", "Toaster.create")
  @js.native
  def create(props: js.UndefOr[scala.Nothing], container: HTMLElement): IToaster = js.native
  @JSImport("@blueprintjs/core", "Toaster.create")
  @js.native
  def create(props: IToasterProps): IToaster = js.native
  @JSImport("@blueprintjs/core", "Toaster.create")
  @js.native
  def create(props: IToasterProps, container: HTMLElement): IToaster = js.native
  
  @JSImport("@blueprintjs/core", "Toaster.defaultProps")
  @js.native
  def defaultProps: IToasterProps = js.native
  @scala.inline
  def defaultProps_=(x: IToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Toaster.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
