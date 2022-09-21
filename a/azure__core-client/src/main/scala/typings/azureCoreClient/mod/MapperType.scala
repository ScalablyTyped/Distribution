package typings.azureCoreClient.mod

import typings.azureCoreClient.azureCoreClientStrings.Base64Url
import typings.azureCoreClient.azureCoreClientStrings.Boolean
import typings.azureCoreClient.azureCoreClientStrings.ByteArray
import typings.azureCoreClient.azureCoreClientStrings.Date
import typings.azureCoreClient.azureCoreClientStrings.DateTime
import typings.azureCoreClient.azureCoreClientStrings.DateTimeRfc1123
import typings.azureCoreClient.azureCoreClientStrings.Number
import typings.azureCoreClient.azureCoreClientStrings.Object
import typings.azureCoreClient.azureCoreClientStrings.Stream
import typings.azureCoreClient.azureCoreClientStrings.String
import typings.azureCoreClient.azureCoreClientStrings.TimeSpan
import typings.azureCoreClient.azureCoreClientStrings.UnixTime
import typings.azureCoreClient.azureCoreClientStrings.Uuid
import typings.azureCoreClient.azureCoreClientStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.azureCoreClient.mod.SimpleMapperType
  - typings.azureCoreClient.mod.CompositeMapperType
  - typings.azureCoreClient.mod.SequenceMapperType
  - typings.azureCoreClient.mod.DictionaryMapperType
  - typings.azureCoreClient.mod.EnumMapperType
*/
trait MapperType extends StObject
object MapperType {
  
  inline def CompositeMapperType(): typings.azureCoreClient.mod.CompositeMapperType = {
    val __obj = js.Dynamic.literal(name = "Composite")
    __obj.asInstanceOf[typings.azureCoreClient.mod.CompositeMapperType]
  }
  
  inline def DictionaryMapperType(value: Mapper): typings.azureCoreClient.mod.DictionaryMapperType = {
    val __obj = js.Dynamic.literal(name = "Dictionary", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreClient.mod.DictionaryMapperType]
  }
  
  inline def EnumMapperType(allowedValues: js.Array[Any]): typings.azureCoreClient.mod.EnumMapperType = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], name = "Enum")
    __obj.asInstanceOf[typings.azureCoreClient.mod.EnumMapperType]
  }
  
  inline def SequenceMapperType(element: Mapper): typings.azureCoreClient.mod.SequenceMapperType = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = "Sequence")
    __obj.asInstanceOf[typings.azureCoreClient.mod.SequenceMapperType]
  }
  
  inline def SimpleMapperType(
    name: Base64Url | Boolean | ByteArray | Date | DateTime | DateTimeRfc1123 | Object | Stream | String | TimeSpan | UnixTime | Uuid | Number | any
  ): typings.azureCoreClient.mod.SimpleMapperType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureCoreClient.mod.SimpleMapperType]
  }
}
