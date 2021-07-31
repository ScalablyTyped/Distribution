package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGroupMetadata extends StObject {
  
  /**
    * The date the billing group was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
}
object BillingGroupMetadata {
  
  @scala.inline
  def apply(): BillingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGroupMetadata]
  }
  
  @scala.inline
  implicit class BillingGroupMetadataMutableBuilder[Self <: BillingGroupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
  }
}
