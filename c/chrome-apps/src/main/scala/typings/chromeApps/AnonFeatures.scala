package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeatures extends js.Object {
  /** List of the 3D-related features your app requires. */
  var features: js.Array[webgl]
}

object AnonFeatures {
  @scala.inline
  def apply(features: js.Array[webgl]): AnonFeatures = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFeatures]
  }
}

