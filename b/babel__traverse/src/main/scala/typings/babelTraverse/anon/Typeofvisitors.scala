package typings.babelTraverse.anon

import typings.babelTraverse.mod.VisitNodeFunction
import typings.babelTraverse.mod.Visitor
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvisitors extends StObject {
  
  /**
    * `explode()` will take a `Visitor` object with all of the various shorthands
    * that we support, and validates & normalizes it into a common format, ready
    * to be used in traversal.
    *
    * The various shorthands are:
    * - `Identifier() { ... }` -> `Identifier: { enter() { ... } }`
    * - `"Identifier|NumericLiteral": { ... }` -> `Identifier: { ... }, NumericLiteral: { ... }`
    * - Aliases in `@babel/types`: e.g. `Property: { ... }` -> `ObjectProperty: { ... }, ClassProperty: { ... }`
    *
    * Other normalizations are:
    * - Visitors of virtual types are wrapped, so that they are only visited when their dynamic check passes
    * - `enter` and `exit` functions are wrapped in arrays, to ease merging of visitors
    */
  def explode[S](visitor: Visitor[S]): /* import warning: importer.ImportType#apply Failed type conversion: {[ Type in std.Exclude<@babel/types.@babel/types.Node, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify t.DeprecatedAliases * / any>['type'] ]:? @babel/traverse.@babel/traverse.VisitNodeObject<S, std.Extract<@babel/types.@babel/types.Node, {  type :Type}>>} */ js.Any = js.native
  
  def merge(visitors: js.Array[Visitor[Any]]): Visitor[Any] = js.native
  def merge(visitors: js.Array[Visitor[Any]], states: js.Array[Any]): Visitor[Any] = js.native
  def merge(
    visitors: js.Array[Visitor[Any]],
    states: js.Array[Any],
    wrapper: js.Function3[
      /* stateKey */ Any, 
      /* keyof @babel/traverse.@babel/traverse.Visitor<unknown> */ /* visitorKey */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 316, starting with typings.babelTraverse.babelTraverseStrings.enter, typings.babelTraverse.babelTraverseStrings.exit, typings.babelTraverse.babelTraverseStrings.ClassExpression */ Any, 
      /* func */ VisitNodeFunction[Any, Node], 
      (VisitNodeFunction[Any, Node]) | Null
    ]
  ): Visitor[Any] = js.native
  def merge(
    visitors: js.Array[Visitor[Any]],
    states: Unit,
    wrapper: js.Function3[
      /* stateKey */ Any, 
      /* keyof @babel/traverse.@babel/traverse.Visitor<unknown> */ /* visitorKey */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 316, starting with typings.babelTraverse.babelTraverseStrings.enter, typings.babelTraverse.babelTraverseStrings.exit, typings.babelTraverse.babelTraverseStrings.ClassExpression */ Any, 
      /* func */ VisitNodeFunction[Any, Node], 
      (VisitNodeFunction[Any, Node]) | Null
    ]
  ): Visitor[Any] = js.native
  @JSName("merge")
  def merge_State[State](visitors: js.Array[Visitor[State]]): Visitor[State] = js.native
  
  def verify(visitor: Visitor[Any]): Unit = js.native
}
