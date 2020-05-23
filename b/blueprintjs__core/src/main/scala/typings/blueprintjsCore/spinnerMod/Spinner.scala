package typings.blueprintjsCore.spinnerMod

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
@js.native
class Spinner ()
  extends AbstractPureComponent2[ISpinnerProps, js.Object, js.Object] {
  /**
    * Resolve size to a pixel value.
    * Size can be set by className, props, default, or minimum constant.
    */
  var getSize: js.Any = js.native
  /** Compute viewbox such that stroked track sits exactly at edge of image frame. */
  var getViewBox: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSpinner(prevProps: ISpinnerProps): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
@js.native
object Spinner extends js.Object {
  val SIZE_LARGE: /* 100 */ Double = js.native
  val SIZE_SMALL: /* 20 */ Double = js.native
  val SIZE_STANDARD: /* 50 */ Double = js.native
  var displayName: String = js.native
}

