package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobAttributeValue extends StObject {
  
  var Value: js.UndefOr[_Blob] = js.undefined
}
object BlobAttributeValue {
  
  @scala.inline
  def apply(): BlobAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobAttributeValue]
  }
  
  @scala.inline
  implicit class BlobAttributeValueMutableBuilder[Self <: BlobAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: _Blob): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
