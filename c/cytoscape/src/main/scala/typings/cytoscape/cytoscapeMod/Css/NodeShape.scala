package typings.cytoscape.cytoscapeMod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The shape of the node’s body.
  * Note that each shape fits within the specified width and height,
  * and so you may have to adjust width and height
  * if you desire an equilateral shape
  * (i.e. width !== height for several equilateral shapes).
  * 'polygon' is a custom polygon specified via shape-polygon-points.
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.rectangle
  - typings.cytoscape.cytoscapeStrings.roundrectangle
  - typings.cytoscape.cytoscapeStrings.ellipse
  - typings.cytoscape.cytoscapeStrings.triangle
  - typings.cytoscape.cytoscapeStrings.pentagon
  - typings.cytoscape.cytoscapeStrings.hexagon
  - typings.cytoscape.cytoscapeStrings.heptagon
  - typings.cytoscape.cytoscapeStrings.octagon
  - typings.cytoscape.cytoscapeStrings.star
  - typings.cytoscape.cytoscapeStrings.diamond
  - typings.cytoscape.cytoscapeStrings.vee
  - typings.cytoscape.cytoscapeStrings.rhomboid
  - typings.cytoscape.cytoscapeStrings.polygon
  - typings.cytoscape.cytoscapeStrings.`round-rectangle`
  - typings.cytoscape.cytoscapeStrings.`round-triangle`
  - typings.cytoscape.cytoscapeStrings.`round-diamond`
  - typings.cytoscape.cytoscapeStrings.`round-pentagon`
  - typings.cytoscape.cytoscapeStrings.`round-hexagon`
  - typings.cytoscape.cytoscapeStrings.`round-heptagon`
  - typings.cytoscape.cytoscapeStrings.`round-octagon`
  - typings.cytoscape.cytoscapeStrings.`round-tag`
*/
trait NodeShape extends js.Object

object NodeShape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diamond: typings.cytoscape.cytoscapeStrings.diamond = this.cast("diamond")
  @scala.inline
  def ellipse: typings.cytoscape.cytoscapeStrings.ellipse = this.cast("ellipse")
  @scala.inline
  def heptagon: typings.cytoscape.cytoscapeStrings.heptagon = this.cast("heptagon")
  @scala.inline
  def hexagon: typings.cytoscape.cytoscapeStrings.hexagon = this.cast("hexagon")
  @scala.inline
  def octagon: typings.cytoscape.cytoscapeStrings.octagon = this.cast("octagon")
  @scala.inline
  def pentagon: typings.cytoscape.cytoscapeStrings.pentagon = this.cast("pentagon")
  @scala.inline
  def polygon: typings.cytoscape.cytoscapeStrings.polygon = this.cast("polygon")
  @scala.inline
  def rectangle: typings.cytoscape.cytoscapeStrings.rectangle = this.cast("rectangle")
  @scala.inline
  def rhomboid: typings.cytoscape.cytoscapeStrings.rhomboid = this.cast("rhomboid")
  @scala.inline
  def `round-diamond`: typings.cytoscape.cytoscapeStrings.`round-diamond` = this.cast("round-diamond")
  @scala.inline
  def `round-heptagon`: typings.cytoscape.cytoscapeStrings.`round-heptagon` = this.cast("round-heptagon")
  @scala.inline
  def `round-hexagon`: typings.cytoscape.cytoscapeStrings.`round-hexagon` = this.cast("round-hexagon")
  @scala.inline
  def `round-octagon`: typings.cytoscape.cytoscapeStrings.`round-octagon` = this.cast("round-octagon")
  @scala.inline
  def `round-pentagon`: typings.cytoscape.cytoscapeStrings.`round-pentagon` = this.cast("round-pentagon")
  @scala.inline
  def `round-rectangle`: typings.cytoscape.cytoscapeStrings.`round-rectangle` = this.cast("round-rectangle")
  @scala.inline
  def `round-tag`: typings.cytoscape.cytoscapeStrings.`round-tag` = this.cast("round-tag")
  @scala.inline
  def `round-triangle`: typings.cytoscape.cytoscapeStrings.`round-triangle` = this.cast("round-triangle")
  @scala.inline
  def roundrectangle: typings.cytoscape.cytoscapeStrings.roundrectangle = this.cast("roundrectangle")
  @scala.inline
  def star: typings.cytoscape.cytoscapeStrings.star = this.cast("star")
  @scala.inline
  def triangle: typings.cytoscape.cytoscapeStrings.triangle = this.cast("triangle")
  @scala.inline
  def vee: typings.cytoscape.cytoscapeStrings.vee = this.cast("vee")
}

