package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.RestProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestProperty_
  extends StObject
     with Node
     with UnaryLike {
  
  var argument: LVal
  
  @JSName("type")
  var type_RestProperty_ : RestProperty
}
object RestProperty_ {
  
  @scala.inline
  def apply(argument: LVal, end: Double, loc: SourceLocation, start: Double): RestProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestProperty")
    __obj.asInstanceOf[RestProperty_]
  }
  
  @scala.inline
  implicit class RestProperty_MutableBuilder[Self <: RestProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: LVal): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RestProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
