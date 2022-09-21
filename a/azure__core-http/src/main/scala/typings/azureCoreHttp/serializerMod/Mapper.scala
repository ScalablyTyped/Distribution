package typings.azureCoreHttp.serializerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.azureCoreHttp.serializerMod.BaseMapper
  - typings.azureCoreHttp.serializerMod.CompositeMapper
  - typings.azureCoreHttp.serializerMod.SequenceMapper
  - typings.azureCoreHttp.serializerMod.DictionaryMapper
  - typings.azureCoreHttp.serializerMod.EnumMapper
*/
trait Mapper extends StObject
object Mapper {
  
  inline def BaseMapper(`type`: MapperType): typings.azureCoreHttp.serializerMod.BaseMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreHttp.serializerMod.BaseMapper]
  }
  
  inline def CompositeMapper(`type`: CompositeMapperType): typings.azureCoreHttp.serializerMod.CompositeMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreHttp.serializerMod.CompositeMapper]
  }
  
  inline def DictionaryMapper(`type`: DictionaryMapperType): typings.azureCoreHttp.serializerMod.DictionaryMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreHttp.serializerMod.DictionaryMapper]
  }
  
  inline def EnumMapper(`type`: EnumMapperType): typings.azureCoreHttp.serializerMod.EnumMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreHttp.serializerMod.EnumMapper]
  }
  
  inline def SequenceMapper(`type`: SequenceMapperType): typings.azureCoreHttp.serializerMod.SequenceMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreHttp.serializerMod.SequenceMapper]
  }
}
