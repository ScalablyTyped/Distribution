package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof cytoscape.cytoscape.cytoscape.Css.Overlay ]:? cytoscape.cytoscape.cytoscape.Css.Overlay[P]} */ trait Edge
  extends EdgeLine
     with EdgeArror

object Edge {
  @scala.inline
  def apply(
    `curve-style`: cytoscapeLib.cytoscapeLibStrings.haystack | cytoscapeLib.cytoscapeLibStrings.bezier | cytoscapeLib.cytoscapeLibStrings.unbundled | cytoscapeLib.cytoscapeLibStrings.segments = null,
    `line-color`: Colour = null,
    `line-style`: LineStyle = null,
    `mid-source-arrow-color`: Colour = null,
    `mid-source-arrow-fill`: ArrowFill = null,
    `mid-source-arrow-shape`: ArrowShape = null,
    `mid-target-arrow-color`: Colour = null,
    `mid-target-arrow-fill`: ArrowFill = null,
    `mid-target-arrow-shape`: ArrowShape = null,
    `source-arrow-color`: Colour = null,
    `source-arrow-fill`: ArrowFill = null,
    `source-arrow-shape`: ArrowShape = null,
    `target-arrow-color`: Colour = null,
    `target-arrow-fill`: ArrowFill = null,
    `target-arrow-shape`: ArrowShape = null,
    width: scala.Double | java.lang.String = null
  ): Edge = {
    val __obj = js.Dynamic.literal()
    if (`curve-style` != null) __obj.updateDynamic("curve-style")(`curve-style`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`)
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`)
    if (`mid-source-arrow-color` != null) __obj.updateDynamic("mid-source-arrow-color")(`mid-source-arrow-color`)
    if (`mid-source-arrow-fill` != null) __obj.updateDynamic("mid-source-arrow-fill")(`mid-source-arrow-fill`)
    if (`mid-source-arrow-shape` != null) __obj.updateDynamic("mid-source-arrow-shape")(`mid-source-arrow-shape`)
    if (`mid-target-arrow-color` != null) __obj.updateDynamic("mid-target-arrow-color")(`mid-target-arrow-color`)
    if (`mid-target-arrow-fill` != null) __obj.updateDynamic("mid-target-arrow-fill")(`mid-target-arrow-fill`)
    if (`mid-target-arrow-shape` != null) __obj.updateDynamic("mid-target-arrow-shape")(`mid-target-arrow-shape`)
    if (`source-arrow-color` != null) __obj.updateDynamic("source-arrow-color")(`source-arrow-color`)
    if (`source-arrow-fill` != null) __obj.updateDynamic("source-arrow-fill")(`source-arrow-fill`)
    if (`source-arrow-shape` != null) __obj.updateDynamic("source-arrow-shape")(`source-arrow-shape`)
    if (`target-arrow-color` != null) __obj.updateDynamic("target-arrow-color")(`target-arrow-color`)
    if (`target-arrow-fill` != null) __obj.updateDynamic("target-arrow-fill")(`target-arrow-fill`)
    if (`target-arrow-shape` != null) __obj.updateDynamic("target-arrow-shape")(`target-arrow-shape`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

