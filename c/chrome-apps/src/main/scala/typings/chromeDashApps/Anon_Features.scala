package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Features extends js.Object {
  /** List of the 3D-related features your app requires. */
  var features: js.Array[webgl]
}

object Anon_Features {
  @scala.inline
  def apply(features: js.Array[webgl]): Anon_Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Features]
  }
}

