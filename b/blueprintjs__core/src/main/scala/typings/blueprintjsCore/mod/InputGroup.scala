package typings.blueprintjsCore.mod

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "InputGroup")
@js.native
class InputGroup protected ()
  extends typings.blueprintjsCore.componentsMod.InputGroup {
  def this(props: IInputGroupProps with HTMLInputProps) = this()
  def this(props: IInputGroupProps with HTMLInputProps, context: js.Any) = this()
}
/* static members */
object InputGroup {
  
  @JSImport("@blueprintjs/core", "InputGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "InputGroup.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
