package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiClient extends js.Object {
  
  var CollectionFormatEnum: typings.cloudmersiveVirusApiClient.mod.CollectionFormatEnum = js.native
  
  /**
    * Constructs a new map or array model from REST data.
    * @param data any - The REST data.
    * @param obj any - The target object or array.
    */
  def constructFromObject(data: js.Any, obj: js.Any, itemType: js.Any): Unit = js.native
  
  /**
    * Converts a value to the specified type.
    * @param data string | Object - The data to convert, as a string or object.
    * @param type any - The type to return.
    * Pass a string for simple types or the constructor function for a complex type. Pass an
    * array containing the type name to return an array of that type. To return an object, pass
    * an object with one property whose name is the key type and whose value is the corresponding
    *  value type: all properties on <code>data<code> will be converted to this type.
    * @returns An instance of the specified type or null or undefined if data is null or undefined.
    */
  def convertToType(data: String, `type`: js.Any): js.Any = js.native
  def convertToType(data: js.Object, `type`: js.Any): js.Any = js.native
  
  var instance: ApiInstance = js.native
  
  /**
    * Parses an ISO-8601 string representation of a date value.
    * @param str string - The date value as a string.
    * @returns Date - The parsed date object.
    */
  def parseDate(str: String): Date = js.native
}
@JSImport("cloudmersive-virus-api-client", "ApiClient")
@js.native
object ApiClient extends TopLevel[ApiClient]
