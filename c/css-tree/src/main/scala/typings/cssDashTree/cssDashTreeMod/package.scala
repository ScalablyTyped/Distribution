package typings.cssDashTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssDashTreeMod {
  type EnterOrLeaveFn = js.ThisFunction3[
    /* this */ WalkContext, 
    /* node */ CssNode, 
    /* item */ ListItem[CssNode], 
    /* list */ List[CssNode], 
    Unit
  ]
  type FilterFn[TData, TResult /* <: TData */, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ ListItem[TData], 
    /* list */ List[TData], 
    /* is TResult */ Boolean
  ]
  type IteratorFn[TData, TResult, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ ListItem[TData], 
    /* list */ List[TData], 
    TResult
  ]
}
