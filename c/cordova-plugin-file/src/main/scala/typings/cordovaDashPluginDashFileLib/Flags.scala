package typings
package cordovaDashPluginDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This dictionary is used to supply arguments to methods
  * that look up or create files or directories.
  */
trait Flags extends js.Object {
  /** Used to indicate that the user wants to create a file or directory if it was not previously there. */
  var create: js.UndefOr[scala.Boolean] = js.undefined
  /** By itself, exclusive must have no effect. Used with create, it must cause getFile and getDirectory to fail if the target path already exists. */
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
}

