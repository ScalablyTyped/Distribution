package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  var `type`: ObjectTypeProperty
}
object `159` {
  
  inline def apply(): `159` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[`159`]
  }
  
  extension [Self <: `159`](x: Self) {
    
    inline def setType(value: ObjectTypeProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
