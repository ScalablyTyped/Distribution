package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendProjectSessionActionResponse extends StObject {
  
  /**
    * A unique identifier for the action that was performed.
    */
  var ActionId: js.UndefOr[typings.awsSdk.databrewMod.ActionId] = js.undefined
  
  /**
    * The name of the project that was affected by the action.
    */
  var Name: ProjectName
  
  /**
    * A message indicating the result of performing the action.
    */
  var Result: js.UndefOr[typings.awsSdk.databrewMod.Result] = js.undefined
}
object SendProjectSessionActionResponse {
  
  inline def apply(Name: ProjectName): SendProjectSessionActionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendProjectSessionActionResponse]
  }
  
  extension [Self <: SendProjectSessionActionResponse](x: Self) {
    
    inline def setActionId(value: ActionId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "ActionId", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Result): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
