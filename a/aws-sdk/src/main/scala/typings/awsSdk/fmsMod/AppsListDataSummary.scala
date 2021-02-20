package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsListDataSummary extends StObject {
  
  /**
    * An array of App objects in the AWS Firewall Manager applications list.
    */
  var AppsList: js.UndefOr[typings.awsSdk.fmsMod.AppsList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the applications list.
    */
  var ListArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The ID of the applications list.
    */
  var ListId: js.UndefOr[typings.awsSdk.fmsMod.ListId] = js.native
  
  /**
    * The name of the applications list.
    */
  var ListName: js.UndefOr[ResourceName] = js.native
}
object AppsListDataSummary {
  
  @scala.inline
  def apply(): AppsListDataSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsListDataSummary]
  }
  
  @scala.inline
  implicit class AppsListDataSummaryMutableBuilder[Self <: AppsListDataSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsList(value: AppsList): Self = StObject.set(x, "AppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsListUndefined: Self = StObject.set(x, "AppsList", js.undefined)
    
    @scala.inline
    def setAppsListVarargs(value: App*): Self = StObject.set(x, "AppsList", js.Array(value :_*))
    
    @scala.inline
    def setListArn(value: ResourceArn): Self = StObject.set(x, "ListArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListArnUndefined: Self = StObject.set(x, "ListArn", js.undefined)
    
    @scala.inline
    def setListId(value: ListId): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "ListId", js.undefined)
    
    @scala.inline
    def setListName(value: ResourceName): Self = StObject.set(x, "ListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListNameUndefined: Self = StObject.set(x, "ListName", js.undefined)
  }
}
