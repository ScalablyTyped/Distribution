package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NumberTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  var `type`: NumberTypeAnnotation
}
object `159` {
  
  inline def apply(): `159` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[`159`]
  }
  
  extension [Self <: `159`](x: Self) {
    
    inline def setType(value: NumberTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
