package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineDescription extends StObject {
  
  /**
    * Description of the pipeline.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
    */
  var fields: fieldList = js.native
  
  /**
    * The name of the pipeline.
    */
  var name: id = js.native
  
  /**
    * The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
    */
  var pipelineId: id = js.native
  
  /**
    * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
    */
  var tags: js.UndefOr[tagList] = js.native
}
object PipelineDescription {
  
  @scala.inline
  def apply(fields: fieldList, name: id, pipelineId: id): PipelineDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineDescription]
  }
  
  @scala.inline
  implicit class PipelineDescriptionMutableBuilder[Self <: PipelineDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFields(value: fieldList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
