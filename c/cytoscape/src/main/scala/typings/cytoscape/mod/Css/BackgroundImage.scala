package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`no-repeat`
import typings.cytoscape.cytoscapeStrings.`repeat-x`
import typings.cytoscape.cytoscapeStrings.`repeat-y`
import typings.cytoscape.cytoscapeStrings.clipped
import typings.cytoscape.cytoscapeStrings.contain
import typings.cytoscape.cytoscapeStrings.cover
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.repeat
import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// export interface ElementCss extends CSSStyleDeclaration { }
/**
  * A background image may be applied to a node’s body:
  *
  * http://js.cytoscape.org/#style/background-image
  */
@js.native
trait BackgroundImage extends js.Object {
  
  /**
    * How background image clipping is handled;
    * may be node for clipped to node shape or none for no clipping.
    */
  var `background-clip`: js.UndefOr[PropertyValueNode[clipped | none]] = js.native
  
  /**
    * How the background image is fit to the node;
    * may be none for original size,
    * contain to fit inside node,
    * or cover to cover the node.
    */
  var `background-fit`: js.UndefOr[PropertyValueNode[none | contain | cover]] = js.native
  
  /**
    * Specifies the height of the image.
    * A percent value (e.g. 50%) may be used to set the image
    * height relative to the node height.
    * If used in combination with background- fit,
    * then this value overrides the height of the image in calculating
    * the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the height of the image.
    */
  var `background-height`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  /**
    * The URL that points to the image that should be used as the node’s background.
    * PNG, JPG, and SVG are supported formats.
    * You may use a data URI to use embedded images,
    * thereby saving a HTTP request.
    */
  var `background-image`: js.UndefOr[PropertyValueNode[String]] = js.native
  
  /**
    * The opacity of the background image. [0 1]
    */
  var `background-image-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  /**
    * The x position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-x`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  /**
    * The y position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-y`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  /**
    * Whether to repeat the background image;
    * may be no-repeat, repeat-x, repeat-y, or repeat.
    */
  var `background-repeat`: js.UndefOr[PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]] = js.native
  
  /**
    * Specifies the width of the image.
    * A percent value (e.g. 50%) may be used to set
    * the image width relative to the node width.
    * If used in combination with background- fit,
    * then this value overrides the width of the image
    * in calculating the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the width of the image.
    */
  var `background-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
}
object BackgroundImage {
  
  @scala.inline
  def apply(): BackgroundImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImage]
  }
  
  @scala.inline
  implicit class BackgroundImageOps[Self <: BackgroundImage] (val x: Self) extends AnyVal {
    
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
    def `setBackground-clipFunction1`(value: NodeSingular => clipped | none): Self = this.set("background-clip", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-clip`(value: PropertyValueNode[clipped | none]): Self = this.set("background-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-clip`: Self = this.set("background-clip", js.undefined)
    
    @scala.inline
    def `setBackground-fitFunction1`(value: NodeSingular => none | contain | cover): Self = this.set("background-fit", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-fit`(value: PropertyValueNode[none | contain | cover]): Self = this.set("background-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-fit`: Self = this.set("background-fit", js.undefined)
    
    @scala.inline
    def `setBackground-heightFunction1`(value: NodeSingular => Double | String): Self = this.set("background-height", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-height`(value: PropertyValueNode[Double | String]): Self = this.set("background-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-height`: Self = this.set("background-height", js.undefined)
    
    @scala.inline
    def `setBackground-imageFunction1`(value: NodeSingular => String): Self = this.set("background-image", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-image`(value: PropertyValueNode[String]): Self = this.set("background-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-image`: Self = this.set("background-image", js.undefined)
    
    @scala.inline
    def `setBackground-image-opacityFunction1`(value: NodeSingular => Double): Self = this.set("background-image-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-image-opacity`(value: PropertyValueNode[Double]): Self = this.set("background-image-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-image-opacity`: Self = this.set("background-image-opacity", js.undefined)
    
    @scala.inline
    def `setBackground-position-xFunction1`(value: NodeSingular => Double | String): Self = this.set("background-position-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-position-x`(value: PropertyValueNode[Double | String]): Self = this.set("background-position-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-position-x`: Self = this.set("background-position-x", js.undefined)
    
    @scala.inline
    def `setBackground-position-yFunction1`(value: NodeSingular => Double | String): Self = this.set("background-position-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-position-y`(value: PropertyValueNode[Double | String]): Self = this.set("background-position-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-position-y`: Self = this.set("background-position-y", js.undefined)
    
    @scala.inline
    def `setBackground-repeatFunction1`(value: NodeSingular => `no-repeat` | `repeat-x` | `repeat-y` | repeat): Self = this.set("background-repeat", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-repeat`(value: PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]): Self = this.set("background-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-repeat`: Self = this.set("background-repeat", js.undefined)
    
    @scala.inline
    def `setBackground-widthFunction1`(value: NodeSingular => Double | String): Self = this.set("background-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-width`(value: PropertyValueNode[Double | String]): Self = this.set("background-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-width`: Self = this.set("background-width", js.undefined)
  }
}
