package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `254` extends StObject {
  
  @JSName("$size")
  var $size: typings.baseui.progressBarTypesMod.Size
}
object `254` {
  
  inline def apply($size: typings.baseui.progressBarTypesMod.Size): `254` = {
    val __obj = js.Dynamic.literal($size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[`254`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `254`] (val x: Self) extends AnyVal {
    
    inline def set$size(value: typings.baseui.progressBarTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
