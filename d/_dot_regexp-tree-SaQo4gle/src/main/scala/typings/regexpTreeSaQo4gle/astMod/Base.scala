package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base[T /* <: AstClass */] extends StObject {
  
  var loc: js.UndefOr[End] = js.undefined
  
  var `type`: T
}
object Base {
  
  inline def apply[T /* <: AstClass */](`type`: T): Base[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[T]]
  }
  
  extension [Self <: Base[?], T /* <: AstClass */](x: Self & Base[T]) {
    
    inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
