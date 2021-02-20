package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionOriginGroups extends StObject {
  
  /**
    * The list of origin groups.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupsItemList] = js.native
}
object AwsCloudFrontDistributionOriginGroups {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroups]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginGroupsMutableBuilder[Self <: AwsCloudFrontDistributionOriginGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: AwsCloudFrontDistributionOriginGroupsItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: AwsCloudFrontDistributionOriginGroup*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
