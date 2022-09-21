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

trait SimpleMapperType
  extends StObject
     with MapperType {
  
  /**
    * Name of the type of the property.
    */
  var name: Base64Url | Boolean | ByteArray | Date | DateTime | DateTimeRfc1123 | Object | Stream | String | TimeSpan | UnixTime | Uuid | Number | any
}
object SimpleMapperType {
  
  inline def apply(
    name: Base64Url | Boolean | ByteArray | Date | DateTime | DateTimeRfc1123 | Object | Stream | String | TimeSpan | UnixTime | Uuid | Number | any
  ): SimpleMapperType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMapperType]
  }
  
  extension [Self <: SimpleMapperType](x: Self) {
    
    inline def setName(
      value: Base64Url | Boolean | ByteArray | Date | DateTime | DateTimeRfc1123 | Object | Stream | String | TimeSpan | UnixTime | Uuid | Number | any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
