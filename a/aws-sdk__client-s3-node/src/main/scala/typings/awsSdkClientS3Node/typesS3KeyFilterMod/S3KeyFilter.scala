package typings.awsSdkClientS3Node.typesS3KeyFilterMod

import typings.awsSdkClientS3Node.typesFilterRuleMod.FilterRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3KeyFilter extends js.Object {
  
  /**
    * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
    */
  var FilterRules: js.UndefOr[js.Array[FilterRule] | Iterable[FilterRule]] = js.native
}
object S3KeyFilter {
  
  @scala.inline
  def apply(): S3KeyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3KeyFilter]
  }
  
  @scala.inline
  implicit class S3KeyFilterOps[Self <: S3KeyFilter] (val x: Self) extends AnyVal {
    
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
    def setFilterRulesVarargs(value: FilterRule*): Self = this.set("FilterRules", js.Array(value :_*))
    
    @scala.inline
    def setFilterRules(value: js.Array[FilterRule] | Iterable[FilterRule]): Self = this.set("FilterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterRules: Self = this.set("FilterRules", js.undefined)
  }
}
