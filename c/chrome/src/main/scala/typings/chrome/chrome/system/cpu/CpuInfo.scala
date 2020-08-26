package typings.chrome.chrome.system.cpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuInfo extends js.Object {
  /** The architecture name of the processors. */
  var archName: String = js.native
  /**
    * A set of feature codes indicating some of the processor's capabilities.
    * The currently supported codes are "mmx", "sse", "sse2", "sse3", "ssse3", "sse4_1", "sse4_2", and "avx".
    */
  var features: js.Array[String] = js.native
  /** The model name of the processors. */
  var modelName: String = js.native
  /** The number of logical processors. */
  var numOfProcessors: Double = js.native
  /** Information about each logical processor. */
  var processors: js.Array[ProcessorInfo] = js.native
}

object CpuInfo {
  @scala.inline
  def apply(
    archName: String,
    features: js.Array[String],
    modelName: String,
    numOfProcessors: Double,
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
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumOfProcessors(value: Double): Self = this.set("numOfProcessors", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessorsVarargs(value: ProcessorInfo*): Self = this.set("processors", js.Array(value :_*))
    @scala.inline
    def setProcessors(value: js.Array[ProcessorInfo]): Self = this.set("processors", value.asInstanceOf[js.Any])
  }
  
}

