package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyFpgaImageResult extends StObject {
  
  /**
    * The ID of the new AFI.
    */
  var FpgaImageId: js.UndefOr[String] = js.undefined
}
object CopyFpgaImageResult {
  
  @scala.inline
  def apply(): CopyFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyFpgaImageResult]
  }
  
  @scala.inline
  implicit class CopyFpgaImageResultMutableBuilder[Self <: CopyFpgaImageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpgaImageId(value: String): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImageIdUndefined: Self = StObject.set(x, "FpgaImageId", js.undefined)
  }
}
