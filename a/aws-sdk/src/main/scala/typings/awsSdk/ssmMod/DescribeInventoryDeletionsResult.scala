package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInventoryDeletionsResult extends StObject {
  
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
  implicit class DescribeInventoryDeletionsResultMutableBuilder[Self <: DescribeInventoryDeletionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInventoryDeletions(value: InventoryDeletionsList): Self = StObject.set(x, "InventoryDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryDeletionsUndefined: Self = StObject.set(x, "InventoryDeletions", js.undefined)
    
    @scala.inline
    def setInventoryDeletionsVarargs(value: InventoryDeletionStatusItem*): Self = StObject.set(x, "InventoryDeletions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
