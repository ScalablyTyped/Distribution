package typings.cssDashTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssDashTreeMod {
  type EnterOrLeaveFn[NodeType] = js.ThisFunction3[
    /* this */ WalkContext, 
    /* node */ NodeType, 
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
  type FindFn = js.ThisFunction3[
    /* this */ WalkContext, 
    /* node */ CssNode, 
    /* item */ ListItem[CssNode], 
    /* list */ List[CssNode], 
    Boolean
  ]
  type IteratorFn[TData, TResult, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ ListItem[TData], 
    /* list */ List[TData], 
    TResult
  ]
  type WalkOptions = (WalkOptionsVisit[
    AnPlusB | Atrule | AtrulePrelude | AttributeSelector | Block | Brackets | CDC | CDO | ClassSelector | Combinator | Comment | Declaration | DeclarationList | Dimension | FunctionNode | HexColor | IdSelector | Identifier | MediaFeature | MediaQuery | MediaQueryList | Nth | NumberNode | Operator | Parentheses | Percentage | PseudoClassSelector | PseudoElementSelector | Ratio | Raw | Rule | Selector | SelectorList | StringNode | StyleSheet | TypeSelector | UnicodeRange | Url | Value | WhiteSpace
  ]) | WalkOptionsNoVisit
}
