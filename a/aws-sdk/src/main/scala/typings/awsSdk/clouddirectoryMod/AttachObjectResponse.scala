package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachObjectResponse extends StObject {
  
  /**
    * The attached ObjectIdentifier, which is the child ObjectIdentifier.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}
object AttachObjectResponse {
  
  @scala.inline
  def apply(): AttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachObjectResponse]
  }
  
  @scala.inline
  implicit class AttachObjectResponseMutableBuilder[Self <: AttachObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "AttachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedObjectIdentifierUndefined: Self = StObject.set(x, "AttachedObjectIdentifier", js.undefined)
  }
}
