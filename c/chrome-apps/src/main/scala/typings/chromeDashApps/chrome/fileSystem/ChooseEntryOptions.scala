package typings.chromeDashApps.chrome.fileSystem

import typings.chromeDashApps.chromeDashAppsNumbers.`false`
import typings.chromeDashApps.chromeDashAppsNumbers.`true`
import typings.chromeDashApps.chromeDashAppsStrings.openDirectory
import typings.chromeDashApps.chromeDashAppsStrings.openFile
import typings.chromeDashApps.chromeDashAppsStrings.openWritableFile
import typings.chromeDashApps.chromeDashAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chrome.fileSystem.ChooseFileEntryOptions
  - typings.chromeDashApps.chrome.fileSystem.ChooseSaveFileEntryOptions
  - typings.chromeDashApps.chrome.fileSystem.ChooseMultipleFilesEntryOptions
  - typings.chromeDashApps.chrome.fileSystem.ChooseDirectoryEntryOptions
  - typings.chromeDashApps.chrome.fileSystem.ChooseEntryOptionsBase
*/
trait ChooseEntryOptions extends js.Object

object ChooseEntryOptions {
  @scala.inline
  def ChooseFileEntryOptions(
    `type`: openFile | openWritableFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    acceptsMultiple: `false` = null,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (acceptsMultiple != null) __obj.updateDynamic("acceptsMultiple")(acceptsMultiple.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  @scala.inline
  def ChooseEntryOptionsBase(
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  @scala.inline
  def ChooseMultipleFilesEntryOptions(
    acceptsMultiple: `true`,
    `type`: openFile | openWritableFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal(acceptsMultiple = acceptsMultiple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  @scala.inline
  def ChooseSaveFileEntryOptions(
    `type`: saveFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  @scala.inline
  def ChooseDirectoryEntryOptions(
    `type`: openDirectory,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
}

