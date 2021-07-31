package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def clone_(node: typings.cssTree.mod.CssNode): typings.cssTree.mod.CssNode = typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[typings.cssTree.mod.CssNode]

@scala.inline
def definitionSyntax: typings.cssTree.mod.DefinitionSyntax_ = typings.cssTree.mod.^.asInstanceOf[js.Dynamic].selectDynamic("definitionSyntax").asInstanceOf[typings.cssTree.mod.DefinitionSyntax_]

@scala.inline
def find(ast: typings.cssTree.mod.CssNode, fn: typings.cssTree.mod.FindFn): typings.cssTree.mod.CssNode = (typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.cssTree.mod.CssNode]

@scala.inline
def findAll(ast: typings.cssTree.mod.CssNode, fn: typings.cssTree.mod.FindFn): js.Array[typings.cssTree.mod.CssNode] = (typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cssTree.mod.CssNode]]

@scala.inline
def findLast(ast: typings.cssTree.mod.CssNode, fn: typings.cssTree.mod.FindFn): typings.cssTree.mod.CssNode = (typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findLast")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.cssTree.mod.CssNode]

@scala.inline
def fromPlainObject(node: typings.cssTree.mod.CssNodePlain): typings.cssTree.mod.CssNode = typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fromPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[typings.cssTree.mod.CssNode]

@scala.inline
def generate(ast: typings.cssTree.mod.CssNode): java.lang.String = typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
@scala.inline
def generate(ast: typings.cssTree.mod.CssNode, options: typings.cssTree.mod.GenerateOptions): java.lang.String = (typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def keyword(value: java.lang.String): typings.cssTree.mod.Keyword_ = typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cssTree.mod.Keyword_]

@scala.inline
def parse(text: java.lang.String): typings.cssTree.mod.CssNode = typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.cssTree.mod.CssNode]
@scala.inline
def parse(text: java.lang.String, options: typings.cssTree.mod.ParseOptions): typings.cssTree.mod.CssNode = (typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.cssTree.mod.CssNode]

@scala.inline
def property(value: java.lang.String): typings.cssTree.mod.Property_ = typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("property")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cssTree.mod.Property_]

@scala.inline
def toPlainObject(node: typings.cssTree.mod.CssNode): typings.cssTree.mod.CssNodePlain = typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[typings.cssTree.mod.CssNodePlain]

@scala.inline
def walk(
  ast: typings.cssTree.mod.CssNode,
  options: typings.cssTree.mod.EnterOrLeaveFn[typings.cssTree.mod.CssNode]
): scala.Unit = (typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def walk(ast: typings.cssTree.mod.CssNode, options: typings.cssTree.mod.WalkOptions): scala.Unit = (typings.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

type DSWalkEnterOrLeaveFn = js.Function1[/* node */ typings.cssTree.mod.DSNode, scala.Unit]

type EnterOrLeaveFn[NodeType] = js.ThisFunction3[
/* this */ typings.cssTree.mod.WalkContext, 
/* node */ NodeType, 
/* item */ typings.cssTree.mod.ListItem[typings.cssTree.mod.CssNode], 
/* list */ typings.cssTree.mod.List[typings.cssTree.mod.CssNode], 
scala.Unit]

type FilterFn[TData, TResult /* <: TData */, TContext] = js.ThisFunction3[
/* this */ TContext, 
/* item */ TData, 
/* node */ typings.cssTree.mod.ListItem[TData], 
/* list */ typings.cssTree.mod.List[TData], 
/* is TResult */ scala.Boolean]

type FindFn = js.ThisFunction3[
/* this */ typings.cssTree.mod.WalkContext, 
/* node */ typings.cssTree.mod.CssNode, 
/* item */ typings.cssTree.mod.ListItem[typings.cssTree.mod.CssNode], 
/* list */ typings.cssTree.mod.List[typings.cssTree.mod.CssNode], 
scala.Boolean]

type IteratorFn[TData, TResult, TContext] = js.ThisFunction3[
/* this */ TContext, 
/* item */ TData, 
/* node */ typings.cssTree.mod.ListItem[TData], 
/* list */ typings.cssTree.mod.List[TData], 
TResult]

type WalkOptions = (typings.cssTree.mod.WalkOptionsVisit[
typings.cssTree.mod.AnPlusB | typings.cssTree.mod.Atrule | typings.cssTree.mod.AtrulePrelude | typings.cssTree.mod.AttributeSelector | typings.cssTree.mod.Block | typings.cssTree.mod.Brackets | typings.cssTree.mod.CDC | typings.cssTree.mod.CDO | typings.cssTree.mod.ClassSelector | typings.cssTree.mod.Combinator | typings.cssTree.mod.Comment | typings.cssTree.mod.Declaration | typings.cssTree.mod.DeclarationList | typings.cssTree.mod.Dimension | typings.cssTree.mod.FunctionNode | typings.cssTree.mod.HexColor | typings.cssTree.mod.IdSelector | typings.cssTree.mod.Identifier | typings.cssTree.mod.MediaFeature | typings.cssTree.mod.MediaQuery | typings.cssTree.mod.MediaQueryList | typings.cssTree.mod.Nth | typings.cssTree.mod.NumberNode | typings.cssTree.mod.Operator | typings.cssTree.mod.Parentheses | typings.cssTree.mod.Percentage | typings.cssTree.mod.PseudoClassSelector | typings.cssTree.mod.PseudoElementSelector | typings.cssTree.mod.Ratio | typings.cssTree.mod.Raw | typings.cssTree.mod.Rule | typings.cssTree.mod.Selector | typings.cssTree.mod.SelectorList | typings.cssTree.mod.StringNode | typings.cssTree.mod.StyleSheet | typings.cssTree.mod.TypeSelector | typings.cssTree.mod.UnicodeRange | typings.cssTree.mod.Url | typings.cssTree.mod.Value | typings.cssTree.mod.WhiteSpace]) | typings.cssTree.mod.WalkOptionsNoVisit
