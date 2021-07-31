package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisableStandardsResponse extends StObject {
  
  /**
    * The details of the standards subscriptions that were disabled.
    */
  var StandardsSubscriptions: js.UndefOr[typings.awsSdk.securityhubMod.StandardsSubscriptions] = js.undefined
}
object BatchDisableStandardsResponse {
  
  @scala.inline
  def apply(): BatchDisableStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisableStandardsResponse]
  }
  
  @scala.inline
  implicit class BatchDisableStandardsResponseMutableBuilder[Self <: BatchDisableStandardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStandardsSubscriptions(value: StandardsSubscriptions): Self = StObject.set(x, "StandardsSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsSubscriptionsUndefined: Self = StObject.set(x, "StandardsSubscriptions", js.undefined)
    
    @scala.inline
    def setStandardsSubscriptionsVarargs(value: StandardsSubscription*): Self = StObject.set(x, "StandardsSubscriptions", js.Array(value :_*))
  }
}
