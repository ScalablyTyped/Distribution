package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInventoryDeletionsResult extends StObject {
  
  /**
    * A list of status items for deleted inventory.
    */
  var InventoryDeletions: js.UndefOr[InventoryDeletionsList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeInventoryDeletionsResult {
  
  inline def apply(): DescribeInventoryDeletionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInventoryDeletionsResult]
  }
  
  extension [Self <: DescribeInventoryDeletionsResult](x: Self) {
    
    inline def setInventoryDeletions(value: InventoryDeletionsList): Self = StObject.set(x, "InventoryDeletions", value.asInstanceOf[js.Any])
    
    inline def setInventoryDeletionsUndefined: Self = StObject.set(x, "InventoryDeletions", js.undefined)
    
    inline def setInventoryDeletionsVarargs(value: InventoryDeletionStatusItem*): Self = StObject.set(x, "InventoryDeletions", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
