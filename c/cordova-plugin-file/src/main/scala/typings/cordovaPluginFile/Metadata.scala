package typings.cordovaPluginFile

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface supplies information about the state of a file or directory. */
trait Metadata extends js.Object {
  /** This is the time at which the file or directory was last modified. */
  var modificationTime: Date
  /** The size of the file, in bytes. This must return 0 for directories. */
  var size: Double
}

object Metadata {
  @scala.inline
  def apply(modificationTime: Date, size: Double): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

