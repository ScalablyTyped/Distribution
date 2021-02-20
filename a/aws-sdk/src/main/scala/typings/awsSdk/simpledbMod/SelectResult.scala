package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectResult extends StObject {
  
  /**
    * A list of items that match the select expression.
    */
  var Items: js.UndefOr[ItemList] = js.native
  
  /**
    * An opaque token indicating that more items than MaxNumberOfItems were matched, the response size exceeded 1 megabyte, or the execution time exceeded 5 seconds.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object SelectResult {
  
  @scala.inline
  def apply(): SelectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectResult]
  }
  
  @scala.inline
  implicit class SelectResultMutableBuilder[Self <: SelectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
