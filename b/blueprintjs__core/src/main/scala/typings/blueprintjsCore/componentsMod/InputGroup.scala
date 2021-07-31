package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "InputGroup")
@js.native
class InputGroup protected ()
  extends typings.blueprintjsCore.inputGroupMod.InputGroup {
  def this(props: IInputGroupProps & HTMLInputProps) = this()
  def this(props: IInputGroupProps & HTMLInputProps, context: js.Any) = this()
}
/* static members */
object InputGroup {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "InputGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "InputGroup.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
