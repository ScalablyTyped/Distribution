package typings.dagreDashD3.dagreDashD3Mod.dagreMod.graphlib

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.d3DashTransition.d3DashTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// coupled with dagre.d.ts' Graph
// a lot of these methods come from graphlib.core.js
trait Graph extends js.Object {
  var height: Double
  // see source of http://cpettitt.github.io/project/dagre-d3/latest/demo/interactive-demo.html
  var transition: js.UndefOr[
    js.Function1[
      /* selection */ Selection[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
      ], 
      Transition[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
      ]
    ]
  ] = js.undefined
  var width: Double
  def graph(): Graph
  def predecessors(id: String): js.Array[String]
  def successors(id: String): js.Array[String]
}

object Graph {
  @scala.inline
  def apply(
    graph: () => Graph,
    height: Double,
    predecessors: String => js.Array[String],
    successors: String => js.Array[String],
    width: Double,
    transition: /* selection */ Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ] => Transition[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ] = null
  ): Graph = {
    val __obj = js.Dynamic.literal(graph = js.Any.fromFunction0(graph), height = height.asInstanceOf[js.Any], predecessors = js.Any.fromFunction1(predecessors), successors = js.Any.fromFunction1(successors), width = width.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(js.Any.fromFunction1(transition))
    __obj.asInstanceOf[Graph]
  }
}

