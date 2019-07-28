package typings.azureDashSb.libMpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.azureDashSb.libMpnserviceMod.Template because Already inherited */ trait FlipTileTemplate extends TileTemplate {
  var smallBackgroundImage: String
  var wideBackBackgroundImage: String
  var wideBackContent: String
  var wideBackgroundImage: String
}

object FlipTileTemplate {
  @scala.inline
  def apply(
    backBackgroundImage: String,
    backContent: String,
    backTitle: String,
    backgroundImage: String,
    count: String,
    id: String,
    smallBackgroundImage: String,
    title: String,
    wideBackBackgroundImage: String,
    wideBackContent: String,
    wideBackgroundImage: String
  ): FlipTileTemplate = {
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage, backContent = backContent, backTitle = backTitle, backgroundImage = backgroundImage, count = count, id = id, smallBackgroundImage = smallBackgroundImage, title = title, wideBackBackgroundImage = wideBackBackgroundImage, wideBackContent = wideBackContent, wideBackgroundImage = wideBackgroundImage)
  
    __obj.asInstanceOf[FlipTileTemplate]
  }
}

