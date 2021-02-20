package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOfferingStatusResult extends StObject {
  
  /**
    * When specified, gets the offering status for the current period.
    */
  var current: js.UndefOr[OfferingStatusMap] = js.native
  
  /**
    * When specified, gets the offering status for the next period.
    */
  var nextPeriod: js.UndefOr[OfferingStatusMap] = js.native
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object GetOfferingStatusResult {
  
  @scala.inline
  def apply(): GetOfferingStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOfferingStatusResult]
  }
  
  @scala.inline
  implicit class GetOfferingStatusResultMutableBuilder[Self <: GetOfferingStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: OfferingStatusMap): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setNextPeriod(value: OfferingStatusMap): Self = StObject.set(x, "nextPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPeriodUndefined: Self = StObject.set(x, "nextPeriod", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
