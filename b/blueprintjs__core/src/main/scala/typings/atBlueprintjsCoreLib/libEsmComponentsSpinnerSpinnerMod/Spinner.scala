package typings
package atBlueprintjsCoreLib.libEsmComponentsSpinnerSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
@js.native
class Spinner ()
  extends atBlueprintjsCoreLib.libEsmCommonAbstractPureComponentMod.AbstractPureComponent[ISpinnerProps, js.Object] {
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSpinner(prevProps: ISpinnerProps): scala.Unit = js.native
  /**
       * Resolve size to a pixel value.
       * Size can be set by className, props, default, or minimum constant.
       */
  /* private */ def getSize(): js.Any = js.native
  /** Compute viewbox such that stroked track sits exactly at edge of image frame. */
  /* private */ def getViewBox(strokeWidth: js.Any): js.Any = js.native
}

@JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
@js.native
object Spinner extends js.Object {
  val SIZE_LARGE: scala.Double = js.native
  val SIZE_SMALL: scala.Double = js.native
  val SIZE_STANDARD: scala.Double = js.native
  var displayName: java.lang.String = js.native
}

