package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFpgaImageResult extends StObject {
  
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.native
  
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.native
}
object CreateFpgaImageResult {
  
  @scala.inline
  def apply(): CreateFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFpgaImageResult]
  }
  
  @scala.inline
  implicit class CreateFpgaImageResultMutableBuilder[Self <: CreateFpgaImageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpgaImageGlobalId(value: String): Self = StObject.set(x, "FpgaImageGlobalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImageGlobalIdUndefined: Self = StObject.set(x, "FpgaImageGlobalId", js.undefined)
    
    @scala.inline
    def setFpgaImageId(value: String): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImageIdUndefined: Self = StObject.set(x, "FpgaImageId", js.undefined)
  }
}
