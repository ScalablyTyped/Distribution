package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomMapStyle extends js.Object {
  /** A list of map elements to be styled. */
  var elements: js.UndefOr[IMapElements] = js.undefined
  /** Global Settings. */
  var settings: js.UndefOr[ISettingsStyle] = js.undefined
  /** The version of the style syntax used. */
  var version: java.lang.String
}

object ICustomMapStyle {
  @scala.inline
  def apply(version: java.lang.String, elements: IMapElements = null, settings: ISettingsStyle = null): ICustomMapStyle = {
    val __obj = js.Dynamic.literal(version = version)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[ICustomMapStyle]
  }
}

