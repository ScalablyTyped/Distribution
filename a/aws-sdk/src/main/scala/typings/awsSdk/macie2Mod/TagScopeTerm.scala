package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagScopeTerm extends StObject {
  
  /**
    * The operator to use in the condition. Valid operators are EQ (equals) or NE (not equals).
    */
  var comparator: js.UndefOr[JobComparator] = js.undefined
  
  /**
    * The tag key to use in the condition.
    */
  var key: js.UndefOr[string] = js.undefined
  
  /**
    * The tag keys or tag key and value pairs to use in the condition.
    */
  var tagValues: js.UndefOr[listOfTagValuePair] = js.undefined
  
  /**
    * The type of object to apply the condition to.
    */
  var target: js.UndefOr[TagTarget] = js.undefined
}
object TagScopeTerm {
  
  @scala.inline
  def apply(): TagScopeTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagScopeTerm]
  }
  
  @scala.inline
  implicit class TagScopeTermMutableBuilder[Self <: TagScopeTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: JobComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setKey(value: string): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setTagValues(value: listOfTagValuePair): Self = StObject.set(x, "tagValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagValuesUndefined: Self = StObject.set(x, "tagValues", js.undefined)
    
    @scala.inline
    def setTagValuesVarargs(value: TagValuePair*): Self = StObject.set(x, "tagValues", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: TagTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
