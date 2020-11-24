package typings.blueprintjsCore.iconMod

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.DOMAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
@js.native
class Icon ()
  extends AbstractPureComponent2[IIconProps with DOMAttributes[HTMLElement], js.Object, js.Object] {
  
  /** Render `<path>` elements for the given icon name. Returns `null` if name is unknown. */
  var renderSvgPaths: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
@js.native
object Icon extends js.Object {
  
  val SIZE_LARGE: /* 20 */ Double = js.native
  
  val SIZE_STANDARD: /* 16 */ Double = js.native
  
  var displayName: String = js.native
}
