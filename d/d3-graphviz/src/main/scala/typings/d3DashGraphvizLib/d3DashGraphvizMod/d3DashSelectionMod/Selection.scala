package typings
package d3DashGraphvizLib.d3DashGraphvizMod.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection[GElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum] extends js.Object {
  /**
           * Returns a new graphviz renderer instance on the first element in the given selection. If a graphviz renderer instance already exists
           * on that element, instead returns the existing graphviz renderer instance.
           * @param options either a GraphvizOptions object representing the options of the graphviz renderer or a boolean representing the
           *                  useWorker option.
           */
  def graphviz(): d3DashGraphvizLib.d3DashGraphvizMod.Graphviz[GElement, Datum, d3DashSelectionLib.d3DashSelectionMod.BaseType, PDatum] = js.native
  /**
           * Returns a new graphviz renderer instance on the first element in the given selection. If a graphviz renderer instance already exists
           * on that element, instead returns the existing graphviz renderer instance.
           * @param options either a GraphvizOptions object representing the options of the graphviz renderer or a boolean representing the
           *                  useWorker option.
           */
  def graphviz(options: d3DashGraphvizLib.d3DashGraphvizMod.GraphvizOptions): d3DashGraphvizLib.d3DashGraphvizMod.Graphviz[GElement, Datum, d3DashSelectionLib.d3DashSelectionMod.BaseType, PDatum] = js.native
  /**
           * Returns a new graphviz renderer instance on the first element in the given selection. If a graphviz renderer instance already exists
           * on that element, instead returns the existing graphviz renderer instance.
           * @param options either a GraphvizOptions object representing the options of the graphviz renderer or a boolean representing the
           *                  useWorker option.
           */
  def graphviz(options: scala.Boolean): d3DashGraphvizLib.d3DashGraphvizMod.Graphviz[GElement, Datum, d3DashSelectionLib.d3DashSelectionMod.BaseType, PDatum] = js.native
  /**
           * For each selected element, selects the first descendant element that matches the specified selector string in the same ways as
           * d3-selection.select, but does not propagate any associated data from the current element to the corresponding selected element.
           */
  def selectWithoutDataPropagation(): Selection[GElement, Datum, PElement, PDatum] = js.native
}

