package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azureCoreClient.mod.Mapper because Already inherited */ trait CompositeMapper
  extends StObject
     with BaseMapper {
  
  /**
    * The type descriptor of the `CompositeMapper`.
    */
  @JSName("type")
  var type_CompositeMapper: CompositeMapperType
}
object CompositeMapper {
  
  inline def apply(`type`: CompositeMapperType): CompositeMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeMapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositeMapper] (val x: Self) extends AnyVal {
    
    inline def setType(value: CompositeMapperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
