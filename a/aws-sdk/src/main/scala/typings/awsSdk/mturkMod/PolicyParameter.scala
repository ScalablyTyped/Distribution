package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyParameter extends js.Object {
  
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
  implicit class PolicyParameterOps[Self <: PolicyParameter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setMapEntriesVarargs(value: ParameterMapEntry*): Self = this.set("MapEntries", js.Array(value :_*))
    
    @scala.inline
    def setMapEntries(value: ParameterMapEntryList): Self = this.set("MapEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapEntries: Self = this.set("MapEntries", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: StringList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
