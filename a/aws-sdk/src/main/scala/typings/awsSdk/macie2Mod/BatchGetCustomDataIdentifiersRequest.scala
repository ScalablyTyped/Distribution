package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCustomDataIdentifiersRequest extends StObject {
  
  /**
    * An array of strings that lists the unique identifiers for the custom data identifiers to retrieve information about.
    */
  var ids: js.UndefOr[listOfString] = js.undefined
}
object BatchGetCustomDataIdentifiersRequest {
  
  @scala.inline
  def apply(): BatchGetCustomDataIdentifiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCustomDataIdentifiersRequest]
  }
  
  @scala.inline
  implicit class BatchGetCustomDataIdentifiersRequestMutableBuilder[Self <: BatchGetCustomDataIdentifiersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: listOfString): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: string*): Self = StObject.set(x, "ids", js.Array(value :_*))
  }
}
