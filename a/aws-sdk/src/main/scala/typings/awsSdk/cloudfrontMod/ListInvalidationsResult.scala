package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvalidationsResult extends StObject {
  
  /**
    * Information about invalidation batches. 
    */
  var InvalidationList: js.UndefOr[typings.awsSdk.cloudfrontMod.InvalidationList] = js.undefined
}
object ListInvalidationsResult {
  
  inline def apply(): ListInvalidationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvalidationsResult]
  }
  
  extension [Self <: ListInvalidationsResult](x: Self) {
    
    inline def setInvalidationList(value: InvalidationList): Self = StObject.set(x, "InvalidationList", value.asInstanceOf[js.Any])
    
    inline def setInvalidationListUndefined: Self = StObject.set(x, "InvalidationList", js.undefined)
  }
}
