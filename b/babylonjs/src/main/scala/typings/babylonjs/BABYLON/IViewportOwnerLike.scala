package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the interface used by objects containing a viewport (like a camera)
  */
@js.native
trait IViewportOwnerLike extends js.Object {
  
  /**
    * Gets or sets the viewport
    */
  var viewport: IViewportLike = js.native
}
object IViewportOwnerLike {
  
  @scala.inline
  def apply(viewport: IViewportLike): IViewportOwnerLike = {
    val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportOwnerLike]
  }
  
  @scala.inline
  implicit class IViewportOwnerLikeOps[Self <: IViewportOwnerLike] (val x: Self) extends AnyVal {
    
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
    def setViewport(value: IViewportLike): Self = this.set("viewport", value.asInstanceOf[js.Any])
  }
}
