package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppsListResponse extends StObject {
  
  /**
    * The details of the AWS Firewall Manager applications list.
    */
  var AppsList: js.UndefOr[AppsListData] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the applications list.
    */
  var AppsListArn: js.UndefOr[ResourceArn] = js.undefined
}
object PutAppsListResponse {
  
  inline def apply(): PutAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppsListResponse]
  }
  
  extension [Self <: PutAppsListResponse](x: Self) {
    
    inline def setAppsList(value: AppsListData): Self = StObject.set(x, "AppsList", value.asInstanceOf[js.Any])
    
    inline def setAppsListArn(value: ResourceArn): Self = StObject.set(x, "AppsListArn", value.asInstanceOf[js.Any])
    
    inline def setAppsListArnUndefined: Self = StObject.set(x, "AppsListArn", js.undefined)
    
    inline def setAppsListUndefined: Self = StObject.set(x, "AppsList", js.undefined)
  }
}
