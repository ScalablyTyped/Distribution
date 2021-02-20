package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleScopeTerm extends StObject {
  
  /**
    * The operator to use in the condition. Valid operators for each supported property (key) are: OBJECT_EXTENSION - EQ (equals) or NE (not equals) OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS OBJECT_SIZE - Any operator except CONTAINS TAG - EQ (equals) or NE (not equals)
    */
  var comparator: js.UndefOr[JobComparator] = js.native
  
  /**
    * The object property to use in the condition.
    */
  var key: js.UndefOr[ScopeFilterKey] = js.native
  
  /**
    * An array that lists the values to use in the condition. If the value for the key property is OBJECT_EXTENSION, this array can specify multiple values and Amazon Macie uses an OR operator to join the values. Otherwise, this array can specify only one value. Valid values for each supported property (key) are: OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: doc, docx, pdf OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was created or last changed, whichever is latest. For example: 2020-09-28T14:31:13Z OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object. TAG - A string that represents a tag key for an object. For advanced options, use a TagScopeTerm object, instead of a SimpleScopeTerm object, to define a tag-based condition for the job.
    */
  var values: js.UndefOr[listOfString] = js.native
}
object SimpleScopeTerm {
  
  @scala.inline
  def apply(): SimpleScopeTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleScopeTerm]
  }
  
  @scala.inline
  implicit class SimpleScopeTermMutableBuilder[Self <: SimpleScopeTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: JobComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setKey(value: ScopeFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValues(value: listOfString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: string*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
