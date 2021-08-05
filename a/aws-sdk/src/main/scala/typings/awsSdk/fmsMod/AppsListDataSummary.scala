package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsListDataSummary extends StObject {
  
  /**
    * An array of App objects in the AWS Firewall Manager applications list.
    */
  var AppsList: js.UndefOr[typings.awsSdk.fmsMod.AppsList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the applications list.
    */
  var ListArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the applications list.
    */
  var ListId: js.UndefOr[typings.awsSdk.fmsMod.ListId] = js.undefined
  
  /**
    * The name of the applications list.
    */
  var ListName: js.UndefOr[ResourceName] = js.undefined
}
object AppsListDataSummary {
  
  inline def apply(): AppsListDataSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsListDataSummary]
  }
  
  extension [Self <: AppsListDataSummary](x: Self) {
    
    inline def setAppsList(value: AppsList): Self = StObject.set(x, "AppsList", value.asInstanceOf[js.Any])
    
    inline def setAppsListUndefined: Self = StObject.set(x, "AppsList", js.undefined)
    
    inline def setAppsListVarargs(value: App*): Self = StObject.set(x, "AppsList", js.Array(value :_*))
    
    inline def setListArn(value: ResourceArn): Self = StObject.set(x, "ListArn", value.asInstanceOf[js.Any])
    
    inline def setListArnUndefined: Self = StObject.set(x, "ListArn", js.undefined)
    
    inline def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    inline def setListIdUndefined: Self = StObject.set(x, "ListId", js.undefined)
    
    inline def setListName(value: ResourceName): Self = StObject.set(x, "ListName", value.asInstanceOf[js.Any])
    
    inline def setListNameUndefined: Self = StObject.set(x, "ListName", js.undefined)
  }
}
