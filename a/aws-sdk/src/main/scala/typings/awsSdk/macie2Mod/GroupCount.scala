package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupCount extends StObject {
  
  /**
    * The total number of findings in the group of query results.
    */
  var count: js.UndefOr[long] = js.undefined
  
  /**
    * The name of the property that defines the group in the query results, as specified by the groupBy property in the query request.
    */
  var groupKey: js.UndefOr[string] = js.undefined
}
object GroupCount {
  
  @scala.inline
  def apply(): GroupCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCount]
  }
  
  @scala.inline
  implicit class GroupCountMutableBuilder[Self <: GroupCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setGroupKey(value: string): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
  }
}
