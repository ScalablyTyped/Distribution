package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOrigins extends StObject {
  
  /**
    * A complex type that contains origins or origin groups for this distribution.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginItemList] = js.undefined
}
object AwsCloudFrontDistributionOrigins {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOrigins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOrigins]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginsMutableBuilder[Self <: AwsCloudFrontDistributionOrigins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: AwsCloudFrontDistributionOriginItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: AwsCloudFrontDistributionOriginItem*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
