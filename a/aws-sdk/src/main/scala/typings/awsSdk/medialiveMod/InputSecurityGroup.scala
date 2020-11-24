package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSecurityGroup extends js.Object {
  
  /**
    * Unique ARN of Input Security Group
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The Id of the Input Security Group
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The list of inputs currently using this Input Security Group.
    */
  var Inputs: js.UndefOr[listOfString] = js.native
  
  /**
    * The current state of the Input Security Group.
    */
  var State: js.UndefOr[InputSecurityGroupState] = js.native
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  
  /**
    * Whitelist rules and their sync status
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRule] = js.native
}
object InputSecurityGroup {
  
  @scala.inline
  def apply(): InputSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSecurityGroup]
  }
  
  @scala.inline
  implicit class InputSecurityGroupOps[Self <: InputSecurityGroup] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: string*): Self = this.set("Inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: listOfString): Self = this.set("Inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("Inputs", js.undefined)
    
    @scala.inline
    def setState(value: InputSecurityGroupState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setWhitelistRulesVarargs(value: InputWhitelistRule*): Self = this.set("WhitelistRules", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistRules(value: listOfInputWhitelistRule): Self = this.set("WhitelistRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistRules: Self = this.set("WhitelistRules", js.undefined)
  }
}
