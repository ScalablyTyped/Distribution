package typings.atBlueprintjsCore.libEsmComponentsIconIconMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.PureComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
@js.native
class Icon ()
  extends PureComponent[IIconProps with DOMAttributes[HTMLElement], js.Object, js.Any] {
  /** Render `<path>` elements for the given icon name. Returns `null` if name is unknown. */
  /* private */ def renderSvgPaths(pathsSize: js.Any, iconName: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
@js.native
object Icon extends js.Object {
  val SIZE_LARGE: Double = js.native
  val SIZE_STANDARD: Double = js.native
  var displayName: String = js.native
}

