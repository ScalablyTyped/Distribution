package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetachObjectResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the detached object.
    */
  var detachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}
object BatchDetachObjectResponse {
  
  @scala.inline
  def apply(): BatchDetachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetachObjectResponse]
  }
  
  @scala.inline
  implicit class BatchDetachObjectResponseMutableBuilder[Self <: BatchDetachObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "detachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedObjectIdentifierUndefined: Self = StObject.set(x, "detachedObjectIdentifier", js.undefined)
  }
}
