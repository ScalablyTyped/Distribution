package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.model.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreElementEnd extends StObject {
  
  var ignoreElementEnd: Boolean
  
  var shallow: Boolean
  
  var singleCharacters: Boolean
  
  var startPosition: Position
}
object IgnoreElementEnd {
  
  inline def apply(ignoreElementEnd: Boolean, shallow: Boolean, singleCharacters: Boolean, startPosition: Position): IgnoreElementEnd = {
    val __obj = js.Dynamic.literal(ignoreElementEnd = ignoreElementEnd.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], singleCharacters = singleCharacters.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreElementEnd]
  }
  
  extension [Self <: IgnoreElementEnd](x: Self) {
    
    inline def setIgnoreElementEnd(value: Boolean): Self = StObject.set(x, "ignoreElementEnd", value.asInstanceOf[js.Any])
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setSingleCharacters(value: Boolean): Self = StObject.set(x, "singleCharacters", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Position): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
