package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.popoverMod.IPopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Popover")
@js.native
class Popover protected ()
  extends typings.blueprintjsCore.popoverMod.Popover {
  def this(props: IPopoverProps) = this()
  def this(props: IPopoverProps, context: js.Any) = this()
}
/* static members */
object Popover {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Popover")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Popover.defaultProps")
  @js.native
  def defaultProps: IPopoverProps = js.native
  @scala.inline
  def defaultProps_=(x: IPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Popover.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
