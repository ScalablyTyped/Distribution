package typings
package chromeDashAppsLib.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- chromeDashAppsLib.chromeNs.fileSystemNs.ChooseEntryOptions because Already inherited */ trait ChooseMultipleFilesEntryOptions extends ChooseEntryOptionsBase {
  /**
    * Whether to accept multiple files. This is only supported for openFile and openWritableFile.
    * The callback to chooseEntry will be called with a list of entries if this is set to true.
    * Otherwise it will be called with a single Entry.
    * @default false
    * @since Chrome 30.
    */
  var acceptsMultiple: chromeDashAppsLib.chromeDashAppsLibNumbers.`true`
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.openFile | chromeDashAppsLib.chromeDashAppsLibStrings.openWritableFile
}

object ChooseMultipleFilesEntryOptions {
  @scala.inline
  def apply(
    acceptsMultiple: chromeDashAppsLib.chromeDashAppsLibNumbers.`true`,
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.openFile | chromeDashAppsLib.chromeDashAppsLibStrings.openWritableFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[scala.Boolean] = js.undefined,
    suggestedName: java.lang.String = null
  ): ChooseMultipleFilesEntryOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("acceptsMultiple")(acceptsMultiple)
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes)
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName)
    __obj.asInstanceOf[ChooseMultipleFilesEntryOptions]
  }
}

