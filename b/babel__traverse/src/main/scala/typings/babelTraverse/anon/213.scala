package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSConstructorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  var `type`: TSConstructorType
}
object `213` {
  
  inline def apply(): `213` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[`213`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `213`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSConstructorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
