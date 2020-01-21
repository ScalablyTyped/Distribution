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
  type CompressionPlugin[O] = typings.webpack.mod.Plugin
  type Pattern = java.lang.String | typings.std.RegExp | (js.Array[typings.std.RegExp | java.lang.String])
}
