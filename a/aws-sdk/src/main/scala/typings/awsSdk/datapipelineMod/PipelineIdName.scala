package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineIdName extends StObject {
  
  /**
    * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
    */
  var id: js.UndefOr[typings.awsSdk.datapipelineMod.id] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[id] = js.undefined
}
object PipelineIdName {
  
  @scala.inline
  def apply(): PipelineIdName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineIdName]
  }
  
  @scala.inline
  implicit class PipelineIdNameMutableBuilder[Self <: PipelineIdName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
