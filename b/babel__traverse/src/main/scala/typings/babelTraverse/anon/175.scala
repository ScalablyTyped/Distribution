package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  var `type`: TypeAlias
}
object `175` {
  
  @scala.inline
  def apply(): `175` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[`175`]
  }
  
  @scala.inline
  implicit class `175MutableBuilder`[Self <: `175`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
