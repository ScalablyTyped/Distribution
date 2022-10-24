package typings.blueprintjsCore.mod

import typings.blueprintjsCore.libEsmComponentsFormsControlsMod.CheckboxProps
import typings.blueprintjsCore.libEsmComponentsFormsControlsMod.ICheckboxState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Checkbox")
@js.native
open class Checkbox protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.Checkbox {
  def this(props: CheckboxProps) = this()
  def this(props: CheckboxProps, context: Any) = this()
}
/* static members */
object Checkbox {
  
  @JSImport("@blueprintjs/core", "Checkbox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Checkbox.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(param0: CheckboxProps): ICheckboxState | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(param0.asInstanceOf[js.Any]).asInstanceOf[ICheckboxState | Null]
}
