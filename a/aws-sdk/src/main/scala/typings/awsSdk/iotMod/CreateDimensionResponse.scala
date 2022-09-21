package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDimensionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created dimension.
    */
  var arn: js.UndefOr[DimensionArn] = js.undefined
  
  /**
    * A unique identifier for the dimension.
    */
  var name: js.UndefOr[DimensionName] = js.undefined
}
object CreateDimensionResponse {
  
  inline def apply(): CreateDimensionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDimensionResponse]
  }
  
  extension [Self <: CreateDimensionResponse](x: Self) {
    
    inline def setArn(value: DimensionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
