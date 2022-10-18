package typings.deta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesActionMod {
  
  @JSImport("deta/dist/types/types/action", "Action")
  @js.native
  open class Action protected () extends StObject {
    def this(action: ActionTypes) = this()
    def this(action: ActionTypes, value: Any) = this()
    
    val operation: ActionTypes = js.native
    
    val value: Any = js.native
  }
  
  @js.native
  sealed trait ActionTypes extends StObject
  @JSImport("deta/dist/types/types/action", "ActionTypes")
  @js.native
  object ActionTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActionTypes & String] = js.native
    
    @js.native
    sealed trait Append
      extends StObject
         with ActionTypes
    /* "append" */ val Append: typings.deta.distTypesTypesActionMod.ActionTypes.Append & String = js.native
    
    @js.native
    sealed trait Increment
      extends StObject
         with ActionTypes
    /* "increment" */ val Increment: typings.deta.distTypesTypesActionMod.ActionTypes.Increment & String = js.native
    
    @js.native
    sealed trait Prepend
      extends StObject
         with ActionTypes
    /* "prepend" */ val Prepend: typings.deta.distTypesTypesActionMod.ActionTypes.Prepend & String = js.native
    
    @js.native
    sealed trait Set
      extends StObject
         with ActionTypes
    /* "set" */ val Set: typings.deta.distTypesTypesActionMod.ActionTypes.Set & String = js.native
    
    @js.native
    sealed trait Trim
      extends StObject
         with ActionTypes
    /* "trim" */ val Trim: typings.deta.distTypesTypesActionMod.ActionTypes.Trim & String = js.native
  }
}
