package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/random
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait RandomLayoutOptions
  extends StObject
     with BaseLayoutOptions
     with AnimatedLayoutOptions {
  
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH] = js.undefined
  
  // whether to fit to viewport
  var fit: js.UndefOr[Boolean] = js.undefined
  
  @JSName("name")
  var name_RandomLayoutOptions: random
  
  // fit padding
  var padding: js.UndefOr[Double] = js.undefined
}
object RandomLayoutOptions {
  
  inline def apply(): RandomLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "random")
    __obj.asInstanceOf[RandomLayoutOptions]
  }
  
  extension [Self <: RandomLayoutOptions](x: Self) {
    
    inline def setBoundingBox(value: BoundingBox12 | BoundingBoxWH): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setName(value: random): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
