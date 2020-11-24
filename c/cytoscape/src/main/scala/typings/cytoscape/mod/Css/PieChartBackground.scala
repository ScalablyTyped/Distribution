package typings.cytoscape.mod.Css

import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties allow you to create pie chart backgrounds on nodes.
  * Note that 16 slices maximum are supported per node,
  * so in the properties 1 <= i <= 16.
  * Of course, you must specify a numerical value for each property in place of i.
  * Each nonzero sized slice is placed in order of i,
  * starting from the 12 o’clock position and working clockwise.
  *
  * You may find it useful to reserve a number to a particular
  * colour for all nodes in your stylesheet.
  * Then you can specify values for pie-i-background-size
  * accordingly for each node via a mapper.
  * This would allow you to create consistently coloured
  * pie charts in each node of the graph based on element data.
  *
  * http://js.cytoscape.org/#style/pie-chart-background
  */
@js.native
trait PieChartBackground extends js.Object {
  
  /**
    * The colour of the node’s ith pie chart slice.
    */
  var `pie-i-background-color`: PropertyValueNode[Colour] = js.native
  
  /**
    * The opacity of the node’s ith pie chart slice.
    */
  var `pie-i-background-opacity`: PropertyValueNode[Double] = js.native
  
  /**
    * The size of the node’s ith pie chart slice, measured in percent (e.g. 25% or 25).
    */
  var `pie-i-background-size`: PropertyValueNode[Double] = js.native
  
  /**
    * The diameter of the pie, measured as a percent of node size (e.g. 100%) or an absolute length (e.g. 25px).
    */
  var `pie-size`: PropertyValueNode[String] = js.native
}
object PieChartBackground {
  
  @scala.inline
  def apply(
    `pie-i-background-color`: PropertyValueNode[Colour],
    `pie-i-background-opacity`: PropertyValueNode[Double],
    `pie-i-background-size`: PropertyValueNode[Double],
    `pie-size`: PropertyValueNode[String]
  ): PieChartBackground = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pie-i-background-color")(`pie-i-background-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("pie-i-background-opacity")(`pie-i-background-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("pie-i-background-size")(`pie-i-background-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("pie-size")(`pie-size`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartBackground]
  }
  
  @scala.inline
  implicit class PieChartBackgroundOps[Self <: PieChartBackground] (val x: Self) extends AnyVal {
    
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
    def `setPie-i-background-colorFunction1`(value: NodeSingular => Colour): Self = this.set("pie-i-background-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-color`(value: PropertyValueNode[Colour]): Self = this.set("pie-i-background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPie-i-background-opacityFunction1`(value: NodeSingular => Double): Self = this.set("pie-i-background-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-opacity`(value: PropertyValueNode[Double]): Self = this.set("pie-i-background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPie-i-background-sizeFunction1`(value: NodeSingular => Double): Self = this.set("pie-i-background-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-size`(value: PropertyValueNode[Double]): Self = this.set("pie-i-background-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPie-sizeFunction1`(value: NodeSingular => String): Self = this.set("pie-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-size`(value: PropertyValueNode[String]): Self = this.set("pie-size", value.asInstanceOf[js.Any])
  }
}
