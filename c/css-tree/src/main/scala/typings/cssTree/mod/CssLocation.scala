package typings.cssTree.mod

import typings.cssTree.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssLocation extends StObject {
  
  var end: Column
  
  var source: String
  
  var start: Column
}
object CssLocation {
  
  inline def apply(end: Column, source: String, start: Column): CssLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssLocation]
  }
  
  extension [Self <: CssLocation](x: Self) {
    
    inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
