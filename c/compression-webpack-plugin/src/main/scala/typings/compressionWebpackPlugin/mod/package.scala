package typings.compressionWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Algorithm[O] = js.Function3[
    /* source */ java.lang.String, 
    /* options */ O, 
    /* callback */ typings.compressionWebpackPlugin.mod.AlgorithmCallback, 
    scala.Unit
  ]
  type AlgorithmCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ typings.node.Buffer, 
    scala.Unit
  ]
  /**
    * Prepare compressed versions of assets to serve them with Content-Encoding.
    */
  type CompressionPlugin[O] = typings.std.Plugin
  type FilenameFunction = js.Function1[/* info */ typings.compressionWebpackPlugin.mod.FileInfo, java.lang.String]
  /** Filtering rule as regex or string */
  type Rule = java.lang.String | typings.std.RegExp
  /** Filtering rules. */
  type Rules = typings.compressionWebpackPlugin.mod.Rule | js.Array[typings.compressionWebpackPlugin.mod.Rule]
}
