package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Featurization extends js.Object {
  /**
    * The name of the schema attribute that specifies the data field to be featurized. Amazon Forecast supports the target field of the TARGET_TIME_SERIES and the RELATED_TIME_SERIES datasets. For example, for the RETAIL domain, the target is demand, and for the CUSTOM domain, the target is target_value. For more information, see howitworks-missing-values.
    */
  var AttributeName: Name = js.native
  /**
    * An array of one FeaturizationMethod object that specifies the feature transformation method.
    */
  var FeaturizationPipeline: js.UndefOr[typings.awsSdk.forecastserviceMod.FeaturizationPipeline] = js.native
}

object Featurization {
  @scala.inline
  def apply(AttributeName: Name): Featurization = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Featurization]
  }
  @scala.inline
  implicit class FeaturizationOps[Self <: Featurization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributeName(value: Name): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeaturizationPipelineVarargs(value: FeaturizationMethod*): Self = this.set("FeaturizationPipeline", js.Array(value :_*))
    @scala.inline
    def setFeaturizationPipeline(value: FeaturizationPipeline): Self = this.set("FeaturizationPipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturizationPipeline: Self = this.set("FeaturizationPipeline", js.undefined)
  }
  
}

