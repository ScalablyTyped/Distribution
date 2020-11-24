package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInventoryDeletionsResult extends js.Object {
  
  /**
    * A list of status items for deleted inventory.
    */
  var InventoryDeletions: js.UndefOr[InventoryDeletionsList] = js.native
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeInventoryDeletionsResult {
  
  @scala.inline
  def apply(): DescribeInventoryDeletionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInventoryDeletionsResult]
  }
  
  @scala.inline
  implicit class DescribeInventoryDeletionsResultOps[Self <: DescribeInventoryDeletionsResult] (val x: Self) extends AnyVal {
    
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
    def setInventoryDeletionsVarargs(value: InventoryDeletionStatusItem*): Self = this.set("InventoryDeletions", js.Array(value :_*))
    
    @scala.inline
    def setInventoryDeletions(value: InventoryDeletionsList): Self = this.set("InventoryDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryDeletions: Self = this.set("InventoryDeletions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
