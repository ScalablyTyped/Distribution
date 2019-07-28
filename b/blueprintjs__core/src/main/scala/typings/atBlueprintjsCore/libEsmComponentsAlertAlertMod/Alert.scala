package typings.atBlueprintjsCore.libEsmComponentsAlertAlertMod

import typings.atBlueprintjsCore.libEsmCommonMod.AbstractPureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/alert/alert", "Alert")
@js.native
class Alert ()
  extends AbstractPureComponent[IAlertProps, js.Object] {
  var handleCancel: js.Any = js.native
  var handleConfirm: js.Any = js.native
  /* private */ def internalHandleCallbacks(confirmed: js.Any): js.Any = js.native
  /* private */ def internalHandleCallbacks(confirmed: js.Any, evt: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/alert/alert", "Alert")
@js.native
object Alert extends js.Object {
  var defaultProps: IAlertProps = js.native
  var displayName: String = js.native
}

