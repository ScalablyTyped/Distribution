package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTransformation extends js.Object {
  
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
  implicit class FeatureTransformationOps[Self <: FeatureTransformation] (val x: Self) extends AnyVal {
    
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
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    
    @scala.inline
    def setDefaultParameters(value: FeaturizationParameters): Self = this.set("defaultParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultParameters: Self = this.set("defaultParameters", js.undefined)
    
    @scala.inline
    def setFeatureTransformationArn(value: Arn): Self = this.set("featureTransformationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureTransformationArn: Self = this.set("featureTransformationArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
