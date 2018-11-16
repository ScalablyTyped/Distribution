package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ElementDefinition extends js.Object {
  /**
           * a space separated list of class names that the element has
           */
  var classes: js.UndefOr[java.lang.String] = js.undefined
  /**
           * you should only use `style`/`css` for very special cases; use classes instead
           */
  var css: js.UndefOr[
    cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Node | cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Edge
  ] = js.undefined
  var data: NodeDataDefinition | EdgeDataDefinition
  /**
           * Wether the node can be grabbed and moved by the user
           */
  var grabbable: js.UndefOr[scala.Boolean] = js.undefined
  var group: js.UndefOr[ElementGroup] = js.undefined
  /**
           * When locked a node's position is immutable (default false)
           */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The model position of the node (optional on init, mandatory after)
           */
  var position: js.UndefOr[Position] = js.undefined
  /**
           * can alternatively specify position in rendered on-screen pixels
           */
  var renderedPosition: js.UndefOr[Position] = js.undefined
  /**
           * Scratchpad data (usually temp or nonserialisable data)
           */
  var scatch: js.UndefOr[Scratchpad] = js.undefined
  /**
           * Whether the selection state is mutable (default true)
           */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether the element is selected (default false)
           */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
           *  CssStyleDeclaration;
           */
  var style: js.UndefOr[CssStyleDeclaration] = js.undefined
}

