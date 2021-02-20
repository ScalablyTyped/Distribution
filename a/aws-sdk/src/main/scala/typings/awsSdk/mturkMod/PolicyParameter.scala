package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyParameter extends StObject {
  
  /**
    *  Name of the parameter from the list of Review Polices. 
    */
  var Key: js.UndefOr[String] = js.native
  
  /**
    *  List of ParameterMapEntry objects. 
    */
  var MapEntries: js.UndefOr[ParameterMapEntryList] = js.native
  
  /**
    *  The list of values of the Parameter
    */
  var Values: js.UndefOr[StringList] = js.native
}
object PolicyParameter {
  
  @scala.inline
  def apply(): PolicyParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyParameter]
  }
  
  @scala.inline
  implicit class PolicyParameterMutableBuilder[Self <: PolicyParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setMapEntries(value: ParameterMapEntryList): Self = StObject.set(x, "MapEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapEntriesUndefined: Self = StObject.set(x, "MapEntries", js.undefined)
    
    @scala.inline
    def setMapEntriesVarargs(value: ParameterMapEntry*): Self = StObject.set(x, "MapEntries", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: StringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
