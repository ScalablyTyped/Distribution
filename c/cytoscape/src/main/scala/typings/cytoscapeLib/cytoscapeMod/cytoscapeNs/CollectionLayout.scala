package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#collection/layout
     */

trait CollectionLayout extends js.Object {
  def createLayout(options: LayoutOptions): Layouts
  /**
           * Get a new layout, which can be used to algorithmically position the nodes in the collection.
           * This function is useful for running a layout on a subset of the elements in the graph, perhaps in parallel to other layouts.
           *
           * You must specify options.name with the name of the layout you wish to use.
           *
           * Note: that you must call layout.run() in order for it to affect the graph.
           *
           * @param options The layout options.
           */
  def layout(options: LayoutOptions): Layouts
  def makeLayout(options: LayoutOptions): Layouts
}

