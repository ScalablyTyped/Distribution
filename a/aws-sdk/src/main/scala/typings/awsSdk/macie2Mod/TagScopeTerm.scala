package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagScopeTerm extends js.Object {
  
  /**
    * The operator to use in the condition. Valid operators are EQ (equals) or NE (not equals).
    */
  var comparator: js.UndefOr[JobComparator] = js.native
  
  /**
    * The tag key to use in the condition.
    */
  var key: js.UndefOr[string] = js.native
  
  /**
    * The tag keys or tag key and value pairs to use in the condition.
    */
  var tagValues: js.UndefOr[listOfTagValuePair] = js.native
  
  /**
    * The type of object to apply the condition to.
    */
  var target: js.UndefOr[TagTarget] = js.native
}
object TagScopeTerm {
  
  @scala.inline
  def apply(): TagScopeTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagScopeTerm]
  }
  
  @scala.inline
  implicit class TagScopeTermOps[Self <: TagScopeTerm] (val x: Self) extends AnyVal {
    
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
    def setComparator(value: JobComparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setKey(value: string): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setTagValuesVarargs(value: TagValuePair*): Self = this.set("tagValues", js.Array(value :_*))
    
    @scala.inline
    def setTagValues(value: listOfTagValuePair): Self = this.set("tagValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagValues: Self = this.set("tagValues", js.undefined)
    
    @scala.inline
    def setTarget(value: TagTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
