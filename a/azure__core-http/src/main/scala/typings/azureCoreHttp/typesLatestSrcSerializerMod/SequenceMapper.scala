package typings.azureCoreHttp.typesLatestSrcSerializerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azureCoreHttp.typesLatestSrcSerializerMod.Mapper because Already inherited */ trait SequenceMapper
  extends StObject
     with BaseMapper {
  
  /**
    * The type descriptor of the `SequenceMapper`.
    */
  @JSName("type")
  var type_SequenceMapper: SequenceMapperType
}
object SequenceMapper {
  
  inline def apply(`type`: SequenceMapperType): SequenceMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceMapper]
  }
  
  extension [Self <: SequenceMapper](x: Self) {
    
    inline def setType(value: SequenceMapperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
