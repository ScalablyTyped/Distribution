package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxProviderCommonOptions extends js.Object {
  /**
    * A credit for the data source, which is displayed on the canvas
    */
  var credit: js.UndefOr[Credit | String] = js.undefined
  /**
    * The ellipsoid.
    * If not specified, the WGS84 ellipsoid is used
    */
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  /**
    * The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit
    * @default undefined
    */
  var maximumLevel: js.UndefOr[Double] = js.undefined
  /**
    * The minimum level-of-detail supported by the imagery provider.
    * Take care when specifying this that the number of tiles at the minimum level is small, such as four or less.
    * A larger number is likely to result in rendering problems
    * @default 0
    */
  var minimumLevel: js.UndefOr[Double] = js.undefined
  /**
    * The rectangle, in radians, covered by the image
    * @defualt Rectangle.MAX_VALUE
    */
  var rectangle: js.UndefOr[Rectangle] = js.undefined
}

object MapboxProviderCommonOptions {
  @scala.inline
  def apply(
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    maximumLevel: Int | Double = null,
    minimumLevel: Int | Double = null,
    rectangle: Rectangle = null
  ): MapboxProviderCommonOptions = {
    val __obj = js.Dynamic.literal()
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxProviderCommonOptions]
  }
}

