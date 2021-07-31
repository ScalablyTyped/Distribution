package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginGroupFailoverStatusCodes extends StObject {
  
  /**
    * The list of status code values that can cause a failover to the next origin.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList] = js.undefined
  
  /**
    * The number of status codes that can cause a failover.
    */
  var Quantity: js.UndefOr[Integer] = js.undefined
}
object AwsCloudFrontDistributionOriginGroupFailoverStatusCodes {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginGroupFailoverStatusCodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroupFailoverStatusCodes]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginGroupFailoverStatusCodesMutableBuilder[Self <: AwsCloudFrontDistributionOriginGroupFailoverStatusCodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Integer*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: Integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
  }
}
