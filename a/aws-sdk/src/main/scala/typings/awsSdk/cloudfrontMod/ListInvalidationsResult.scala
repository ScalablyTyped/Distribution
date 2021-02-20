package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInvalidationsResult extends StObject {
  
  /**
    * Information about invalidation batches. 
    */
  var InvalidationList: js.UndefOr[typings.awsSdk.cloudfrontMod.InvalidationList] = js.native
}
object ListInvalidationsResult {
  
  @scala.inline
  def apply(): ListInvalidationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvalidationsResult]
  }
  
  @scala.inline
  implicit class ListInvalidationsResultMutableBuilder[Self <: ListInvalidationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidationList(value: InvalidationList): Self = StObject.set(x, "InvalidationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidationListUndefined: Self = StObject.set(x, "InvalidationList", js.undefined)
  }
}
