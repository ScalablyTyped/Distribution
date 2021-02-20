package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDataConfig extends StObject {
  
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
  implicit class InputDataConfigMutableBuilder[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementaryFeatures(value: SupplementaryFeatures): Self = StObject.set(x, "SupplementaryFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementaryFeaturesUndefined: Self = StObject.set(x, "SupplementaryFeatures", js.undefined)
    
    @scala.inline
    def setSupplementaryFeaturesVarargs(value: SupplementaryFeature*): Self = StObject.set(x, "SupplementaryFeatures", js.Array(value :_*))
  }
}
