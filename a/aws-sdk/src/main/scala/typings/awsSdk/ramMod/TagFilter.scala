package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFilter extends js.Object {
  
  /**
    * The tag key.
    */
  var tagKey: js.UndefOr[TagKey] = js.native
  
  /**
    * The tag values.
    */
  var tagValues: js.UndefOr[TagValueList] = js.native
}
object TagFilter {
  
  @scala.inline
  def apply(): TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilter]
  }
  
  @scala.inline
  implicit class TagFilterOps[Self <: TagFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTagKey(value: TagKey): Self = this.set("tagKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagKey: Self = this.set("tagKey", js.undefined)
    
    @scala.inline
    def setTagValuesVarargs(value: TagValue*): Self = this.set("tagValues", js.Array(value :_*))
    
    @scala.inline
    def setTagValues(value: TagValueList): Self = this.set("tagValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagValues: Self = this.set("tagValues", js.undefined)
  }
}
