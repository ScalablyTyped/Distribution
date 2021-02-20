package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDimensionResponse extends StObject {
  
  /**
    * The ARN (Amazon resource name) of the created dimension.
    */
  var arn: js.UndefOr[DimensionArn] = js.native
  
  /**
    * A unique identifier for the dimension.
    */
  var name: js.UndefOr[DimensionName] = js.native
}
object CreateDimensionResponse {
  
  @scala.inline
  def apply(): CreateDimensionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDimensionResponse]
  }
  
  @scala.inline
  implicit class CreateDimensionResponseMutableBuilder[Self <: CreateDimensionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: DimensionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
