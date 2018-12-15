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
  type AlgorithmCallback = js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  type Options[O] = ZlibOptions | CustomOptions[O]
  type Pattern = java.lang.String | stdLib.RegExp | js.Array[stdLib.RegExp] | js.Array[java.lang.String]
  // NOTE: These are the async compression algorithms on the zlib object.
  type ZlibAlgorithm = compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginLibStrings.deflate | compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginLibStrings.deflateRaw | compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginLibStrings.gzip
}
