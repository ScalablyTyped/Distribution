package typings
package copyfilesLib.copyfilesMod.copyfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** include files & directories begining with a dot (.) */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /** throw error if nothing is copied */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** pattern or glob to exclude */
  var exclude: js.UndefOr[java.lang.String] = js.undefined
  /** flatten the output */
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  /** do not overwrite destination files if they exist */
  var soft: js.UndefOr[scala.Boolean] = js.undefined
  /** slice a path off the bottom of the paths */
  var up: js.UndefOr[scala.Double] = js.undefined
  /** print more information to console */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

