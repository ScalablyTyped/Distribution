package typings.babylonjs.basisMod

import typings.babylonjs.anon.Levels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Info about the .basis files
  */
@js.native
trait BasisFileInfo extends js.Object {
  
  /**
    * If the file has alpha
    */
  var hasAlpha: Boolean = js.native
  
  /**
    * Info about each image of the basis file
    */
  var images: js.Array[Levels] = js.native
}
object BasisFileInfo {
  
  @scala.inline
  def apply(hasAlpha: Boolean, images: js.Array[Levels]): BasisFileInfo = {
    val __obj = js.Dynamic.literal(hasAlpha = hasAlpha.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasisFileInfo]
  }
  
  @scala.inline
  implicit class BasisFileInfoOps[Self <: BasisFileInfo] (val x: Self) extends AnyVal {
    
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
    def setHasAlpha(value: Boolean): Self = this.set("hasAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Levels*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[Levels]): Self = this.set("images", value.asInstanceOf[js.Any])
  }
}
