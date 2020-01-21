package typings.blueprintjsTable.guidesMod

import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGuideLayerProps extends IProps {
  /**
    *  The top-offset location of the horizontal guides
    */
  var horizontalGuides: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    *  The left-offset location of the vertical guides
    */
  var verticalGuides: js.UndefOr[js.Array[Double]] = js.undefined
}

object IGuideLayerProps {
  @scala.inline
  def apply(
    className: String = null,
    horizontalGuides: js.Array[Double] = null,
    verticalGuides: js.Array[Double] = null
  ): IGuideLayerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (horizontalGuides != null) __obj.updateDynamic("horizontalGuides")(horizontalGuides.asInstanceOf[js.Any])
    if (verticalGuides != null) __obj.updateDynamic("verticalGuides")(verticalGuides.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGuideLayerProps]
  }
}

