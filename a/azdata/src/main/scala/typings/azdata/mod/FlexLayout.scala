package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexLayout extends js.Object {
  /**
    * Matches the align-content CSS property.
    */
  var alignContent: js.UndefOr[AlignContentType] = js.undefined
  /**
    * Matches the align-items CSS property.
    */
  var alignItems: js.UndefOr[AlignItemsType] = js.undefined
  /**
    * Matches the flex-flow CSS property and its available values.
    * To layout as a vertical view use "column", and for horizontal
    * use "row".
    */
  var flexFlow: js.UndefOr[String] = js.undefined
  /**
    *  Matches the flex-wrap CSS property.
    */
  var flexWrap: js.UndefOr[FlexWrapType] = js.undefined
  /**
    * Container Height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Matches the justify-content CSS property.
    */
  var justifyContent: js.UndefOr[JustifyContentType] = js.undefined
  /**
    * The position CSS property. Empty by default.
    * This is particularly useful if laying out components inside a FlexContainer and
    * the size of the component is meant to be a fixed size. In this case the position must be
    * set to 'absolute', with the parent FlexContainer having 'relative' position.
    * Without this the component will fail to correctly size itself.
    */
  var position: js.UndefOr[PositionType] = js.undefined
  /**
    * Matches the text-align CSS property.
    */
  var textAlign: js.UndefOr[TextAlignType] = js.undefined
  /**
    * Container Width
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object FlexLayout {
  @scala.inline
  def apply(
    alignContent: AlignContentType = null,
    alignItems: AlignItemsType = null,
    flexFlow: String = null,
    flexWrap: FlexWrapType = null,
    height: Double | String = null,
    justifyContent: JustifyContentType = null,
    position: PositionType = null,
    textAlign: TextAlignType = null,
    width: Double | String = null
  ): FlexLayout = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (flexFlow != null) __obj.updateDynamic("flexFlow")(flexFlow.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexLayout]
  }
}

