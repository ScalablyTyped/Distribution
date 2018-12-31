package typings
package chromeDashAppsLib.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseEntryOptionsBase extends js.Object {
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
  var acceptsAllTypes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type of the prompt to show.
    * @default 'openFile'
    * @see ChooseEntryType
    */
  // type?: ToStringLiteral<typeof ChooseEntryType>;
  /**
    * The suggested file name that will be presented to the user as the default name to read or write.
    */
  var suggestedName: js.UndefOr[java.lang.String] = js.undefined
}

