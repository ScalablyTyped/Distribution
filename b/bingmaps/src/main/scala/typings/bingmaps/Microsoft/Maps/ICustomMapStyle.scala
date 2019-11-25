package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomMapStyle extends js.Object {
  /** A list of map elements to be styled. */
  var elements: js.UndefOr[IMapElements] = js.undefined
  /** Global Settings. */
  var settings: js.UndefOr[ISettingsStyle] = js.undefined
  /** The version of the style syntax used. */
  var version: String
}

object ICustomMapStyle {
  @scala.inline
  def apply(version: String, elements: IMapElements = null, settings: ISettingsStyle = null): ICustomMapStyle = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomMapStyle]
  }
}

