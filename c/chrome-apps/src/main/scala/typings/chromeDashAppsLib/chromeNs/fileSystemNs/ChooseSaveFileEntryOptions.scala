package typings
package chromeDashAppsLib.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- chromeDashAppsLib.chromeNs.fileSystemNs.ChooseEntryOptions because Already inherited */ trait ChooseSaveFileEntryOptions extends ChooseEntryOptionsBase {
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.saveFile
}

object ChooseSaveFileEntryOptions {
  @scala.inline
  def apply(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.saveFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[scala.Boolean] = js.undefined,
    suggestedName: java.lang.String = null
  ): ChooseSaveFileEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes)
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName)
    __obj.asInstanceOf[ChooseSaveFileEntryOptions]
  }
}

