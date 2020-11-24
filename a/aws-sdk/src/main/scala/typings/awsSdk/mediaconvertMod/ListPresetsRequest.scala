package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPresetsRequest extends js.Object {
  
  /**
    * Optionally, specify a preset category to limit responses to only presets from that category.
    */
  var Category: js.UndefOr[string] = js.native
  
  /**
    * Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  var ListBy: js.UndefOr[PresetListBy] = js.native
  
  /**
    * Optional. Number of presets, up to twenty, that will be returned at one time
    */
  var MaxResults: js.UndefOr[integerMin1Max20] = js.native
  
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of presets.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typings.awsSdk.mediaconvertMod.Order] = js.native
}
object ListPresetsRequest {
  
  @scala.inline
  def apply(): ListPresetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsRequest]
  }
  
  @scala.inline
  implicit class ListPresetsRequestOps[Self <: ListPresetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategory(value: string): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    
    @scala.inline
    def setListBy(value: PresetListBy): Self = this.set("ListBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListBy: Self = this.set("ListBy", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integerMin1Max20): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOrder(value: Order): Self = this.set("Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("Order", js.undefined)
  }
}
