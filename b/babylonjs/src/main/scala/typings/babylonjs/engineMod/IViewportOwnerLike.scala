package typings.babylonjs.engineMod

import typings.babylonjs.mathLikeMod.IViewportLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the interface used by objects containing a viewport (like a camera)
  */
trait IViewportOwnerLike extends js.Object {
  /**
    * Gets or sets the viewport
    */
  var viewport: IViewportLike
}

object IViewportOwnerLike {
  @scala.inline
  def apply(viewport: IViewportLike): IViewportOwnerLike = {
    val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IViewportOwnerLike]
  }
}

