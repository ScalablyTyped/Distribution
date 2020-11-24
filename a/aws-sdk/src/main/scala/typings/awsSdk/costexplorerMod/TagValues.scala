package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagValues extends js.Object {
  
  /**
    * The key for the tag.
    */
  var Key: js.UndefOr[TagKey] = js.native
  
  /**
    * The match options that you can use to filter your results. MatchOptions is only applicable for actions related to Cost Category. The default values for MatchOptions are EQUALS and CASE_SENSITIVE.
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.costexplorerMod.MatchOptions] = js.native
  
  /**
    * The specific value of the tag.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.native
}
object TagValues {
  
  @scala.inline
  def apply(): TagValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagValues]
  }
  
  @scala.inline
  implicit class TagValuesOps[Self <: TagValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: TagKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setMatchOptionsVarargs(value: MatchOption*): Self = this.set("MatchOptions", js.Array(value :_*))
    
    @scala.inline
    def setMatchOptions(value: MatchOptions): Self = this.set("MatchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchOptions: Self = this.set("MatchOptions", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: Values): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
