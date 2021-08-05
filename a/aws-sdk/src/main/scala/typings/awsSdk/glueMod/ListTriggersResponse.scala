package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTriggersResponse extends StObject {
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The names of all triggers in the account, or the triggers with the specified tags.
    */
  var TriggerNames: js.UndefOr[TriggerNameList] = js.undefined
}
object ListTriggersResponse {
  
  inline def apply(): ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTriggersResponse]
  }
  
  extension [Self <: ListTriggersResponse](x: Self) {
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTriggerNames(value: TriggerNameList): Self = StObject.set(x, "TriggerNames", value.asInstanceOf[js.Any])
    
    inline def setTriggerNamesUndefined: Self = StObject.set(x, "TriggerNames", js.undefined)
    
    inline def setTriggerNamesVarargs(value: NameString*): Self = StObject.set(x, "TriggerNames", js.Array(value :_*))
  }
}
