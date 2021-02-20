package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExperimentResponse extends StObject {
  
  /**
    * Who created the experiment.
    */
  var CreatedBy: js.UndefOr[UserContext] = js.native
  
  /**
    * When the experiment was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the experiment.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.native
  
  /**
    * The name of the experiment as displayed. If DisplayName isn't specified, ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
  
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * Who last modified the experiment.
    */
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  
  /**
    * When the experiment was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the source and, optionally, the type.
    */
  var Source: js.UndefOr[ExperimentSource] = js.native
}
object DescribeExperimentResponse {
  
  @scala.inline
  def apply(): DescribeExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExperimentResponse]
  }
  
  @scala.inline
  implicit class DescribeExperimentResponseMutableBuilder[Self <: DescribeExperimentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setSource(value: ExperimentSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
