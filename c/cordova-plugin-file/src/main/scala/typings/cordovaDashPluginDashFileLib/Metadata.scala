package typings
package cordovaDashPluginDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface supplies information about the state of a file or directory. */

trait Metadata extends js.Object {
  /** This is the time at which the file or directory was last modified. */
  var modificationTime: stdLib.Date
  /** The size of the file, in bytes. This must return 0 for directories. */
  var size: scala.Double
}

