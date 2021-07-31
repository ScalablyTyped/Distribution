package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DirectiveLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveLiteral_
  extends StObject
     with Node {
  
  @JSName("type")
  var type_DirectiveLiteral_ : DirectiveLiteral
  
  var value: String
}
object DirectiveLiteral_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, value: String): DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[DirectiveLiteral_]
  }
  
  @scala.inline
  implicit class DirectiveLiteral_MutableBuilder[Self <: DirectiveLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DirectiveLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
