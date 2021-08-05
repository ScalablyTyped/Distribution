package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyImageResult extends StObject {
  
  /**
    * The ID of the new AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
}
object CopyImageResult {
  
  inline def apply(): CopyImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyImageResult]
  }
  
  extension [Self <: CopyImageResult](x: Self) {
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
