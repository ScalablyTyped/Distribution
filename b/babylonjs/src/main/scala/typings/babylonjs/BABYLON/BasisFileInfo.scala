package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Levels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Info about the .basis files
  */
trait BasisFileInfo extends StObject {
  
  /**
    * If the file has alpha
    */
  var hasAlpha: Boolean
  
  /**
    * Info about each image of the basis file
    */
  var images: js.Array[Levels]
}
object BasisFileInfo {
  
  inline def apply(hasAlpha: Boolean, images: js.Array[Levels]): BasisFileInfo = {
    val __obj = js.Dynamic.literal(hasAlpha = hasAlpha.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasisFileInfo]
  }
  
  extension [Self <: BasisFileInfo](x: Self) {
    
    inline def setHasAlpha(value: Boolean): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Levels]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Levels*): Self = StObject.set(x, "images", js.Array(value :_*))
  }
}
