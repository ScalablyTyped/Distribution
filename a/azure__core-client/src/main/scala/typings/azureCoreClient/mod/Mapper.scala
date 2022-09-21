package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.azureCoreClient.mod.BaseMapper
  - typings.azureCoreClient.mod.CompositeMapper
  - typings.azureCoreClient.mod.SequenceMapper
  - typings.azureCoreClient.mod.DictionaryMapper
  - typings.azureCoreClient.mod.EnumMapper
*/
trait Mapper extends StObject
object Mapper {
  
  inline def BaseMapper(`type`: MapperType): typings.azureCoreClient.mod.BaseMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreClient.mod.BaseMapper]
  }
  
  inline def CompositeMapper(`type`: CompositeMapperType): typings.azureCoreClient.mod.CompositeMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreClient.mod.CompositeMapper]
  }
  
  inline def DictionaryMapper(`type`: DictionaryMapperType): typings.azureCoreClient.mod.DictionaryMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreClient.mod.DictionaryMapper]
  }
  
  inline def EnumMapper(`type`: EnumMapperType): typings.azureCoreClient.mod.EnumMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreClient.mod.EnumMapper]
  }
  
  inline def SequenceMapper(`type`: SequenceMapperType): typings.azureCoreClient.mod.SequenceMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreClient.mod.SequenceMapper]
  }
}
