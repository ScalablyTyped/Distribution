package typings
package azureDashSbLib.libMpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileTemplate extends Template {
  var backBackgroundImage: java.lang.String
  var backContent: java.lang.String
  var backTitle: java.lang.String
  var backgroundImage: java.lang.String
  var count: java.lang.String
  var id: java.lang.String
  var title: java.lang.String
}

object TileTemplate {
  @scala.inline
  def apply(
    backBackgroundImage: java.lang.String,
    backContent: java.lang.String,
    backTitle: java.lang.String,
    backgroundImage: java.lang.String,
    count: java.lang.String,
    id: java.lang.String,
    title: java.lang.String
  ): TileTemplate = {
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage, backContent = backContent, backTitle = backTitle, backgroundImage = backgroundImage, count = count, id = id, title = title)
  
    __obj.asInstanceOf[TileTemplate]
  }
}

