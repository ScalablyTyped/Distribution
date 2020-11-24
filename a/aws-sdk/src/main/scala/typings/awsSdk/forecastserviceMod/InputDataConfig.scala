package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDataConfig extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: Arn = js.native
  
  /**
    * An array of supplementary features. The only supported feature is a holiday calendar.
    */
  var SupplementaryFeatures: js.UndefOr[typings.awsSdk.forecastserviceMod.SupplementaryFeatures] = js.native
}
object InputDataConfig {
  
  @scala.inline
  def apply(DatasetGroupArn: Arn): InputDataConfig = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  
  @scala.inline
  implicit class InputDataConfigOps[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
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
    def setDatasetGroupArn(value: Arn): Self = this.set("DatasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementaryFeaturesVarargs(value: SupplementaryFeature*): Self = this.set("SupplementaryFeatures", js.Array(value :_*))
    
    @scala.inline
    def setSupplementaryFeatures(value: SupplementaryFeatures): Self = this.set("SupplementaryFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementaryFeatures: Self = this.set("SupplementaryFeatures", js.undefined)
  }
}
