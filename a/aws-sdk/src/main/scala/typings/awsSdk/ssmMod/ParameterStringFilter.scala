package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterStringFilter extends js.Object {
  
  /**
    * The name of the filter.  The ParameterStringFilter object is used by the DescribeParameters and GetParametersByPath API actions. However, not all of the pattern values listed for Key can be used with both actions. For DescribeActions, all of the listed patterns are valid, with the exception of Label. For GetParametersByPath, the following patterns listed for Key are not valid: tag, Name, Path, and Tier. For examples of CLI commands demonstrating valid parameter filter constructions, see Searching for Systems Manager parameters in the AWS Systems Manager User Guide. 
    */
  var Key: ParameterStringFilterKey = js.native
  
  /**
    * For all filters used with DescribeParameters, valid options include Equals and BeginsWith. The Name filter additionally supports the Contains option. (Exception: For filters using the key Path, valid options include Recursive and OneLevel.) For filters used with GetParametersByPath, valid options include Equals and BeginsWith. (Exception: For filters using Label as the Key name, the only valid option is Equals.)
    */
  var Option: js.UndefOr[ParameterStringQueryOption] = js.native
  
  /**
    * The value you want to search for.
    */
  var Values: js.UndefOr[ParameterStringFilterValueList] = js.native
}
object ParameterStringFilter {
  
  @scala.inline
  def apply(Key: ParameterStringFilterKey): ParameterStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterStringFilter]
  }
  
  @scala.inline
  implicit class ParameterStringFilterOps[Self <: ParameterStringFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: ParameterStringFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: ParameterStringQueryOption): Self = this.set("Option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("Option", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ParameterStringFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: ParameterStringFilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
