package typings.commondir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compute the closest common parent directory for an array relativePaths which will be resolved for each dir in
    * relativePaths according to: path.resolve(basedir, dir).
    *
    * @see \`{@link https://github.com/substack/node-commondir#commondirbasedir-relativepaths }\`
    */
  @JSImport("commondir", JSImport.Namespace)
  @js.native
  def apply(absolutePaths: js.Array[String]): String = js.native
  /**
    * Compute the closest common parent directory for an array absolutePaths.
    *
    * @see \`{@link https://github.com/substack/node-commondir#commondirabsolutepaths }\`
    */
  @JSImport("commondir", JSImport.Namespace)
  @js.native
  def apply(basedir: String, relativePaths: js.Array[String]): String = js.native
}
