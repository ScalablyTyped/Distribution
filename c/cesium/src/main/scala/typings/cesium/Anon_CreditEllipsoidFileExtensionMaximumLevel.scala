package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidFileExtensionMaximumLevel extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var fileExtension: js.UndefOr[String] = js.undefined
  var maximumLevel: js.UndefOr[Double] = js.undefined
  var minimumLevel: js.UndefOr[Double] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_CreditEllipsoidFileExtensionMaximumLevel {
  @scala.inline
  def apply(
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    fileExtension: String = null,
    maximumLevel: Int | Double = null,
    minimumLevel: Int | Double = null,
    rectangle: Rectangle = null,
    url: String = null
  ): Anon_CreditEllipsoidFileExtensionMaximumLevel = {
    val __obj = js.Dynamic.literal()
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_CreditEllipsoidFileExtensionMaximumLevel]
  }
}

