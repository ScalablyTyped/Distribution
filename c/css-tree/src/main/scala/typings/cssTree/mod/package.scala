package typings.cssTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnterOrLeaveFn[NodeType] = js.ThisFunction3[
    /* this */ typings.cssTree.mod.WalkContext, 
    /* node */ NodeType, 
    /* item */ typings.cssTree.mod.ListItem[typings.cssTree.mod.CssNode], 
    /* list */ typings.cssTree.mod.List[typings.cssTree.mod.CssNode], 
    scala.Unit
  ]
  type FilterFn[TData, TResult /* <: TData */, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ typings.cssTree.mod.ListItem[TData], 
    /* list */ typings.cssTree.mod.List[TData], 
    /* is TResult */ scala.Boolean
  ]
  type FindFn = js.ThisFunction3[
    /* this */ typings.cssTree.mod.WalkContext, 
    /* node */ typings.cssTree.mod.CssNode, 
    /* item */ typings.cssTree.mod.ListItem[typings.cssTree.mod.CssNode], 
    /* list */ typings.cssTree.mod.List[typings.cssTree.mod.CssNode], 
    scala.Boolean
  ]
  type IteratorFn[TData, TResult, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ typings.cssTree.mod.ListItem[TData], 
    /* list */ typings.cssTree.mod.List[TData], 
    TResult
  ]
  type WalkOptions = (typings.cssTree.mod.WalkOptionsVisit[
    typings.cssTree.mod.AnPlusB | typings.cssTree.mod.Atrule | typings.cssTree.mod.AtrulePrelude | typings.cssTree.mod.AttributeSelector | typings.cssTree.mod.Block | typings.cssTree.mod.Brackets | typings.cssTree.mod.CDC | typings.cssTree.mod.CDO | typings.cssTree.mod.ClassSelector | typings.cssTree.mod.Combinator | typings.cssTree.mod.Comment | typings.cssTree.mod.Declaration | typings.cssTree.mod.DeclarationList | typings.cssTree.mod.Dimension | typings.cssTree.mod.FunctionNode | typings.cssTree.mod.HexColor | typings.cssTree.mod.IdSelector | typings.cssTree.mod.Identifier | typings.cssTree.mod.MediaFeature | typings.cssTree.mod.MediaQuery | typings.cssTree.mod.MediaQueryList | typings.cssTree.mod.Nth | typings.cssTree.mod.NumberNode | typings.cssTree.mod.Operator | typings.cssTree.mod.Parentheses | typings.cssTree.mod.Percentage | typings.cssTree.mod.PseudoClassSelector | typings.cssTree.mod.PseudoElementSelector | typings.cssTree.mod.Ratio | typings.cssTree.mod.Raw | typings.cssTree.mod.Rule | typings.cssTree.mod.Selector | typings.cssTree.mod.SelectorList | typings.cssTree.mod.StringNode | typings.cssTree.mod.StyleSheet | typings.cssTree.mod.TypeSelector | typings.cssTree.mod.UnicodeRange | typings.cssTree.mod.Url | typings.cssTree.mod.Value | typings.cssTree.mod.WhiteSpace
  ]) | typings.cssTree.mod.WalkOptionsNoVisit
}
