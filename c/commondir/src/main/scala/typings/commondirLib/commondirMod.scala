package typings
package commondirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("commondir", JSImport.Namespace)
@js.native
object commondirMod extends js.Object {
  /**
    * Compute the closest common parent directory for an array relativePaths which will be resolved for each dir in
    * relativePaths according to: path.resolve(basedir, dir).
    *
    * @see \`{@link https://github.com/substack/node-commondir#commondirbasedir-relativepaths }\`
    */
  def apply(absolutePaths: js.Array[java.lang.String]): java.lang.String = js.native
  /**
    * Compute the closest common parent directory for an array absolutePaths.
    *
    * @see \`{@link https://github.com/substack/node-commondir#commondirabsolutepaths }\`
    */
  def apply(basedir: java.lang.String, relativePaths: js.Array[java.lang.String]): java.lang.String = js.native
}

