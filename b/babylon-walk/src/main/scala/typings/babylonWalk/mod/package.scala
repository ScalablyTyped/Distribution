package typings.babylonWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AncestorStatelessVisitor = js.Function3[
    /* node */ typings.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[typings.babelTypes.ts36Mod.Node], 
    scala.Unit
  ]
  
  type AncestorVisitor = js.Function3[
    /* node */ typings.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[typings.babelTypes.ts36Mod.Node], 
    scala.Unit
  ]
  
  type NodeTypes = typings.babylonWalk.mod.coreTypes | typings.babylonWalk.mod.es2015Types | typings.babylonWalk.mod.flowTypes | typings.babylonWalk.mod.jsxTypes | typings.babylonWalk.mod.miscTypes
  
  type RecursiveVisitor = js.Function3[
    /* node */ typings.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* next */ js.Function1[/* node */ typings.babelTypes.ts36Mod.Node, scala.Unit], 
    scala.Unit
  ]
  
  type SimpleVisitor = js.Function2[/* node */ typings.babylonWalk.mod.NodeTypes, /* state */ js.Any, scala.Unit]
  
  type Visitor = js.Function2[/* commentBlock */ typings.babylonWalk.mod.NodeTypes, /* state */ js.Any, scala.Unit]
  
  type coreTypes = typings.babelTypes.ts36Mod.ArrayExpression_ | typings.babelTypes.ts36Mod.AssignmentExpression_ | typings.babelTypes.ts36Mod.BinaryExpression_ | typings.babelTypes.ts36Mod.Directive_ | typings.babelTypes.ts36Mod.DirectiveLiteral_ | typings.babelTypes.ts36Mod.BlockStatement_ | typings.babelTypes.ts36Mod.BreakStatement_ | typings.babelTypes.ts36Mod.CallExpression_ | typings.babelTypes.ts36Mod.CatchClause_ | typings.babelTypes.ts36Mod.ConditionalExpression_ | typings.babelTypes.ts36Mod.ContinueStatement_ | typings.babelTypes.ts36Mod.DebuggerStatement_ | typings.babelTypes.ts36Mod.DoWhileStatement_ | typings.babelTypes.ts36Mod.EmptyStatement_ | typings.babelTypes.ts36Mod.ExpressionStatement_ | typings.babelTypes.ts36Mod.File_ | typings.babelTypes.ts36Mod.ForInStatement_ | typings.babelTypes.ts36Mod.ForStatement_ | typings.babelTypes.ts36Mod.FunctionDeclaration_ | typings.babelTypes.ts36Mod.FunctionExpression_ | typings.babelTypes.ts36Mod.Identifier_ | typings.babelTypes.ts36Mod.IfStatement_ | typings.babelTypes.ts36Mod.LabeledStatement_ | typings.babelTypes.ts36Mod.StringLiteral_ | typings.babelTypes.ts36Mod.NumericLiteral_ | typings.babelTypes.ts36Mod.NullLiteral_ | typings.babelTypes.ts36Mod.BooleanLiteral_ | typings.babelTypes.ts36Mod.RegExpLiteral_ | typings.babelTypes.ts36Mod.LogicalExpression_ | typings.babelTypes.ts36Mod.MemberExpression_ | typings.babelTypes.ts36Mod.NewExpression_ | typings.babelTypes.ts36Mod.Program_ | typings.babelTypes.ts36Mod.ObjectExpression_ | typings.babelTypes.ts36Mod.ObjectMethod_ | typings.babelTypes.ts36Mod.ObjectProperty_ | typings.babelTypes.ts36Mod.RestElement_ | typings.babelTypes.ts36Mod.ReturnStatement_ | typings.babelTypes.ts36Mod.SequenceExpression_ | typings.babelTypes.ts36Mod.SwitchCase_ | typings.babelTypes.ts36Mod.SwitchStatement_ | typings.babelTypes.ts36Mod.ThisExpression_ | typings.babelTypes.ts36Mod.ThrowStatement_ | typings.babelTypes.ts36Mod.TryStatement_ | typings.babelTypes.ts36Mod.UnaryExpression_ | typings.babelTypes.ts36Mod.UpdateExpression_ | typings.babelTypes.ts36Mod.VariableDeclaration_ | typings.babelTypes.ts36Mod.VariableDeclarator_ | typings.babelTypes.ts36Mod.WhileStatement_ | typings.babelTypes.ts36Mod.WithStatement_
  
  type es2015Types = typings.babelTypes.ts36Mod.AssignmentPattern_ | typings.babelTypes.ts36Mod.ArrayPattern_ | typings.babelTypes.ts36Mod.ArrowFunctionExpression_ | typings.babelTypes.ts36Mod.ClassBody_ | typings.babelTypes.ts36Mod.ClassDeclaration_ | typings.babelTypes.ts36Mod.ClassExpression_ | typings.babelTypes.ts36Mod.ExportAllDeclaration_ | typings.babelTypes.ts36Mod.ExportDefaultDeclaration_ | typings.babelTypes.ts36Mod.ExportNamedDeclaration_ | typings.babelTypes.ts36Mod.ExportSpecifier_ | typings.babelTypes.ts36Mod.ForOfStatement_ | typings.babelTypes.ts36Mod.ImportDeclaration_ | typings.babelTypes.ts36Mod.ImportDefaultSpecifier_ | typings.babelTypes.ts36Mod.ImportNamespaceSpecifier_ | typings.babelTypes.ts36Mod.ImportSpecifier_ | typings.babelTypes.ts36Mod.MetaProperty_ | typings.babelTypes.ts36Mod.ClassMethod_ | typings.babelTypes.ts36Mod.ObjectPattern_ | typings.babelTypes.ts36Mod.SpreadElement_ | typings.babelTypes.ts36Mod.Super | typings.babelTypes.ts36Mod.TaggedTemplateExpression_ | typings.babelTypes.ts36Mod.TemplateElement_ | typings.babelTypes.ts36Mod.TemplateLiteral_ | typings.babelTypes.ts36Mod.YieldExpression_ | typings.babelTypes.ts36Mod.AwaitExpression_ | typings.babelTypes.ts36Mod.BindExpression_ | typings.babelTypes.ts36Mod.ClassProperty_ | typings.babelTypes.ts36Mod.Decorator_ | typings.babelTypes.ts36Mod.DoExpression_ | typings.babelTypes.ts36Mod.ExportDefaultSpecifier_ | typings.babelTypes.ts36Mod.ExportNamespaceSpecifier_
  
  type flowTypes = typings.babelTypes.ts36Mod.AnyTypeAnnotation_ | typings.babelTypes.ts36Mod.ArrayTypeAnnotation_ | typings.babelTypes.ts36Mod.BooleanTypeAnnotation_ | typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_ | typings.babelTypes.ts36Mod.NullLiteralTypeAnnotation_ | typings.babelTypes.ts36Mod.ClassImplements_ | typings.babelTypes.ts36Mod.DeclareClass_ | typings.babelTypes.ts36Mod.DeclareFunction_ | typings.babelTypes.ts36Mod.DeclareInterface_ | typings.babelTypes.ts36Mod.DeclareModule_ | typings.babelTypes.ts36Mod.DeclareTypeAlias_ | typings.babelTypes.ts36Mod.DeclareVariable_ | typings.babelTypes.ts36Mod.FunctionTypeAnnotation_ | typings.babelTypes.ts36Mod.FunctionTypeParam_ | typings.babelTypes.ts36Mod.GenericTypeAnnotation_ | typings.babelTypes.ts36Mod.InterfaceExtends_ | typings.babelTypes.ts36Mod.InterfaceDeclaration_ | typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_ | typings.babelTypes.ts36Mod.MixedTypeAnnotation_ | typings.babelTypes.ts36Mod.NullableTypeAnnotation_ | typings.babelTypes.ts36Mod.NumberTypeAnnotation_ | typings.babelTypes.ts36Mod.ObjectTypeAnnotation_ | typings.babelTypes.ts36Mod.ObjectTypeCallProperty_ | typings.babelTypes.ts36Mod.ObjectTypeIndexer_ | typings.babelTypes.ts36Mod.ObjectTypeProperty_ | typings.babelTypes.ts36Mod.QualifiedTypeIdentifier_ | typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_ | typings.babelTypes.ts36Mod.StringTypeAnnotation_ | typings.babelTypes.ts36Mod.ThisTypeAnnotation_ | typings.babelTypes.ts36Mod.TupleTypeAnnotation_ | typings.babelTypes.ts36Mod.TypeofTypeAnnotation_ | typings.babelTypes.ts36Mod.TypeAlias_ | typings.babelTypes.ts36Mod.TypeAnnotation_ | typings.babelTypes.ts36Mod.TypeCastExpression_ | typings.babelTypes.ts36Mod.TypeParameterDeclaration_ | typings.babelTypes.ts36Mod.TypeParameterInstantiation_ | typings.babelTypes.ts36Mod.UnionTypeAnnotation_ | typings.babelTypes.ts36Mod.VoidTypeAnnotation_
  
  type jsxTypes = typings.babelTypes.ts36Mod.JSXAttribute_ | typings.babelTypes.ts36Mod.JSXClosingElement_ | typings.babelTypes.ts36Mod.JSXElement_ | typings.babelTypes.ts36Mod.JSXEmptyExpression_ | typings.babelTypes.ts36Mod.JSXExpressionContainer_ | typings.babelTypes.ts36Mod.JSXIdentifier_ | typings.babelTypes.ts36Mod.JSXMemberExpression_ | typings.babelTypes.ts36Mod.JSXNamespacedName_ | typings.babelTypes.ts36Mod.JSXOpeningElement_ | typings.babelTypes.ts36Mod.JSXSpreadAttribute_ | typings.babelTypes.ts36Mod.JSXText_
  
  type miscTypes = typings.babelTypes.ts36Mod.Noop_ | typings.babelTypes.ts36Mod.ParenthesizedExpression_
}
