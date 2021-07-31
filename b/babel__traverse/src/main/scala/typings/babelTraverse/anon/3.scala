package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var `type`: ExportDefaultSpecifier
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
