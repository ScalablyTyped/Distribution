package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidFileExtensionMaximumLevel extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.Credit | java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var fileExtension: js.UndefOr[java.lang.String] = js.undefined
  var maximumLevel: js.UndefOr[scala.Double] = js.undefined
  var minimumLevel: js.UndefOr[scala.Double] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.Rectangle] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CreditEllipsoidFileExtensionMaximumLevel {
  @scala.inline
  def apply(
    credit: cesiumLib.cesiumMod.Credit | java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    fileExtension: java.lang.String = null,
    maximumLevel: scala.Int | scala.Double = null,
    minimumLevel: scala.Int | scala.Double = null,
    rectangle: cesiumLib.cesiumMod.Rectangle = null,
    url: java.lang.String = null
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

