package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Featurization extends StObject {
  
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
  implicit class FeaturizationMutableBuilder[Self <: Featurization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: Name): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturizationPipeline(value: FeaturizationPipeline): Self = StObject.set(x, "FeaturizationPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturizationPipelineUndefined: Self = StObject.set(x, "FeaturizationPipeline", js.undefined)
    
    @scala.inline
    def setFeaturizationPipelineVarargs(value: FeaturizationMethod*): Self = StObject.set(x, "FeaturizationPipeline", js.Array(value :_*))
  }
}
