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
  
  @scala.inline
  def apply(end: Column, source: String, start: Column): CssLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssLocation]
  }
  
  @scala.inline
  implicit class CssLocationMutableBuilder[Self <: CssLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
