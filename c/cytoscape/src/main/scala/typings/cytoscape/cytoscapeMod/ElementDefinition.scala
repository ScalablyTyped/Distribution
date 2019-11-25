package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeMod.Css.Edge
import typings.cytoscape.cytoscapeMod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementDefinition extends js.Object {
  /**
    * a space separated list of class names that the element has
    */
  var classes: js.UndefOr[String] = js.undefined
  /**
    * you should only use `style`/`css` for very special cases; use classes instead
    */
  var css: js.UndefOr[Node | Edge] = js.undefined
  var data: NodeDataDefinition | EdgeDataDefinition
  /**
    * Wether the node can be grabbed and moved by the user
    */
  var grabbable: js.UndefOr[Boolean] = js.undefined
  var group: js.UndefOr[ElementGroup] = js.undefined
  /**
    * When locked a node's position is immutable (default false)
    */
  var locked: js.UndefOr[Boolean] = js.undefined
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
  var scratch: js.UndefOr[Scratchpad] = js.undefined
  /**
    * Whether the selection state is mutable (default true)
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the element is selected (default false)
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    *  CssStyleDeclaration;
    */
  var style: js.UndefOr[CssStyleDeclaration] = js.undefined
}

object ElementDefinition {
  @scala.inline
  def apply(
    data: NodeDataDefinition | EdgeDataDefinition,
    classes: String = null,
    css: Node | Edge = null,
    grabbable: js.UndefOr[Boolean] = js.undefined,
    group: ElementGroup = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    position: Position = null,
    renderedPosition: Position = null,
    scratch: Scratchpad = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    style: CssStyleDeclaration = null
  ): ElementDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(grabbable)) __obj.updateDynamic("grabbable")(grabbable.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (renderedPosition != null) __obj.updateDynamic("renderedPosition")(renderedPosition.asInstanceOf[js.Any])
    if (scratch != null) __obj.updateDynamic("scratch")(scratch.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinition]
  }
}

