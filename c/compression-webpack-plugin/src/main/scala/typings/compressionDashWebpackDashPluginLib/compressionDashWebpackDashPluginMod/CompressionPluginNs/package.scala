package typings
package compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CompressionPluginNs {
  type Algorithm[O] = js.Function3[
    /* source */ java.lang.String, 
    /* options */ O, 
    /* callback */ AlgorithmCallback, 
    scala.Unit
  ]
  type AlgorithmCallback = js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  type Pattern = java.lang.String | stdLib.RegExp | js.Array[stdLib.RegExp] | js.Array[java.lang.String]
}
