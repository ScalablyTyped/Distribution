package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCloudFrontOriginAccessIdentitiesResult extends StObject {
  
  /**
    * The CloudFrontOriginAccessIdentityList type. 
    */
  var CloudFrontOriginAccessIdentityList: js.UndefOr[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentityList] = js.native
}
object ListCloudFrontOriginAccessIdentitiesResult {
  
  @scala.inline
  def apply(): ListCloudFrontOriginAccessIdentitiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
  }
  
  @scala.inline
  implicit class ListCloudFrontOriginAccessIdentitiesResultMutableBuilder[Self <: ListCloudFrontOriginAccessIdentitiesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityList(value: CloudFrontOriginAccessIdentityList): Self = StObject.set(x, "CloudFrontOriginAccessIdentityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontOriginAccessIdentityListUndefined: Self = StObject.set(x, "CloudFrontOriginAccessIdentityList", js.undefined)
  }
}
