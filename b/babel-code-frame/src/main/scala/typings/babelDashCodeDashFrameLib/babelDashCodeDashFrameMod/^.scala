package typings
package babelDashCodeDashFrameLib.babelDashCodeDashFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(rawLines: java.lang.String, lineNumber: scala.Double, colNumber: scala.Double): java.lang.String = js.native
  def apply(
    rawLines: java.lang.String,
    lineNumber: scala.Double,
    colNumber: scala.Double,
    options: BabelCodeFrameOptions
  ): java.lang.String = js.native
}

