package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var `type`: ImportDefaultSpecifier
}
object `18` {
  
  @scala.inline
  def apply(): `18` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
