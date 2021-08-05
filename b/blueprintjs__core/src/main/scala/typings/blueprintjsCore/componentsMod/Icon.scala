package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.iconMod.IIconProps
import typings.react.mod.DOMAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Icon")
@js.native
class Icon protected ()
  extends typings.blueprintjsCore.iconMod.Icon {
  def this(props: IIconProps & DOMAttributes[HTMLElement]) = this()
  def this(props: IIconProps & DOMAttributes[HTMLElement], context: js.Any) = this()
}
/* static members */
object Icon {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Icon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Icon.SIZE_LARGE")
  @js.native
  val SIZE_LARGE: /* 20 */ Double = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Icon.SIZE_STANDARD")
  @js.native
  val SIZE_STANDARD: /* 16 */ Double = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Icon.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
