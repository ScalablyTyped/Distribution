package typings.azureCoreHttp.typesLatestSrcSerializerMod

import typings.azureCoreHttp.azureCoreHttpStrings.Base64Url
import typings.azureCoreHttp.azureCoreHttpStrings.Boolean
import typings.azureCoreHttp.azureCoreHttpStrings.ByteArray
import typings.azureCoreHttp.azureCoreHttpStrings.Date
import typings.azureCoreHttp.azureCoreHttpStrings.DateTime
import typings.azureCoreHttp.azureCoreHttpStrings.DateTimeRfc1123
import typings.azureCoreHttp.azureCoreHttpStrings.Number
import typings.azureCoreHttp.azureCoreHttpStrings.Object
import typings.azureCoreHttp.azureCoreHttpStrings.Stream
import typings.azureCoreHttp.azureCoreHttpStrings.String
import typings.azureCoreHttp.azureCoreHttpStrings.TimeSpan
import typings.azureCoreHttp.azureCoreHttpStrings.UnixTime
import typings.azureCoreHttp.azureCoreHttpStrings.Uuid
import typings.azureCoreHttp.azureCoreHttpStrings.any
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
