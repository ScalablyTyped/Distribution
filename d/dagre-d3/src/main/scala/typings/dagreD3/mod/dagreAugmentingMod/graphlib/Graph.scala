package typings.dagreD3.mod.dagreAugmentingMod.graphlib

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
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
      /* selection */ Selection_[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
      ], 
      Transition_[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
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
    transition: /* selection */ Selection_[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ] => Transition_[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ] = null
  ): Graph = {
    val __obj = js.Dynamic.literal(graph = js.Any.fromFunction0(graph), height = height.asInstanceOf[js.Any], predecessors = js.Any.fromFunction1(predecessors), successors = js.Any.fromFunction1(successors), width = width.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(js.Any.fromFunction1(transition))
    __obj.asInstanceOf[Graph]
  }
}

