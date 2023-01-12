package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareTypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `167` extends StObject {
  
  var `type`: DeclareTypeAlias
}
object `167` {
  
  inline def apply(): `167` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[`167`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `167`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareTypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
