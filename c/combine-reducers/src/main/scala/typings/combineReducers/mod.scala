package typings.combineReducers

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("combine-reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A /* <: Action[Any] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, A]]
  
  trait Action[T] extends StObject {
    
    var `type`: T
  }
  object Action {
    
    inline def apply[T](`type`: T): Action[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    extension [Self <: Action[?], T](x: Self & Action[T]) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnyAction
    extends StObject
       with Action[Any]
       with // Allows any extra properties to be defined in an action.
  /* extraProps */ StringDictionary[Any]
  object AnyAction {
    
    inline def apply(`type`: Any): AnyAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyAction]
    }
  }
  
  type Reducer[S, A /* <: Action[Any] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof S ]: combine-reducers.combine-reducers.Reducer<S[K], A>}
    }}}
    */
  @js.native
  trait ReducersMapObject[S, A /* <: Action[Any] */] extends StObject
}
