package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppsListResponse extends StObject {
  
  /**
    * The details of the AWS Firewall Manager applications list.
    */
  var AppsList: js.UndefOr[AppsListData] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the applications list.
    */
  var AppsListArn: js.UndefOr[ResourceArn] = js.native
}
object PutAppsListResponse {
  
  @scala.inline
  def apply(): PutAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppsListResponse]
  }
  
  @scala.inline
  implicit class PutAppsListResponseMutableBuilder[Self <: PutAppsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsList(value: AppsListData): Self = StObject.set(x, "AppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsListArn(value: ResourceArn): Self = StObject.set(x, "AppsListArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsListArnUndefined: Self = StObject.set(x, "AppsListArn", js.undefined)
    
    @scala.inline
    def setAppsListUndefined: Self = StObject.set(x, "AppsList", js.undefined)
  }
}
