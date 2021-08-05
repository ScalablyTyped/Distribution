package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSecurityGroup extends StObject {
  
  /**
    * Unique ARN of Input Security Group
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The Id of the Input Security Group
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The list of inputs currently using this Input Security Group.
    */
  var Inputs: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The current state of the Input Security Group.
    */
  var State: js.UndefOr[InputSecurityGroupState] = js.undefined
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.undefined
  
  /**
    * Whitelist rules and their sync status
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRule] = js.undefined
}
object InputSecurityGroup {
  
  inline def apply(): InputSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSecurityGroup]
  }
  
  extension [Self <: InputSecurityGroup](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInputs(value: listOfString): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    inline def setInputsVarargs(value: string*): Self = StObject.set(x, "Inputs", js.Array(value :_*))
    
    inline def setState(value: InputSecurityGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setWhitelistRules(value: listOfInputWhitelistRule): Self = StObject.set(x, "WhitelistRules", value.asInstanceOf[js.Any])
    
    inline def setWhitelistRulesUndefined: Self = StObject.set(x, "WhitelistRules", js.undefined)
    
    inline def setWhitelistRulesVarargs(value: InputWhitelistRule*): Self = StObject.set(x, "WhitelistRules", js.Array(value :_*))
  }
}
