package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModificationState extends StObject {
  
  /**
    * The resource.
    */
  var Resource: js.UndefOr[ModificationResourceEnum] = js.undefined
  
  /**
    * The modification state.
    */
  var State: js.UndefOr[ModificationStateEnum] = js.undefined
}
object ModificationState {
  
  inline def apply(): ModificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModificationState]
  }
  
  extension [Self <: ModificationState](x: Self) {
    
    inline def setResource(value: ModificationResourceEnum): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setState(value: ModificationStateEnum): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
