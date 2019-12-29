package typings.atBabelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelCoreMod {
  import typings.atBabelCore.atBabelCoreBooleans.`false`
  import typings.atBabelTypes.atBabelTypesMod.File
  import typings.atBabelTypes.atBabelTypesMod.Program
  import typings.std.Error

  type ConfigFunction = js.Function1[/* api */ ConfigAPI, TransformOptions]
  type FileParseCallback = js.Function2[/* err */ Error | Null, /* result */ ParseResult | Null, js.Any]
  type FileResultCallback = js.Function2[/* err */ Error | Null, /* result */ BabelFileResult | Null, js.Any]
  type Node = typings.atBabelTypes.atBabelTypesMod.Node
  type ParseResult = File | Program
  type PluginItem = ConfigItem | PluginObj[js.Any] | PluginTarget | (js.Tuple2[PluginTarget, PluginOptions]) | (js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]])
  type PluginOptions = js.UndefOr[js.Object | `false`]
  type PluginTarget = String | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])
  type SimpleCacheCallback[T /* <: SimpleCacheKey */] = js.Function0[T]
  type SimpleCacheKey = js.UndefOr[String | Boolean | Double | Null]
}
