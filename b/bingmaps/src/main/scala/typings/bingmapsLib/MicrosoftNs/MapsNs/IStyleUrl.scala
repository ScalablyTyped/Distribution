package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleUrl extends js.Object {
  /** List of style css urls o be downloaded */
  var styleURLs: js.Array[java.lang.String]
}

object IStyleUrl {
  @scala.inline
  def apply(styleURLs: js.Array[java.lang.String]): IStyleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("styleURLs")(styleURLs)
    __obj.asInstanceOf[IStyleUrl]
  }
}

