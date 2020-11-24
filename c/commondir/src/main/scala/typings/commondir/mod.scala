package typings.commondir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("commondir", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Compute the closest common parent directory for an array relativePaths which will be resolved for each dir in
    * relativePaths according to: path.resolve(basedir, dir).
    *
    * @see \`{@link https://github.com/substack/node-commondir#commondirbasedir-relativepaths }\`
    */
  def apply(absolutePaths: js.Array[String]): String = js.native
  /**
    * Compute the closest common parent directory for an array absolutePaths.
    *
    * @see \`{@link https://github.com/substack/node-commondir#commondirabsolutepaths }\`
    */
  def apply(basedir: String, relativePaths: js.Array[String]): String = js.native
}
