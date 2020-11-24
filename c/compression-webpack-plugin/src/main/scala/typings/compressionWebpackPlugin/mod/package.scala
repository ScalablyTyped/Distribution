package typings.compressionWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Algorithm[O] = js.Function3[
    /* source */ java.lang.String, 
    /* options */ O, 
    /* callback */ typings.compressionWebpackPlugin.mod.AlgorithmCallback, 
    scala.Unit
  ]
  
  type AlgorithmCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ typings.std.Uint8Array, 
    scala.Unit
  ]
  
  type FilenameFunction = js.Function1[/* info */ typings.compressionWebpackPlugin.mod.FileInfo, java.lang.String]
  
  /** Filtering rule as regex or string */
  type Rule = java.lang.String | typings.std.RegExp
  
  /** Filtering rules. */
  type Rules = typings.compressionWebpackPlugin.mod.Rule | js.Array[typings.compressionWebpackPlugin.mod.Rule]
}
