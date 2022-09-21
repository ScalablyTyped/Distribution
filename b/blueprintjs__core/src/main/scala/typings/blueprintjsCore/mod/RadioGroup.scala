package typings.blueprintjsCore.mod

import typings.blueprintjsCore.radioGroupMod.RadioGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "RadioGroup")
@js.native
open class RadioGroup protected ()
  extends typings.blueprintjsCore.componentsMod.RadioGroup {
  def this(props: RadioGroupProps) = this()
  def this(props: RadioGroupProps, context: Any) = this()
}
/* static members */
object RadioGroup {
  
  @JSImport("@blueprintjs/core", "RadioGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "RadioGroup.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
