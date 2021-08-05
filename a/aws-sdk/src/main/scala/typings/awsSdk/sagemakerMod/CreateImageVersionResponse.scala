package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageVersionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image version.
    */
  var ImageVersionArn: js.UndefOr[typings.awsSdk.sagemakerMod.ImageVersionArn] = js.undefined
}
object CreateImageVersionResponse {
  
  inline def apply(): CreateImageVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageVersionResponse]
  }
  
  extension [Self <: CreateImageVersionResponse](x: Self) {
    
    inline def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageVersionArnUndefined: Self = StObject.set(x, "ImageVersionArn", js.undefined)
  }
}
