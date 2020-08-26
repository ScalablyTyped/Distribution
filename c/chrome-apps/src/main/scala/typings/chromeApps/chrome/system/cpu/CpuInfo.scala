package typings.chromeApps.chrome.system.cpu

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.avx
import typings.chromeApps.chromeAppsStrings.mmx
import typings.chromeApps.chromeAppsStrings.sse
import typings.chromeApps.chromeAppsStrings.sse2
import typings.chromeApps.chromeAppsStrings.sse3
import typings.chromeApps.chromeAppsStrings.sse4_1
import typings.chromeApps.chromeAppsStrings.sse4_2
import typings.chromeApps.chromeAppsStrings.ssse3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuInfo extends js.Object {
  /** The architecture name of the processors. */
  var archName: String = js.native
  /**
    * A set of feature codes indicating some of the processor's capabilities.
    * The currently supported codes are 'mmx', 'sse', 'sse2', 'sse3', 'ssse3', 'sse4_1', 'sse4_2', and 'avx'.
    */
  var features: mmx | sse | sse2 | sse3 | ssse3 | sse4_1 | sse4_2 | avx = js.native
  /** The model name of the processors. */
  var modelName: String = js.native
  /** The number of logical processors. */
  var numOfProcessors: integer = js.native
  /** Information about each logical processor. */
  var processors: js.Array[ProcessorInfo] = js.native
  /**
    * @requires(CrOS) Currently supported on Chrome OS only.
    * @description
    * List of CPU temperature readings from each thermal zone of the CPU.
    * Temperatures are in degrees Celsius.
    */
  var temperatures: js.UndefOr[js.Array[double]] = js.native
}

object CpuInfo {
  @scala.inline
  def apply(
    archName: String,
    features: mmx | sse | sse2 | sse3 | ssse3 | sse4_1 | sse4_2 | avx,
    modelName: String,
    numOfProcessors: integer,
    processors: js.Array[ProcessorInfo]
  ): CpuInfo = {
    val __obj = js.Dynamic.literal(archName = archName.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], numOfProcessors = numOfProcessors.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuInfo]
  }
  @scala.inline
  implicit class CpuInfoOps[Self <: CpuInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArchName(value: String): Self = this.set("archName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatures(value: mmx | sse | sse2 | sse3 | ssse3 | sse4_1 | sse4_2 | avx): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumOfProcessors(value: integer): Self = this.set("numOfProcessors", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessorsVarargs(value: ProcessorInfo*): Self = this.set("processors", js.Array(value :_*))
    @scala.inline
    def setProcessors(value: js.Array[ProcessorInfo]): Self = this.set("processors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemperaturesVarargs(value: double*): Self = this.set("temperatures", js.Array(value :_*))
    @scala.inline
    def setTemperatures(value: js.Array[double]): Self = this.set("temperatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemperatures: Self = this.set("temperatures", js.undefined)
  }
  
}

