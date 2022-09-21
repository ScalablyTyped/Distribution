package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineObject extends StObject {
  
  /**
    * Key-value pairs that define the properties of the object.
    */
  var fields: fieldList
  
  /**
    * The ID of the object.
    */
  var id: typings.awsSdk.datapipelineMod.id
  
  /**
    * The name of the object.
    */
  var name: id
}
object PipelineObject {
  
  inline def apply(fields: fieldList, id: id, name: id): PipelineObject = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineObject]
  }
  
  extension [Self <: PipelineObject](x: Self) {
    
    inline def setFields(value: fieldList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
