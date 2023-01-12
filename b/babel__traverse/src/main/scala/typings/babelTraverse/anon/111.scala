package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.StaticBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var `type`: StaticBlock
}
object `111` {
  
  inline def apply(): `111` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `111`] (val x: Self) extends AnyVal {
    
    inline def setType(value: StaticBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
