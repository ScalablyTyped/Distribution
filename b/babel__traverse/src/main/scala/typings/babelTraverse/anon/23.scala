package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TryStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var `type`: TryStatement
}
object `23` {
  
  @scala.inline
  def apply(): `23` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TryStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
