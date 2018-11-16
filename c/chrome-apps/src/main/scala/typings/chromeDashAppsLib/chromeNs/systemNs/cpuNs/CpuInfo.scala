package typings
package chromeDashAppsLib.chromeNs.systemNs.cpuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CpuInfo extends js.Object {
  /** The architecture name of the processors. */
  var archName: java.lang.String
  /**
               * A set of feature codes indicating some of the processor's capabilities.
               * The currently supported codes are 'mmx', 'sse', 'sse2', 'sse3', 'ssse3', 'sse4_1', 'sse4_2', and 'avx'.
               */
  var features: chromeDashAppsLib.chromeDashAppsLibStrings.mmx | chromeDashAppsLib.chromeDashAppsLibStrings.sse | chromeDashAppsLib.chromeDashAppsLibStrings.sse2 | chromeDashAppsLib.chromeDashAppsLibStrings.sse3 | chromeDashAppsLib.chromeDashAppsLibStrings.ssse3 | chromeDashAppsLib.chromeDashAppsLibStrings.sse4_1 | chromeDashAppsLib.chromeDashAppsLibStrings.sse4_2 | chromeDashAppsLib.chromeDashAppsLibStrings.avx
  /** The model name of the processors. */
  var modelName: java.lang.String
  /** The number of logical processors. */
  var numOfProcessors: chromeDashAppsLib.chromeNs.integer
  /** Information about each logical processor. */
  var processors: js.Array[ProcessorInfo]
  /**
               * @requires(CrOS) Currently supported on Chrome OS only.
               * @description
               * List of CPU temperature readings from each thermal zone of the CPU.
               * Temperatures are in degrees Celsius.
               */
  var temperatures: js.UndefOr[js.Array[chromeDashAppsLib.chromeNs.double]] = js.undefined
}

