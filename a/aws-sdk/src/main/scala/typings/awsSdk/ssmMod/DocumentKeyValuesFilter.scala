package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentKeyValuesFilter extends StObject {
  
  /**
    * The name of the filter key.
    */
  var Key: js.UndefOr[DocumentKeyValuesFilterKey] = js.native
  
  /**
    * The value for the filter key.
    */
  var Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.native
}
object DocumentKeyValuesFilter {
  
  @scala.inline
  def apply(): DocumentKeyValuesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentKeyValuesFilter]
  }
  
  @scala.inline
  implicit class DocumentKeyValuesFilterMutableBuilder[Self <: DocumentKeyValuesFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: DocumentKeyValuesFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValues(value: DocumentKeyValuesFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DocumentKeyValuesFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
