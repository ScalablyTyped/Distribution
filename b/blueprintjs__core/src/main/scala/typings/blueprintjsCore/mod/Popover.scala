package typings.blueprintjsCore.mod

import typings.blueprintjsCore.popoverMod.IPopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Popover")
@js.native
open class Popover protected ()
  extends typings.blueprintjsCore.componentsMod.Popover {
  def this(props: IPopoverProps) = this()
  def this(props: IPopoverProps, context: Any) = this()
}
/* static members */
object Popover {
  
  @JSImport("@blueprintjs/core", "Popover")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Popover.defaultProps")
  @js.native
  def defaultProps: IPopoverProps = js.native
  inline def defaultProps_=(x: IPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Popover.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
