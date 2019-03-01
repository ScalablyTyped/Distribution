package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Features extends js.Object {
  /** List of the 3D-related features your app requires. */
  var features: js.Array[chromeDashAppsLib.chromeDashAppsLibStrings.webgl]
}

object Anon_Features {
  @scala.inline
  def apply(features: js.Array[chromeDashAppsLib.chromeDashAppsLibStrings.webgl]): Anon_Features = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("features")(features)
    __obj.asInstanceOf[Anon_Features]
  }
}

