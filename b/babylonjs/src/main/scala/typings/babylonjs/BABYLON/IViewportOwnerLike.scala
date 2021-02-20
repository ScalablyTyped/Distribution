package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the interface used by objects containing a viewport (like a camera)
  */
@js.native
trait IViewportOwnerLike extends StObject {
  
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
  implicit class IViewportOwnerLikeMutableBuilder[Self <: IViewportOwnerLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewport(value: IViewportLike): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
