package typings.babelJest.mod

import typings.babelCore.mod.TransformOptions
import typings.babelJest.babelJestBooleans.`true`
import typings.std.TransformStreamDefaultControllerCallback
import typings.std.TransformStreamDefaultControllerTransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-jest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var canInstrument: `true` = js.native
  var flush: js.UndefOr[TransformStreamDefaultControllerCallback[_]] = js.native
  var readableType: js.UndefOr[scala.Nothing] = js.native
  var start: js.UndefOr[TransformStreamDefaultControllerCallback[_]] = js.native
  var transform: js.UndefOr[TransformStreamDefaultControllerTransformCallback[_, _]] = js.native
  var writableType: js.UndefOr[scala.Nothing] = js.native
  def createTransformer(): BabelJestTransformer = js.native
  def createTransformer(options: TransformOptions): BabelJestTransformer = js.native
}

