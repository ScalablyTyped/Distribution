package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var `type`: TSMappedType
}
object `125` {
  
  @scala.inline
  def apply(): `125` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[`125`]
  }
  
  @scala.inline
  implicit class `125MutableBuilder`[Self <: `125`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
