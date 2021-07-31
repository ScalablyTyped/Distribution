package typings.babelTypes.ts36Mod

import typings.babelTypes.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceLocation extends StObject {
  
  var end: Column
  
  var start: Column
}
object SourceLocation {
  
  @scala.inline
  def apply(end: Column, start: Column): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
  
  @scala.inline
  implicit class SourceLocationMutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
