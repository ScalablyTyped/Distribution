package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSLiteralType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var `type`: TSLiteralType
}
object `19` {
  
  @scala.inline
  def apply(): `19` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSLiteralType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
