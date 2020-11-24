package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePrefixListsResult extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * All available prefix lists.
    */
  var PrefixLists: js.UndefOr[PrefixListSet] = js.native
}
object DescribePrefixListsResult {
  
  @scala.inline
  def apply(): DescribePrefixListsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePrefixListsResult]
  }
  
  @scala.inline
  implicit class DescribePrefixListsResultOps[Self <: DescribePrefixListsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPrefixListsVarargs(value: PrefixList*): Self = this.set("PrefixLists", js.Array(value :_*))
    
    @scala.inline
    def setPrefixLists(value: PrefixListSet): Self = this.set("PrefixLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixLists: Self = this.set("PrefixLists", js.undefined)
  }
}
