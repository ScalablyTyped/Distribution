package typings
package cssDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssDashTreeMod {
  type CssNode = AnPlusB | Atrule | AtrulePrelude | AttributeSelector | Block | Brackets | CDC | CDO | ClassSelector | Combinator | Comment | Declaration | DeclarationList | Dimension | FunctionNode | HexColor | IdSelector | Identifier | MediaFeature | MediaQuery | MediaQueryList | Nth | NumberNode | Operator | Parentheses | Percentage | PseudoClassSelector | PseudoElementSelector | Ratio | Raw | Rule | Selector | SelectorList | StringNode | StyleSheet | TypeSelector | UnicodeRange | Url | Value | WhiteSpace
  type CssNodePlain = AnPlusB | AtrulePlain | AtrulePreludePlain | AttributeSelector | BlockPlain | BracketsPlain | CDC | CDO | ClassSelector | Combinator | Comment | DeclarationPlain | DeclarationListPlain | Dimension | FunctionNodePlain | HexColor | IdSelector | Identifier | MediaFeature | MediaQueryPlain | MediaQueryListPlain | NthPlain | NumberNode | Operator | ParenthesesPlain | Percentage | PseudoClassSelectorPlain | PseudoElementSelectorPlain | Ratio | Raw | RulePlain | SelectorPlain | SelectorListPlain | StringNode | StyleSheetPlain | TypeSelector | UnicodeRange | Url | ValuePlain | WhiteSpace
  type EnterOrLeaveFn = js.ThisFunction3[
    /* this */ WalkContext, 
    /* node */ CssNode, 
    /* item */ ListItem[CssNode], 
    /* list */ List[CssNode], 
    scala.Unit
  ]
  type FilterFn[TData, TResult /* <: TData */, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ ListItem[TData], 
    /* list */ List[TData], 
    /* is TResult */scala.Boolean
  ]
  type IteratorFn[TData, TResult, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ ListItem[TData], 
    /* list */ List[TData], 
    TResult
  ]
}
