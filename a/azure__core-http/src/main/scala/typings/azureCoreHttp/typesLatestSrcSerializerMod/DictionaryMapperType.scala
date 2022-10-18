package typings.azureCoreHttp.typesLatestSrcSerializerMod

import typings.azureCoreHttp.azureCoreHttpStrings.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryMapperType
  extends StObject
     with MapperType {
  
  /**
    * Name of the sequence type mapper.
    */
  var name: Dictionary
  
  /**
    * The mapper to use to map the value of each property in the dictionary.
    */
  var value: Mapper
}
object DictionaryMapperType {
  
  inline def apply(value: Mapper): DictionaryMapperType = {
    val __obj = js.Dynamic.literal(name = "Dictionary", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryMapperType]
  }
  
  extension [Self <: DictionaryMapperType](x: Self) {
    
    inline def setName(value: Dictionary): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Mapper): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
