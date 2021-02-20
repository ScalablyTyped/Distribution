package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModificationState extends StObject {
  
  /**
    * The resource.
    */
  var Resource: js.UndefOr[ModificationResourceEnum] = js.native
  
  /**
    * The modification state.
    */
  var State: js.UndefOr[ModificationStateEnum] = js.native
}
object ModificationState {
  
  @scala.inline
  def apply(): ModificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModificationState]
  }
  
  @scala.inline
  implicit class ModificationStateMutableBuilder[Self <: ModificationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: ModificationResourceEnum): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    @scala.inline
    def setState(value: ModificationStateEnum): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
