package typings.atBabelCore.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "transformFile")
@js.native
object transformFile extends js.Object {
  def apply(filename: String, callback: FileResultCallback): Unit = js.native
  def apply(filename: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def apply(filename: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
}

