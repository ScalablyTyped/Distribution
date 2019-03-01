package typings
package azureDashSbLib.libMpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- azureDashSbLib.libMpnserviceMod.Template because Already inherited */ trait FlipTileTemplate extends TileTemplate {
  var smallBackgroundImage: java.lang.String
  var wideBackBackgroundImage: java.lang.String
  var wideBackContent: java.lang.String
  var wideBackgroundImage: java.lang.String
}

object FlipTileTemplate {
  @scala.inline
  def apply(
    backBackgroundImage: java.lang.String,
    backContent: java.lang.String,
    backTitle: java.lang.String,
    backgroundImage: java.lang.String,
    count: java.lang.String,
    id: java.lang.String,
    smallBackgroundImage: java.lang.String,
    title: java.lang.String,
    wideBackBackgroundImage: java.lang.String,
    wideBackContent: java.lang.String,
    wideBackgroundImage: java.lang.String
  ): FlipTileTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backBackgroundImage")(backBackgroundImage)
    __obj.updateDynamic("backContent")(backContent)
    __obj.updateDynamic("backTitle")(backTitle)
    __obj.updateDynamic("backgroundImage")(backgroundImage)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("smallBackgroundImage")(smallBackgroundImage)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("wideBackBackgroundImage")(wideBackBackgroundImage)
    __obj.updateDynamic("wideBackContent")(wideBackContent)
    __obj.updateDynamic("wideBackgroundImage")(wideBackgroundImage)
    __obj.asInstanceOf[FlipTileTemplate]
  }
}

