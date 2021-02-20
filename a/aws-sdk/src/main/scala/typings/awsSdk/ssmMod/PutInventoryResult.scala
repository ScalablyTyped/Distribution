package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutInventoryResult extends StObject {
  
  /**
    * Information about the request.
    */
  var Message: js.UndefOr[PutInventoryMessage] = js.native
}
object PutInventoryResult {
  
  @scala.inline
  def apply(): PutInventoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutInventoryResult]
  }
  
  @scala.inline
  implicit class PutInventoryResultMutableBuilder[Self <: PutInventoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: PutInventoryMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
