package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateIndexResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the index created by this operation.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}
object BatchCreateIndexResponse {
  
  @scala.inline
  def apply(): BatchCreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateIndexResponse]
  }
  
  @scala.inline
  implicit class BatchCreateIndexResponseMutableBuilder[Self <: BatchCreateIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
