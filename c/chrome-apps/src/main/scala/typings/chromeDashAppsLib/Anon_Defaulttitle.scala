package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Defaulttitle extends js.Object {
  /** Icon */
  var default_icon: java.lang.String
  /** What the button will display */
  var default_title: java.lang.String
  /** ['read'] = read only mode */
  var file_access: js.UndefOr[
    js.Array[chromeDashAppsLib.chromeDashAppsLibStrings.read] | js.Array[java.lang.String]
  ] = js.undefined
  /**
                   * To match all files, use 'filesystem:*.*'
                   */
  var file_filters: js.Array[java.lang.String]
  /** Handler id */
  var id: java.lang.String
}

