package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateByteMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken
  
  /**
    * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
    */
  var Name: ResourceName
}
object CreateByteMatchSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateByteMatchSetRequest]
  }
  
  @scala.inline
  implicit class CreateByteMatchSetRequestMutableBuilder[Self <: CreateByteMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
