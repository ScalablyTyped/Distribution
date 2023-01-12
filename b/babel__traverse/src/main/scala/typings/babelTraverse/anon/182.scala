package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  var `type`: DeclareVariable
}
object `182` {
  
  inline def apply(): `182` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[`182`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `182`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareVariable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
