package typings.babelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigFunction = js.Function1[/* api */ typings.babelCore.mod.ConfigAPI, typings.babelCore.mod.TransformOptions]
  type FileParseCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ typings.babelCore.mod.ParseResult | scala.Null, 
    js.Any
  ]
  type FileResultCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ typings.babelCore.mod.BabelFileResult | scala.Null, 
    js.Any
  ]
  type Node = typings.babelTypes.mod.Node
  type ParseResult = typings.babelTypes.mod.File_ | typings.babelTypes.mod.Program_
  type PluginItem = typings.babelCore.mod.ConfigItem | typings.babelCore.mod.PluginObj[js.Any] | typings.babelCore.mod.PluginTarget | (js.Tuple2[typings.babelCore.mod.PluginTarget, typings.babelCore.mod.PluginOptions]) | (js.Tuple3[
    typings.babelCore.mod.PluginTarget, 
    typings.babelCore.mod.PluginOptions, 
    js.UndefOr[java.lang.String]
  ])
  type PluginOptions = js.UndefOr[js.Object | typings.babelCore.babelCoreBooleans.`false`]
  type PluginTarget = java.lang.String | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])
  type SimpleCacheCallback[T /* <: typings.babelCore.mod.SimpleCacheKey */] = js.Function0[T]
  type SimpleCacheKey = js.UndefOr[java.lang.String | scala.Boolean | scala.Double | scala.Null]
}
