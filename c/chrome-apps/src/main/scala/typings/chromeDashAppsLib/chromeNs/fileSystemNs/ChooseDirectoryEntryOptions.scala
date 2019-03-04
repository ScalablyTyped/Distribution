package typings
package chromeDashAppsLib.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- chromeDashAppsLib.chromeNs.fileSystemNs.ChooseEntryOptions because Already inherited */ trait ChooseDirectoryEntryOptions extends ChooseEntryOptionsBase {
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.openDirectory
}

object ChooseDirectoryEntryOptions {
  @scala.inline
  def apply(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.openDirectory,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[scala.Boolean] = js.undefined,
    suggestedName: java.lang.String = null
  ): ChooseDirectoryEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes)
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName)
    __obj.asInstanceOf[ChooseDirectoryEntryOptions]
  }
}

