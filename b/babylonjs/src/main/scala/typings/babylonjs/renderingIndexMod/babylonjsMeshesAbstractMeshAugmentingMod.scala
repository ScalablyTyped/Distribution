package typings.babylonjs.renderingIndexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesAbstractMeshAugmentingMod {
  
  trait AbstractMesh extends StObject {
    
    /** @internal (Backing field) */
    var _renderOutline: Boolean
    
    /** @internal (Backing field) */
    var _renderOverlay: Boolean
    
    /** @internal (Backing field) */
    var _showBoundingBox: Boolean
    
    /**
      * Gets the edgesRenderer associated with the mesh
      */
    var edgesRenderer: Nullable[typings.babylonjs.renderingEdgesRendererMod.EdgesRenderer]
    
    /**
      * Gets or sets a boolean indicating if the outline must be rendered as well
      * @see https://www.babylonjs-playground.com/#10WJ5S#3
      */
    var renderOutline: Boolean
    
    /**
      * Gets or sets a boolean indicating if the overlay must be rendered as well
      * @see https://www.babylonjs-playground.com/#10WJ5S#2
      */
    var renderOverlay: Boolean
    
    /**
      * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
      */
    var showBoundingBox: Boolean
  }
  object AbstractMesh {
    
    inline def apply(
      _renderOutline: Boolean,
      _renderOverlay: Boolean,
      _showBoundingBox: Boolean,
      renderOutline: Boolean,
      renderOverlay: Boolean,
      showBoundingBox: Boolean
    ): AbstractMesh = {
      val __obj = js.Dynamic.literal(_renderOutline = _renderOutline.asInstanceOf[js.Any], _renderOverlay = _renderOverlay.asInstanceOf[js.Any], _showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], renderOutline = renderOutline.asInstanceOf[js.Any], renderOverlay = renderOverlay.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any], edgesRenderer = null)
      __obj.asInstanceOf[AbstractMesh]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractMesh] (val x: Self) extends AnyVal {
      
      inline def setEdgesRenderer(value: Nullable[typings.babylonjs.renderingEdgesRendererMod.EdgesRenderer]): Self = StObject.set(x, "edgesRenderer", value.asInstanceOf[js.Any])
      
      inline def setEdgesRendererNull: Self = StObject.set(x, "edgesRenderer", null)
      
      inline def setRenderOutline(value: Boolean): Self = StObject.set(x, "renderOutline", value.asInstanceOf[js.Any])
      
      inline def setRenderOverlay(value: Boolean): Self = StObject.set(x, "renderOverlay", value.asInstanceOf[js.Any])
      
      inline def setShowBoundingBox(value: Boolean): Self = StObject.set(x, "showBoundingBox", value.asInstanceOf[js.Any])
      
      inline def set_renderOutline(value: Boolean): Self = StObject.set(x, "_renderOutline", value.asInstanceOf[js.Any])
      
      inline def set_renderOverlay(value: Boolean): Self = StObject.set(x, "_renderOverlay", value.asInstanceOf[js.Any])
      
      inline def set_showBoundingBox(value: Boolean): Self = StObject.set(x, "_showBoundingBox", value.asInstanceOf[js.Any])
    }
  }
}
