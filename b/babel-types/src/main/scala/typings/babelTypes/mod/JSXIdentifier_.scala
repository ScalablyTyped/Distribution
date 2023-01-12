package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXIdentifier_
  extends StObject
     with Node
     with Expression
     with JSX {
  
  var name: String
  
  @JSName("type")
  var type_JSXIdentifier_ : JSXIdentifier
}
object JSXIdentifier_ {
  
  inline def apply(end: Double, loc: SourceLocation, name: String, start: Double): JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[JSXIdentifier_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXIdentifier_] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
