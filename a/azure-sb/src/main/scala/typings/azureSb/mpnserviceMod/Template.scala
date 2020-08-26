package typings.azureSb.mpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azureSb.mpnserviceMod.TileTemplate
  - typings.azureSb.mpnserviceMod.FlipTileTemplate
  - typings.azureSb.mpnserviceMod.ToastTemplate
*/
trait Template extends js.Object

object Template {
  @scala.inline
  def TileTemplate(
    backBackgroundImage: String,
    backContent: String,
    backTitle: String,
    backgroundImage: String,
    count: String,
    id: String,
    title: String
  ): Template = {
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  def FlipTileTemplate(
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
  ): Template = {
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], smallBackgroundImage = smallBackgroundImage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wideBackBackgroundImage = wideBackBackgroundImage.asInstanceOf[js.Any], wideBackContent = wideBackContent.asInstanceOf[js.Any], wideBackgroundImage = wideBackgroundImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  def ToastTemplate(text1: String, text2: String): Template = {
    val __obj = js.Dynamic.literal(text1 = text1.asInstanceOf[js.Any], text2 = text2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

