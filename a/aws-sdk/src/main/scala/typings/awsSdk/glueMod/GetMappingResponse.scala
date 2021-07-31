package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMappingResponse extends StObject {
  
  /**
    * A list of mappings to the specified targets.
    */
  var Mapping: MappingList
}
object GetMappingResponse {
  
  @scala.inline
  def apply(Mapping: MappingList): GetMappingResponse = {
    val __obj = js.Dynamic.literal(Mapping = Mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMappingResponse]
  }
  
  @scala.inline
  implicit class GetMappingResponseMutableBuilder[Self <: GetMappingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapping(value: MappingList): Self = StObject.set(x, "Mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingVarargs(value: MappingEntry*): Self = StObject.set(x, "Mapping", js.Array(value :_*))
  }
}
