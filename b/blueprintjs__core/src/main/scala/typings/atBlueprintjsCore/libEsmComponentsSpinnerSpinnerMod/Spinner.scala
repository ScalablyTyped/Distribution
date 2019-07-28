package typings.atBlueprintjsCore.libEsmComponentsSpinnerSpinnerMod

import typings.atBlueprintjsCore.libEsmCommonAbstractPureComponentMod.AbstractPureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
@js.native
class Spinner ()
  extends AbstractPureComponent[ISpinnerProps, js.Object] {
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSpinner(prevProps: ISpinnerProps): Unit = js.native
  /**
    * Resolve size to a pixel value.
    * Size can be set by className, props, default, or minimum constant.
    */
  /* private */ def getSize(): js.Any = js.native
  /** Compute viewbox such that stroked track sits exactly at edge of image frame. */
  /* private */ def getViewBox(strokeWidth: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
@js.native
object Spinner extends js.Object {
  val SIZE_LARGE: Double = js.native
  val SIZE_SMALL: Double = js.native
  val SIZE_STANDARD: Double = js.native
  var displayName: String = js.native
}

