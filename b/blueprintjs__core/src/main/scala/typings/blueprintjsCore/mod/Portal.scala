package typings.blueprintjsCore.mod

import typings.blueprintjsCore.portalMod.IPortalContext
import typings.blueprintjsCore.portalMod.IPortalProps
import typings.propTypes.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Portal")
@js.native
class Portal ()
  extends typings.blueprintjsCore.componentsMod.Portal

/* static members */
@JSImport("@blueprintjs/core", "Portal")
@js.native
object Portal extends js.Object {
  var contextTypes: ValidationMap[IPortalContext] = js.native
  var defaultProps: IPortalProps = js.native
  var displayName: String = js.native
}

