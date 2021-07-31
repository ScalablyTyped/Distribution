package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyFpgaImageAttributeResult extends StObject {
  
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[typings.awsSdk.ec2Mod.FpgaImageAttribute] = js.undefined
}
object ModifyFpgaImageAttributeResult {
  
  @scala.inline
  def apply(): ModifyFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyFpgaImageAttributeResult]
  }
  
  @scala.inline
  implicit class ModifyFpgaImageAttributeResultMutableBuilder[Self <: ModifyFpgaImageAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpgaImageAttribute(value: FpgaImageAttribute): Self = StObject.set(x, "FpgaImageAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImageAttributeUndefined: Self = StObject.set(x, "FpgaImageAttribute", js.undefined)
  }
}
