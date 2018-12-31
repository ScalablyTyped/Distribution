package typings
package chromeLib.chromeNs.systemNs.cpuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuInfo extends js.Object {
  /** The architecture name of the processors. */
  var archName: java.lang.String
  /**
    * A set of feature codes indicating some of the processor's capabilities.
    * The currently supported codes are "mmx", "sse", "sse2", "sse3", "ssse3", "sse4_1", "sse4_2", and "avx".
    */
  var features: js.Array[java.lang.String]
  /** The model name of the processors. */
  var modelName: java.lang.String
  /** The number of logical processors. */
  var numOfProcessors: scala.Double
  /** Information about each logical processor. */
  var processors: js.Array[ProcessorInfo]
}

