package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.HasEverOpened
import typings.blueprintjsCore.overlayMod.IOverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Overlay")
@js.native
class Overlay ()
  extends typings.blueprintjsCore.overlayMod.Overlay
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components", "Overlay")
@js.native
object Overlay extends js.Object {
  
  var defaultProps: IOverlayProps = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(hasIsOpen: IOverlayProps): HasEverOpened | Null = js.native
  
  var getLastOpened: js.Any = js.native
  
  var openStack: js.Any = js.native
}
