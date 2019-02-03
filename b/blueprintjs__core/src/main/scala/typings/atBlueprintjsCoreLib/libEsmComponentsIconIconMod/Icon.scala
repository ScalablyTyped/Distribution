package typings
package atBlueprintjsCoreLib.libEsmComponentsIconIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
@js.native
class Icon ()
  extends reactLib.reactMod.PureComponent[
      IIconProps with reactLib.reactMod.ReactNs.DOMAttributes[reactLib.HTMLElement], 
      js.Object, 
      js.Any
    ] {
  /** Render `<path>` elements for the given icon name. Returns `null` if name is unknown. */
  /* private */ def renderSvgPaths(pathsSize: js.Any, iconName: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
@js.native
object Icon extends js.Object {
  val SIZE_LARGE: scala.Double = js.native
  val SIZE_STANDARD: scala.Double = js.native
  var displayName: java.lang.String = js.native
}

