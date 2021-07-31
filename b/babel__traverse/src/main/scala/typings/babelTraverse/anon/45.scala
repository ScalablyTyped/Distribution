package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportNamedDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var `type`: ExportNamedDeclaration
}
object `45` {
  
  @scala.inline
  def apply(): `45` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit class `45MutableBuilder`[Self <: `45`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
