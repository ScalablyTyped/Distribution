package typings.dagreD3.mod.dagreAugmentingMod.graphlib

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// coupled with dagre.d.ts' Graph
// a lot of these methods come from graphlib.core.js
@js.native
trait Graph extends js.Object {
  var height: Double = js.native
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
  ] = js.native
  var width: Double = js.native
  def graph(): Graph = js.native
  def predecessors(id: String): js.Array[String] = js.native
  def successors(id: String): js.Array[String] = js.native
}

object Graph {
  @scala.inline
  def apply(
    graph: () => Graph,
    height: Double,
    predecessors: String => js.Array[String],
    successors: String => js.Array[String],
    width: Double
  ): Graph = {
    val __obj = js.Dynamic.literal(graph = js.Any.fromFunction0(graph), height = height.asInstanceOf[js.Any], predecessors = js.Any.fromFunction1(predecessors), successors = js.Any.fromFunction1(successors), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGraph(value: () => Graph): Self = this.set("graph", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredecessors(value: String => js.Array[String]): Self = this.set("predecessors", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccessors(value: String => js.Array[String]): Self = this.set("successors", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(
      value: /* selection */ Selection_[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
        ] => Transition_[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
        ]
    ): Self = this.set("transition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

