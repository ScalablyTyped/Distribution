package typings
package atBabelCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelCoreMod {
  type ConfigFunction = js.Function1[/* api */ ConfigAPI, TransformOptions]
  type FileParseCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ ParseResult | scala.Null, js.Any]
  type FileResultCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* result */ BabelFileResult | scala.Null, 
    js.Any
  ]
  type Node = atBabelTypesLib.atBabelTypesMod.Node
  type ParseResult = atBabelTypesLib.atBabelTypesMod.File | atBabelTypesLib.atBabelTypesMod.Program
  type PluginItem = ConfigItem | PluginObj[js.Any] | PluginTarget | (js.Tuple2[PluginTarget, PluginOptions]) | (js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[java.lang.String]])
  type PluginOptions = js.UndefOr[js.Object | atBabelCoreLib.atBabelCoreLibNumbers.`false`]
  type PluginTarget = java.lang.String | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])
  type SimpleCacheCallback[T /* <: SimpleCacheKey */] = js.Function0[T]
  type SimpleCacheKey = js.UndefOr[java.lang.String | scala.Boolean | scala.Double | scala.Null]
}
