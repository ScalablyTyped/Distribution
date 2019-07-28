package typings.chromeDashApps.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseEntryOptionsBase extends ChooseEntryOptions {
  /**
    * The optional list of accept options for this file opener.
    * Each option will be presented as a unique group to the end-user.
    */
  var accepts: js.UndefOr[js.Array[AcceptOptions]] = js.undefined
  /**
    * Whether to accept all file types, in addition to the options specified in the accepts argument.
    * If the accepts field is unset or contains no valid entries, this will always be reset to true.
    * @default true
    */
  var acceptsAllTypes: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of the prompt to show.
    * @default 'openFile'
    * @see ChooseEntryType
    */
  // type?: ToStringLiteral<typeof ChooseEntryType>;
  /**
    * The suggested file name that will be presented to the user as the default name to read or write.
    */
  var suggestedName: js.UndefOr[String] = js.undefined
}

object ChooseEntryOptionsBase {
  @scala.inline
  def apply(
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes)
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName)
    __obj.asInstanceOf[ChooseEntryOptionsBase]
  }
}

