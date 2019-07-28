package typings.chromeDashApps.chromeNs.fileSystemNs

import typings.chromeDashApps.chromeDashAppsNumbers.`true`
import typings.chromeDashApps.chromeDashAppsStrings.openFile
import typings.chromeDashApps.chromeDashAppsStrings.openWritableFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.chromeDashApps.chromeNs.fileSystemNs.ChooseEntryOptions because Already inherited */ trait ChooseMultipleFilesEntryOptions extends ChooseEntryOptionsBase {
  /**
    * Whether to accept multiple files. This is only supported for openFile and openWritableFile.
    * The callback to chooseEntry will be called with a list of entries if this is set to true.
    * Otherwise it will be called with a single Entry.
    * @default false
    * @since Chrome 30.
    */
  var acceptsMultiple: `true`
  var `type`: openFile | openWritableFile
}

object ChooseMultipleFilesEntryOptions {
  @scala.inline
  def apply(
    acceptsMultiple: `true`,
    `type`: openFile | openWritableFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseMultipleFilesEntryOptions = {
    val __obj = js.Dynamic.literal(acceptsMultiple = acceptsMultiple)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes)
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName)
    __obj.asInstanceOf[ChooseMultipleFilesEntryOptions]
  }
}

