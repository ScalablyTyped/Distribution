package typings.commondir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compute the closest common parent directory for an array relativePaths which will be resolved for each dir in
    * relativePaths according to: path.resolve(basedir, dir).
    *
    * @see \`{@link https://github.com/substack/node-commondir#commondirbasedir-relativepaths }\`
    */
  inline def apply(absolutePaths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].apply(absolutePaths.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Compute the closest common parent directory for an array absolutePaths.
    *
    * @see \`{@link https://github.com/substack/node-commondir#commondirabsolutepaths }\`
    */
  inline def apply(basedir: String, relativePaths: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].apply(basedir.asInstanceOf[js.Any], relativePaths.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("commondir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
