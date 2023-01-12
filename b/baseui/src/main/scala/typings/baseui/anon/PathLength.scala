package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathLength extends StObject {
  
  @JSName("$pathLength")
  var $pathLength: Double
  
  @JSName("$pathProgress")
  var $pathProgress: Double
  
  @JSName("$size")
  var $size: typings.baseui.progressBarTypesMod.Size
  
  @JSName("$visible")
  var $visible: Boolean
}
object PathLength {
  
  inline def apply(
    $pathLength: Double,
    $pathProgress: Double,
    $size: typings.baseui.progressBarTypesMod.Size,
    $visible: Boolean
  ): PathLength = {
    val __obj = js.Dynamic.literal($pathLength = $pathLength.asInstanceOf[js.Any], $pathProgress = $pathProgress.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $visible = $visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathLength] (val x: Self) extends AnyVal {
    
    inline def set$pathLength(value: Double): Self = StObject.set(x, "$pathLength", value.asInstanceOf[js.Any])
    
    inline def set$pathProgress(value: Double): Self = StObject.set(x, "$pathProgress", value.asInstanceOf[js.Any])
    
    inline def set$size(value: typings.baseui.progressBarTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$visible(value: Boolean): Self = StObject.set(x, "$visible", value.asInstanceOf[js.Any])
  }
}
