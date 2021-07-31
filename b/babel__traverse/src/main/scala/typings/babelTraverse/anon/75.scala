package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSDeclareMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75` extends StObject {
  
  var `type`: TSDeclareMethod
}
object `75` {
  
  @scala.inline
  def apply(): `75` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.asInstanceOf[`75`]
  }
  
  @scala.inline
  implicit class `75MutableBuilder`[Self <: `75`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSDeclareMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
