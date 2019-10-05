package typings.chromeDashApps.chrome.fileSystem

import typings.chromeDashApps.chromeDashAppsStrings.openDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.chromeDashApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ trait ChooseDirectoryEntryOptions extends ChooseEntryOptionsBase {
  var `type`: openDirectory
}

object ChooseDirectoryEntryOptions {
  @scala.inline
  def apply(
    `type`: openDirectory,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseDirectoryEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes)
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName)
    __obj.asInstanceOf[ChooseDirectoryEntryOptions]
  }
}

