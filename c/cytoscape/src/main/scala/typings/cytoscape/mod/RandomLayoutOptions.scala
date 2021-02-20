package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/random
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait RandomLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH] = js.native
  
  // whether to fit to viewport
  var fit: Boolean = js.native
  
  @JSName("name")
  var name_RandomLayoutOptions: random = js.native
  
  // fit padding
  var padding: js.UndefOr[Double] = js.native
}
object RandomLayoutOptions {
  
  @scala.inline
  def apply(fit: Boolean, name: random): RandomLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomLayoutOptions]
  }
  
  @scala.inline
  implicit class RandomLayoutOptionsMutableBuilder[Self <: RandomLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: BoundingBox12 | BoundingBoxWH): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    @scala.inline
    def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: random): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
