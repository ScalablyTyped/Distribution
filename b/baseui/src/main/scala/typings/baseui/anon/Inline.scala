package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inline extends StObject {
  
  @JSName("$inline")
  var $inline: Boolean
  
  @JSName("$size")
  var $size: typings.baseui.progressBarTypesMod.Size
}
object Inline {
  
  inline def apply($inline: Boolean, $size: typings.baseui.progressBarTypesMod.Size): Inline = {
    val __obj = js.Dynamic.literal($inline = $inline.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inline] (val x: Self) extends AnyVal {
    
    inline def set$inline(value: Boolean): Self = StObject.set(x, "$inline", value.asInstanceOf[js.Any])
    
    inline def set$size(value: typings.baseui.progressBarTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
