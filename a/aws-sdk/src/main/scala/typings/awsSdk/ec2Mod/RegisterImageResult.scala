package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterImageResult extends StObject {
  
  /**
    * The ID of the newly registered AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
}
object RegisterImageResult {
  
  inline def apply(): RegisterImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterImageResult]
  }
  
  extension [Self <: RegisterImageResult](x: Self) {
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
