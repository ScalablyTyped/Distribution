package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDimensionRequest extends StObject {
  
  /**
    * Each dimension must have a unique client request token. If you try to create a new dimension with the same token as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request.
    */
  var clientRequestToken: ClientRequestToken = js.native
  
  /**
    * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to remember what it does.
    */
  var name: DimensionName = js.native
  
  /**
    * Specifies the value or list of values for the dimension. For TOPIC_FILTER dimensions, this is a pattern used to match the MQTT topic (for example, "admin/#").
    */
  var stringValues: DimensionStringValues = js.native
  
  /**
    * Metadata that can be used to manage the dimension.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * Specifies the type of dimension. Supported types: TOPIC_FILTER. 
    */
  var `type`: DimensionType = js.native
}
object CreateDimensionRequest {
  
  @scala.inline
  def apply(
    clientRequestToken: ClientRequestToken,
    name: DimensionName,
    stringValues: DimensionStringValues,
    `type`: DimensionType
  ): CreateDimensionRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stringValues = stringValues.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDimensionRequest]
  }
  
  @scala.inline
  implicit class CreateDimensionRequestMutableBuilder[Self <: CreateDimensionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValues(value: DimensionStringValues): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValuesVarargs(value: DimensionStringValue*): Self = StObject.set(x, "stringValues", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: DimensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
