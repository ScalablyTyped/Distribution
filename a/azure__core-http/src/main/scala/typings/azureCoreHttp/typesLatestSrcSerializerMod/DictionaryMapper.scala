package typings.azureCoreHttp.typesLatestSrcSerializerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azureCoreHttp.typesLatestSrcSerializerMod.Mapper because Already inherited */ trait DictionaryMapper
  extends StObject
     with BaseMapper {
  
  /**
    * Optionally, a prefix to add to the header collection.
    */
  var headerCollectionPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The type descriptor of the `DictionaryMapper`.
    */
  @JSName("type")
  var type_DictionaryMapper: DictionaryMapperType
}
object DictionaryMapper {
  
  inline def apply(`type`: DictionaryMapperType): DictionaryMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryMapper]
  }
  
  extension [Self <: DictionaryMapper](x: Self) {
    
    inline def setHeaderCollectionPrefix(value: String): Self = StObject.set(x, "headerCollectionPrefix", value.asInstanceOf[js.Any])
    
    inline def setHeaderCollectionPrefixUndefined: Self = StObject.set(x, "headerCollectionPrefix", js.undefined)
    
    inline def setType(value: DictionaryMapperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
