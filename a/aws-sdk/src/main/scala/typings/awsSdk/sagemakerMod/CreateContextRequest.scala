package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContextRequest extends StObject {
  
  /**
    * The name of the context. Must be unique to your account in an Amazon Web Services Region.
    */
  var ContextName: ExperimentEntityName
  
  /**
    * The context type.
    */
  var ContextType: String256
  
  /**
    * The description of the context.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.undefined
  
  /**
    * A list of properties to add to the context.
    */
  var Properties: js.UndefOr[LineageEntityParameters] = js.undefined
  
  /**
    * The source type, ID, and URI.
    */
  var Source: ContextSource
  
  /**
    * A list of tags to apply to the context.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateContextRequest {
  
  inline def apply(ContextName: ExperimentEntityName, ContextType: String256, Source: ContextSource): CreateContextRequest = {
    val __obj = js.Dynamic.literal(ContextName = ContextName.asInstanceOf[js.Any], ContextType = ContextType.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContextRequest]
  }
  
  extension [Self <: CreateContextRequest](x: Self) {
    
    inline def setContextName(value: ExperimentEntityName): Self = StObject.set(x, "ContextName", value.asInstanceOf[js.Any])
    
    inline def setContextType(value: String256): Self = StObject.set(x, "ContextType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setProperties(value: LineageEntityParameters): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setSource(value: ContextSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
