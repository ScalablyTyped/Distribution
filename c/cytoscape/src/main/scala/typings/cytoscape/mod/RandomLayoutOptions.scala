package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.random
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
  implicit class RandomLayoutOptionsOps[Self <: RandomLayoutOptions] (val x: Self) extends AnyVal {
    
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
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: random): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBox(value: BoundingBox12 | BoundingBoxWH): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("boundingBox", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
}
