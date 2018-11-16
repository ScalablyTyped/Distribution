package typings
package atBabelCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  type FileParseCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ ParseResult | scala.Null, js.Any]
  type FileResultCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* result */ BabelFileResult | scala.Null, 
    js.Any
  ]
  type Node = atBabelTypesLib.typesMod.Node
  type ParseResult = atBabelTypesLib.typesMod.File | atBabelTypesLib.typesMod.Program
  type PluginItem = ConfigItem | PluginObj[js.Any] | PluginTarget | (js.Tuple2[PluginTarget, PluginOptions]) | (js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[java.lang.String]])
  type PluginOptions = js.UndefOr[js.Object | atBabelCoreLib.atBabelCoreLibNumbers.`false`]
  type PluginTarget = java.lang.String | js.Object | (js.Function1[/* repeated */js.Any, js.Any])
}
