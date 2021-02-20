package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFpgaImageAttributeResult extends StObject {
  
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[typings.awsSdk.ec2Mod.FpgaImageAttribute] = js.native
}
object DescribeFpgaImageAttributeResult {
  
  @scala.inline
  def apply(): DescribeFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFpgaImageAttributeResult]
  }
  
  @scala.inline
  implicit class DescribeFpgaImageAttributeResultMutableBuilder[Self <: DescribeFpgaImageAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpgaImageAttribute(value: FpgaImageAttribute): Self = StObject.set(x, "FpgaImageAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImageAttributeUndefined: Self = StObject.set(x, "FpgaImageAttribute", js.undefined)
  }
}
