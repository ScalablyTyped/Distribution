package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Steps extends StObject {
  
  @JSName("$size")
  var $size: typings.baseui.progressBarTypesMod.Size
  
  @JSName("$steps")
  var $steps: js.UndefOr[Double] = js.undefined
}
object Steps {
  
  inline def apply($size: typings.baseui.progressBarTypesMod.Size): Steps = {
    val __obj = js.Dynamic.literal($size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Steps]
  }
  
  extension [Self <: Steps](x: Self) {
    
    inline def set$size(value: typings.baseui.progressBarTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$steps(value: Double): Self = StObject.set(x, "$steps", value.asInstanceOf[js.Any])
    
    inline def set$stepsUndefined: Self = StObject.set(x, "$steps", js.undefined)
  }
}
