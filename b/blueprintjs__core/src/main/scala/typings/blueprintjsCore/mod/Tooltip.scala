package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.PartialTooltipProps
import typings.blueprintjsCore.libEsmComponentsTooltipTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tooltip")
@js.native
open class Tooltip protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.Tooltip {
  def this(props: TooltipProps) = this()
  def this(props: TooltipProps, context: Any) = this()
}
/* static members */
object Tooltip {
  
  @JSImport("@blueprintjs/core", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Tooltip.defaultProps")
  @js.native
  def defaultProps: PartialTooltipProps = js.native
  inline def defaultProps_=(x: PartialTooltipProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Tooltip.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
