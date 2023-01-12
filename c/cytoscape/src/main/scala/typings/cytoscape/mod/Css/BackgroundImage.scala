package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`include-padding`
import typings.cytoscape.cytoscapeStrings.`no-repeat`
import typings.cytoscape.cytoscapeStrings.`repeat-x`
import typings.cytoscape.cytoscapeStrings.`repeat-y`
import typings.cytoscape.cytoscapeStrings.`use-credentials`
import typings.cytoscape.cytoscapeStrings.anonymous
import typings.cytoscape.cytoscapeStrings.clipped
import typings.cytoscape.cytoscapeStrings.contain
import typings.cytoscape.cytoscapeStrings.cover
import typings.cytoscape.cytoscapeStrings.inner
import typings.cytoscape.cytoscapeStrings.inside
import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.over
import typings.cytoscape.cytoscapeStrings.repeat
import typings.cytoscape.cytoscapeStrings.yes
import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// export interface ElementCss extends CSSStyleDeclaration { }
/**
  * A background image may be applied to a node’s body:
  *
  * http://js.cytoscape.org/#style/background-image
  */
trait BackgroundImage extends StObject {
  
  /**
    * How background image clipping is handled;
    * may be node for clipped to node shape or none for no clipping.
    */
  var `background-clip`: js.UndefOr[PropertyValueNode[clipped | none]] = js.undefined
  
  /**
    * How the background image is fit to the node;
    * may be none for original size,
    * contain to fit inside node,
    * or cover to cover the node.
    */
  var `background-fit`: js.UndefOr[PropertyValueNode[none | contain | cover]] = js.undefined
  
  /**
    * Specifies the height of the image.
    * A percent value (e.g. 50%) may be used to set the image
    * height relative to the node height.
    * If used in combination with background- fit,
    * then this value overrides the height of the image in calculating
    * the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the height of the image.
    */
  var `background-height`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  
  /**
    * Changes whether the height is calculated relative to the height of the node or
    * the height in addition to the padding; may be `inner` or `include-padding`.
    *
    * If not specified, `include-padding` is used by default.
    */
  var `background-height-relative-to`: js.UndefOr[PropertyValueNode[inner | `include-padding`]] = js.undefined
  
  /**
    * The URL that points to the image that should be used as the node’s background.
    * PNG, JPG, and SVG are supported formats.
    * You may use a data URI to use embedded images,
    * thereby saving a HTTP request.
    */
  var `background-image`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  
  /**
    * Determines whether background image is within (`inside`)
    * or over top of the node (`over`).
    *
    * The default is set to `inside`.
    */
  var `background-image-containment`: js.UndefOr[PropertyValueNode[inside | over]] = js.undefined
  
  /**
    * All images are loaded with a crossorigin attribute which may be `anonymous` or
    * `use-credentials`.
    *
    * The default is set to `anonymous`.
    */
  var `background-image-crossorigin`: js.UndefOr[PropertyValueNode[anonymous | `use-credentials`]] = js.undefined
  
  /**
    * The opacity of the background image. [0 1]
    */
  var `background-image-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  
  /**
    * Determines whether background image is smoothed (`yes`, default) or not (`no`).
    * This is only a hint, and the browser may or may not respect the
    * value set for this property.
    */
  var `background-image-smoothing`: js.UndefOr[PropertyValueNode[yes | no]] = js.undefined
  
  /**
    * The x offset of the background image,
    * measured in percent(e.g. `'50%'`) or pixels (e.g. `'10px'`).
    */
  var `background-offset-x`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  
  /**
    * The y offset of the background image,
    * measured in percent(e.g. `'50%'`) or pixels (e.g. `'10px'`).
    */
  var `background-offset-y`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  
  /**
    * The x position of the background image,
    * measured in percent(e.g. `'50%'`) or pixels (e.g. `'10px'`).
    */
  var `background-position-x`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  
  /**
    * The y position of the background image,
    * measured in percent(e.g. `'50%'`) or pixels (e.g. `'10px'`).
    */
  var `background-position-y`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  
  /**
    * Whether to repeat the background image;
    * may be no-repeat, repeat-x, repeat-y, or repeat.
    */
  var `background-repeat`: js.UndefOr[PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]] = js.undefined
  
  /**
    * Specifies the width of the image.
    * A percent value (e.g. 50%) may be used to set
    * the image width relative to the node width.
    * If used in combination with background- fit,
    * then this value overrides the width of the image
    * in calculating the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the width of the image.
    */
  var `background-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  
  /**
    * Changes whether the width is calculated relative to the width of the node or
    * the width in addition to the padding; may be inner or include-padding.
    *
    * If not specified, include-padding is used by default.
    */
  var `background-width-relative-to`: js.UndefOr[PropertyValueNode[inner | `include-padding`]] = js.undefined
  
  /**
    * Specifies a padding size (e.g. 20) that expands the bounding box of the node in
    * all directions. This allows for images to be drawn outside of the normal bounding
    * box of the node when `background-clip` is none. This is useful for small decorations
    * just outside of the node.
    *
    * `bounds-expansions` accepts 1 value (for all directions),
    * 2 values, ([topAndBottom, leftAndRight]) or 4 values ([top, right, bottom, left]).
    */
  var `bounds-expansion`: js.UndefOr[
    PropertyValueNode[
      Double | String | (js.Tuple2[Double | String, Double | String]) | (js.Tuple4[Double | String, Double | String, Double | String, Double | String])
    ]
  ] = js.undefined
}
object BackgroundImage {
  
  inline def apply(): BackgroundImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImage] (val x: Self) extends AnyVal {
    
    inline def `setBackground-clip`(value: PropertyValueNode[clipped | none]): Self = StObject.set(x, "background-clip", value.asInstanceOf[js.Any])
    
    inline def `setBackground-clipFunction1`(value: NodeSingular => clipped | none): Self = StObject.set(x, "background-clip", js.Any.fromFunction1(value))
    
    inline def `setBackground-clipUndefined`: Self = StObject.set(x, "background-clip", js.undefined)
    
    inline def `setBackground-fit`(value: PropertyValueNode[none | contain | cover]): Self = StObject.set(x, "background-fit", value.asInstanceOf[js.Any])
    
    inline def `setBackground-fitFunction1`(value: NodeSingular => none | contain | cover): Self = StObject.set(x, "background-fit", js.Any.fromFunction1(value))
    
    inline def `setBackground-fitUndefined`: Self = StObject.set(x, "background-fit", js.undefined)
    
    inline def `setBackground-height`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-height", value.asInstanceOf[js.Any])
    
    inline def `setBackground-height-relative-to`(value: PropertyValueNode[inner | `include-padding`]): Self = StObject.set(x, "background-height-relative-to", value.asInstanceOf[js.Any])
    
    inline def `setBackground-height-relative-toFunction1`(value: NodeSingular => inner | `include-padding`): Self = StObject.set(x, "background-height-relative-to", js.Any.fromFunction1(value))
    
    inline def `setBackground-height-relative-toUndefined`: Self = StObject.set(x, "background-height-relative-to", js.undefined)
    
    inline def `setBackground-heightFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-height", js.Any.fromFunction1(value))
    
    inline def `setBackground-heightUndefined`: Self = StObject.set(x, "background-height", js.undefined)
    
    inline def `setBackground-image`(value: PropertyValueNode[String]): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    inline def `setBackground-image-containment`(value: PropertyValueNode[inside | over]): Self = StObject.set(x, "background-image-containment", value.asInstanceOf[js.Any])
    
    inline def `setBackground-image-containmentFunction1`(value: NodeSingular => inside | over): Self = StObject.set(x, "background-image-containment", js.Any.fromFunction1(value))
    
    inline def `setBackground-image-containmentUndefined`: Self = StObject.set(x, "background-image-containment", js.undefined)
    
    inline def `setBackground-image-crossorigin`(value: PropertyValueNode[anonymous | `use-credentials`]): Self = StObject.set(x, "background-image-crossorigin", value.asInstanceOf[js.Any])
    
    inline def `setBackground-image-crossoriginFunction1`(value: NodeSingular => anonymous | `use-credentials`): Self = StObject.set(x, "background-image-crossorigin", js.Any.fromFunction1(value))
    
    inline def `setBackground-image-crossoriginUndefined`: Self = StObject.set(x, "background-image-crossorigin", js.undefined)
    
    inline def `setBackground-image-opacity`(value: PropertyValueNode[Double]): Self = StObject.set(x, "background-image-opacity", value.asInstanceOf[js.Any])
    
    inline def `setBackground-image-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "background-image-opacity", js.Any.fromFunction1(value))
    
    inline def `setBackground-image-opacityUndefined`: Self = StObject.set(x, "background-image-opacity", js.undefined)
    
    inline def `setBackground-image-smoothing`(value: PropertyValueNode[yes | no]): Self = StObject.set(x, "background-image-smoothing", value.asInstanceOf[js.Any])
    
    inline def `setBackground-image-smoothingFunction1`(value: NodeSingular => yes | no): Self = StObject.set(x, "background-image-smoothing", js.Any.fromFunction1(value))
    
    inline def `setBackground-image-smoothingUndefined`: Self = StObject.set(x, "background-image-smoothing", js.undefined)
    
    inline def `setBackground-imageFunction1`(value: NodeSingular => String): Self = StObject.set(x, "background-image", js.Any.fromFunction1(value))
    
    inline def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    inline def `setBackground-offset-x`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-offset-x", value.asInstanceOf[js.Any])
    
    inline def `setBackground-offset-xFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-offset-x", js.Any.fromFunction1(value))
    
    inline def `setBackground-offset-xUndefined`: Self = StObject.set(x, "background-offset-x", js.undefined)
    
    inline def `setBackground-offset-y`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-offset-y", value.asInstanceOf[js.Any])
    
    inline def `setBackground-offset-yFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-offset-y", js.Any.fromFunction1(value))
    
    inline def `setBackground-offset-yUndefined`: Self = StObject.set(x, "background-offset-y", js.undefined)
    
    inline def `setBackground-position-x`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-position-x", value.asInstanceOf[js.Any])
    
    inline def `setBackground-position-xFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-position-x", js.Any.fromFunction1(value))
    
    inline def `setBackground-position-xUndefined`: Self = StObject.set(x, "background-position-x", js.undefined)
    
    inline def `setBackground-position-y`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-position-y", value.asInstanceOf[js.Any])
    
    inline def `setBackground-position-yFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-position-y", js.Any.fromFunction1(value))
    
    inline def `setBackground-position-yUndefined`: Self = StObject.set(x, "background-position-y", js.undefined)
    
    inline def `setBackground-repeat`(value: PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    inline def `setBackground-repeatFunction1`(value: NodeSingular => `no-repeat` | `repeat-x` | `repeat-y` | repeat): Self = StObject.set(x, "background-repeat", js.Any.fromFunction1(value))
    
    inline def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    inline def `setBackground-width`(value: PropertyValueNode[Double | String]): Self = StObject.set(x, "background-width", value.asInstanceOf[js.Any])
    
    inline def `setBackground-width-relative-to`(value: PropertyValueNode[inner | `include-padding`]): Self = StObject.set(x, "background-width-relative-to", value.asInstanceOf[js.Any])
    
    inline def `setBackground-width-relative-toFunction1`(value: NodeSingular => inner | `include-padding`): Self = StObject.set(x, "background-width-relative-to", js.Any.fromFunction1(value))
    
    inline def `setBackground-width-relative-toUndefined`: Self = StObject.set(x, "background-width-relative-to", js.undefined)
    
    inline def `setBackground-widthFunction1`(value: NodeSingular => Double | String): Self = StObject.set(x, "background-width", js.Any.fromFunction1(value))
    
    inline def `setBackground-widthUndefined`: Self = StObject.set(x, "background-width", js.undefined)
    
    inline def `setBounds-expansion`(
      value: PropertyValueNode[
          Double | String | (js.Tuple2[Double | String, Double | String]) | (js.Tuple4[Double | String, Double | String, Double | String, Double | String])
        ]
    ): Self = StObject.set(x, "bounds-expansion", value.asInstanceOf[js.Any])
    
    inline def `setBounds-expansionFunction1`(
      value: NodeSingular => Double | String | (js.Tuple2[Double | String, Double | String]) | (js.Tuple4[Double | String, Double | String, Double | String, Double | String])
    ): Self = StObject.set(x, "bounds-expansion", js.Any.fromFunction1(value))
    
    inline def `setBounds-expansionUndefined`: Self = StObject.set(x, "bounds-expansion", js.undefined)
  }
}
