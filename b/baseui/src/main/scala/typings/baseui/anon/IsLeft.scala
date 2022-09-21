package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLeft extends StObject {
  
  @JSName("$isLeft")
  var $isLeft: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$size")
  var $size: typings.baseui.progressBarTypesMod.Size
}
object IsLeft {
  
  inline def apply($size: typings.baseui.progressBarTypesMod.Size): IsLeft = {
    val __obj = js.Dynamic.literal($size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLeft]
  }
  
  extension [Self <: IsLeft](x: Self) {
    
    inline def set$isLeft(value: Boolean): Self = StObject.set(x, "$isLeft", value.asInstanceOf[js.Any])
    
    inline def set$isLeftUndefined: Self = StObject.set(x, "$isLeft", js.undefined)
    
    inline def set$size(value: typings.baseui.progressBarTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
