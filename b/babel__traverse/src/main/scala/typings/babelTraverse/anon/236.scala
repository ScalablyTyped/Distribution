package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `236` extends StObject {
  
  var `type`: ImportDeclaration
}
object `236` {
  
  @scala.inline
  def apply(): `236` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[`236`]
  }
  
  @scala.inline
  implicit class `236MutableBuilder`[Self <: `236`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
