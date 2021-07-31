package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSDeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  var `type`: TSDeclareFunction
}
object `196` {
  
  @scala.inline
  def apply(): `196` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[`196`]
  }
  
  @scala.inline
  implicit class `196MutableBuilder`[Self <: `196`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSDeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
