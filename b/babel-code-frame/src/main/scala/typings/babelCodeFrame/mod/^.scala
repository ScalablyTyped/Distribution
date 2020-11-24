package typings.babelCodeFrame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-code-frame", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Generate errors that contain a code frame that point to source locations.
    *
    * @param rawLines Raw lines to frame
    * @param lineNumber Line number (1 indexed)
    * @param colNumber Column number
    * @param options Additional options
    *
    * @returns Framed code
    */
  def apply(rawLines: String, lineNumber: Double, colNumber: Double): String = js.native
  def apply(rawLines: String, lineNumber: Double, colNumber: Double, options: BabelCodeFrameOptions): String = js.native
}
