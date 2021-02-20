package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTransformation extends StObject {
  
  /**
    * The creation date and time (in Unix time) of the feature transformation.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * Provides the default parameters for feature transformation.
    */
  var defaultParameters: js.UndefOr[FeaturizationParameters] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the FeatureTransformation object.
    */
  var featureTransformationArn: js.UndefOr[Arn] = js.native
  
  /**
    * The last update date and time (in Unix time) of the feature transformation.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the feature transformation.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The status of the feature transformation. A feature transformation can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
}
object FeatureTransformation {
  
  @scala.inline
  def apply(): FeatureTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTransformation]
  }
  
  @scala.inline
  implicit class FeatureTransformationMutableBuilder[Self <: FeatureTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setDefaultParameters(value: FeaturizationParameters): Self = StObject.set(x, "defaultParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultParametersUndefined: Self = StObject.set(x, "defaultParameters", js.undefined)
    
    @scala.inline
    def setFeatureTransformationArn(value: Arn): Self = StObject.set(x, "featureTransformationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTransformationArnUndefined: Self = StObject.set(x, "featureTransformationArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
