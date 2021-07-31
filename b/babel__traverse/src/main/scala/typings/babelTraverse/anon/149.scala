package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXNamespacedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  var `type`: JSXNamespacedName
}
object `149` {
  
  @scala.inline
  def apply(): `149` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[`149`]
  }
  
  @scala.inline
  implicit class `149MutableBuilder`[Self <: `149`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
