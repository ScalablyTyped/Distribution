package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleUrl extends js.Object {
  /** List of style css urls o be downloaded */
  var styleURLs: js.Array[String]
}

object IStyleUrl {
  @scala.inline
  def apply(styleURLs: js.Array[String]): IStyleUrl = {
    val __obj = js.Dynamic.literal(styleURLs = styleURLs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStyleUrl]
  }
}

