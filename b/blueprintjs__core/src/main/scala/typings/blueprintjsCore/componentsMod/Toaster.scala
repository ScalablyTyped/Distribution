package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.toasterMod.IToaster
import typings.blueprintjsCore.toasterMod.IToasterProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Toaster")
@js.native
class Toaster protected ()
  extends typings.blueprintjsCore.toasterMod.Toaster {
  def this(props: IToasterProps) = this()
  def this(props: IToasterProps, context: js.Any) = this()
}
/* static members */
object Toaster {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Toaster")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new `Toaster` instance that can be shared around your application.
    * The `Toaster` will be rendered into a new element appended to the given container.
    */
  inline def create(): IToaster = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IToaster]
  inline def create(props: Unit, container: HTMLElement): IToaster = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[IToaster]
  inline def create(props: IToasterProps): IToaster = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any]).asInstanceOf[IToaster]
  inline def create(props: IToasterProps, container: HTMLElement): IToaster = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[IToaster]
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Toaster.defaultProps")
  @js.native
  def defaultProps: IToasterProps = js.native
  inline def defaultProps_=(x: IToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Toaster.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
