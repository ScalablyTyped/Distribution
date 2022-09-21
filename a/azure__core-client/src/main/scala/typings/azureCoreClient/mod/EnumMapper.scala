package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azureCoreClient.mod.Mapper because Already inherited */ trait EnumMapper
  extends StObject
     with BaseMapper {
  
  /**
    * The type descriptor of the `EnumMapper`.
    */
  @JSName("type")
  var type_EnumMapper: EnumMapperType
}
object EnumMapper {
  
  inline def apply(`type`: EnumMapperType): EnumMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMapper]
  }
  
  extension [Self <: EnumMapper](x: Self) {
    
    inline def setType(value: EnumMapperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
