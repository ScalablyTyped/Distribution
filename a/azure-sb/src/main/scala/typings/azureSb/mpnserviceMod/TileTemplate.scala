package typings.azureSb.mpnserviceMod

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
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TileTemplate]
  }
}

