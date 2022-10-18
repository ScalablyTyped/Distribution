package typings.blueprintjsCore.libEsmComponentsMod

import typings.blueprintjsCore.libEsmComponentsToastToasterMod.IToasterProps
import typings.blueprintjsCore.libEsmComponentsToastToasterMod.ToasterInstance
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Toaster")
@js.native
open class Toaster protected ()
  extends typings.blueprintjsCore.libEsmComponentsToastToasterMod.Toaster {
  def this(props: IToasterProps) = this()
  def this(props: IToasterProps, context: Any) = this()
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
  inline def create(): ToasterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ToasterInstance]
  inline def create(props: Unit, container: HTMLElement): ToasterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ToasterInstance]
  inline def create(props: IToasterProps): ToasterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any]).asInstanceOf[ToasterInstance]
  inline def create(props: IToasterProps, container: HTMLElement): ToasterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ToasterInstance]
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Toaster.defaultProps")
  @js.native
  def defaultProps: IToasterProps = js.native
  inline def defaultProps_=(x: IToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Toaster.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
