package typings.chromeDashApps.chrome.fileSystem

import typings.chromeDashApps.chromeDashAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.chromeDashApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ trait ChooseSaveFileEntryOptions extends ChooseEntryOptionsBase {
  var `type`: saveFile
}

object ChooseSaveFileEntryOptions {
  @scala.inline
  def apply(
    `type`: saveFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseSaveFileEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes)
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName)
    __obj.asInstanceOf[ChooseSaveFileEntryOptions]
  }
}

