package typings.cytoscape.mod.Css

import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A padding defines an addition to a node’s dimension.
  * For example, padding-left adds to a node’s outer (i.e. total) width.
  * This can be used to add spacing around the label of width: label; height: label; nodes,
  * or it can be used to add spacing between a compound node parent and its children.
  */
trait PaddingNode extends StObject {
  
  var `padding-bottom`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  
  var `padding-left`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  
  var `padding-right`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  
  var `padding-top`: js.UndefOr[PropertyValueNode[String]] = js.undefined
}
object PaddingNode {
  
  @scala.inline
  def apply(): PaddingNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingNode]
  }
  
  @scala.inline
  implicit class PaddingNodeMutableBuilder[Self <: PaddingNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setPadding-bottom`(value: PropertyValueNode[String]): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-bottomFunction1`(value: NodeSingular => String): Self = StObject.set(x, "padding-bottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
    
    @scala.inline
    def `setPadding-left`(value: PropertyValueNode[String]): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-leftFunction1`(value: NodeSingular => String): Self = StObject.set(x, "padding-left", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
    
    @scala.inline
    def `setPadding-right`(value: PropertyValueNode[String]): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-rightFunction1`(value: NodeSingular => String): Self = StObject.set(x, "padding-right", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    
    @scala.inline
    def `setPadding-top`(value: PropertyValueNode[String]): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-topFunction1`(value: NodeSingular => String): Self = StObject.set(x, "padding-top", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
  }
}
