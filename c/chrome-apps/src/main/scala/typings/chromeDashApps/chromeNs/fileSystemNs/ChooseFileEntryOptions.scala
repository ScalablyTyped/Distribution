package typings.chromeDashApps.chromeNs.fileSystemNs

import typings.chromeDashApps.chromeDashAppsNumbers.`false`
import typings.chromeDashApps.chromeDashAppsStrings.openFile
import typings.chromeDashApps.chromeDashAppsStrings.openWritableFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.chromeDashApps.chromeNs.fileSystemNs.ChooseEntryOptions because Already inherited */ trait ChooseFileEntryOptions extends ChooseEntryOptionsBase {
  /**
    * Whether to accept multiple files. This is only supported for openFile and openWritableFile.
    * The callback to chooseEntry will be called with a list of entries if this is set to true.
    * Otherwise it will be called with a single Entry.
    * @default false
    * @since Chrome 30.
    */
  var acceptsMultiple: js.UndefOr[`false`] = js.undefined
  var `type`: openFile | openWritableFile
}

object ChooseFileEntryOptions {
  @scala.inline
  def apply(
    `type`: openFile | openWritableFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    acceptsMultiple: `false` = null,
    suggestedName: String = null
  ): ChooseFileEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes)
    if (acceptsMultiple != null) __obj.updateDynamic("acceptsMultiple")(acceptsMultiple)
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName)
    __obj.asInstanceOf[ChooseFileEntryOptions]
  }
}

