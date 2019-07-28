package typings.azureDashSb.libMpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileTemplate extends Template {
  var backBackgroundImage: String
  var backContent: String
  var backTitle: String
  var backgroundImage: String
  var count: String
  var id: String
  var title: String
}

object TileTemplate {
  @scala.inline
  def apply(
    backBackgroundImage: String,
    backContent: String,
    backTitle: String,
    backgroundImage: String,
    count: String,
    id: String,
    title: String
  ): TileTemplate = {
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage, backContent = backContent, backTitle = backTitle, backgroundImage = backgroundImage, count = count, id = id, title = title)
  
    __obj.asInstanceOf[TileTemplate]
  }
}

