package typings.combineReducers

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("combine-reducers", JSImport.Default)
  @js.native
  def default[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
  @JSImport("combine-reducers", JSImport.Default)
  @js.native
  def default_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  
  @js.native
  trait Action[T] extends StObject {
    
    var `type`: T = js.native
  }
  object Action {
    
    @scala.inline
    def apply[T](`type`: T): Action[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action[_], T] (val x: Self with Action[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnyAction
    extends Action[js.Any]
       with // Allows any extra properties to be defined in an action.
  /* extraProps */ StringDictionary[js.Any]
  object AnyAction {
    
    @scala.inline
    def apply(`type`: js.Any): AnyAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyAction]
    }
  }
  
  type Reducer[S, A /* <: Action[_] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  
  type ReducersMapObject[S, A /* <: Action[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: combine-reducers.combine-reducers.Reducer<S[K], A>}
    */ typings.combineReducers.combineReducersStrings.ReducersMapObject with TopLevel[S]
}
