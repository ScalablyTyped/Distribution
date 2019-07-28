package typings.atBabelTraverse.atBabelTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ Type in @babel/traverse.@babel/traverse.Node['type'] ]:? @babel/traverse.@babel/traverse.VisitNode<S, std.Extract<@babel/traverse.@babel/traverse.Node, {  type  :Type}>>}
- Dropped {[ K in 'Expression' | 'Binary' | 'Scopable' | 'BlockParent' | 'Block' | 'Statement' | 'Terminatorless' | 'CompletionStatement' | 'Conditional' | 'Loop' | 'While' | 'ExpressionWrapper' | 'For' | 'ForXStatement' | 'Function' | 'FunctionParent' | 'Pureish' | 'Declaration' | 'PatternLike' | 'LVal' | 'TSEntityName' | 'Literal' | 'Immutable' | 'UserWhitespacable' | 'Method' | 'ObjectMember' | 'Property' | 'UnaryLike' | 'Pattern' | 'Class' | 'ModuleDeclaration' | 'ExportDeclaration' | 'ModuleSpecifier' | 'Flow' | 'FlowType' | 'FlowBaseAnnotation' | 'FlowDeclaration' | 'FlowPredicate' | 'JSX' | 'Private' | 'TSTypeElement' | 'TSType' ]:? @babel/traverse.@babel/traverse.VisitNode<S, @babel/types.@babel/types.Aliases[K]>} */ trait TraverseOptions[S] extends VisitNodeObject[S, Node] {
  var noScope: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[Scope] = js.undefined
}

object TraverseOptions {
  @scala.inline
  def apply[S](
    enter: VisitNodeFunction[S, Node] = null,
    exit: VisitNodeFunction[S, Node] = null,
    noScope: js.UndefOr[Boolean] = js.undefined,
    scope: Scope = null
  ): TraverseOptions[S] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (exit != null) __obj.updateDynamic("exit")(exit)
    if (!js.isUndefined(noScope)) __obj.updateDynamic("noScope")(noScope)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[TraverseOptions[S]]
  }
}

