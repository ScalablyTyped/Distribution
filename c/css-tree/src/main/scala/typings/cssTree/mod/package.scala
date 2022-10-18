package typings.cssTree.mod

import typings.cssTree.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def clone_(node: CssNode): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[CssNode]

inline def definitionSyntax: DefinitionSyntax_ = ^.asInstanceOf[js.Dynamic].selectDynamic("definitionSyntax").asInstanceOf[DefinitionSyntax_]

inline def find(ast: CssNode, fn: FindFn): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[CssNode]

inline def findAll(ast: CssNode, fn: FindFn): js.Array[CssNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[CssNode]]

inline def findLast(ast: CssNode, fn: FindFn): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("findLast")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[CssNode]

inline def fromPlainObject(node: CssNodePlain): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[CssNode]

inline def generate(ast: CssNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
inline def generate(ast: CssNode, options: GenerateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def keyword(value: String): Keyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(value.asInstanceOf[js.Any]).asInstanceOf[Keyword_]

inline def parse(text: String): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[CssNode]
inline def parse(text: String, options: ParseOptions): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CssNode]

inline def property(value: String): Property_ = ^.asInstanceOf[js.Dynamic].applyDynamic("property")(value.asInstanceOf[js.Any]).asInstanceOf[Property_]

inline def toPlainObject(node: CssNode): CssNodePlain = ^.asInstanceOf[js.Dynamic].applyDynamic("toPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[CssNodePlain]

inline def walk(ast: CssNode, options: EnterOrLeaveFn[CssNode]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walk(ast: CssNode, options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

type DSWalkEnterOrLeaveFn = js.Function1[/* node */ DSNode, Unit]

type EnterOrLeaveFn[NodeType] = js.ThisFunction3[
/* this */ WalkContext, 
/* node */ NodeType, 
/* item */ ListItem[CssNode], 
/* list */ typings.cssTree.mod.List[CssNode], 
Unit]

type FilterFn[TData, TResult /* <: TData */, TContext] = js.ThisFunction3[
/* this */ TContext, 
/* item */ TData, 
/* node */ ListItem[TData], 
/* list */ typings.cssTree.mod.List[TData], 
/* is TResult */ Boolean]

type FindFn = js.ThisFunction3[
/* this */ WalkContext, 
/* node */ CssNode, 
/* item */ ListItem[CssNode], 
/* list */ typings.cssTree.mod.List[CssNode], 
Boolean]

type IteratorFn[TData, TResult, TContext] = js.ThisFunction3[
/* this */ TContext, 
/* item */ TData, 
/* node */ ListItem[TData], 
/* list */ typings.cssTree.mod.List[TData], 
TResult]

type ReduceFn[TData, TValue, TContext] = js.ThisFunction2[/* this */ TContext, /* accum */ TValue, /* data */ TData, TValue]

type WalkOptions = (WalkOptionsVisit[
AnPlusB | Atrule | AtrulePrelude | AttributeSelector | Block | Brackets | CDC | CDO | ClassSelector | Combinator | Comment | Declaration | DeclarationList | Dimension | FunctionNode | Hash | IdSelector | Identifier | MediaFeature | MediaQuery | MediaQueryList | Nth | NumberNode | Operator | Parentheses | Percentage | PseudoClassSelector | PseudoElementSelector | Ratio | Raw | Rule | Selector | SelectorList | StringNode | StyleSheet | TypeSelector | UnicodeRange | Url_ | Value | WhiteSpace]) | WalkOptionsNoVisit
