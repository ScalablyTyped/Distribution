package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.Position
import typings.ckeditorCkeditor5Engine.mod.view.Range
import typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shallow extends StObject {
  
  var boundaries: js.UndefOr[Range] = js.undefined
  
  var direction: js.UndefOr[TreeWalkerDirection] = js.undefined
  
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  
  var shallow: js.UndefOr[Boolean] = js.undefined
  
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  
  var startPosition: js.UndefOr[Position] = js.undefined
}
object Shallow {
  
  inline def apply(): Shallow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shallow]
  }
  
  extension [Self <: Shallow](x: Self) {
    
    inline def setBoundaries(value: Range): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    inline def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
    
    inline def setDirection(value: TreeWalkerDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIgnoreElementEnd(value: Boolean): Self = StObject.set(x, "ignoreElementEnd", value.asInstanceOf[js.Any])
    
    inline def setIgnoreElementEndUndefined: Self = StObject.set(x, "ignoreElementEnd", js.undefined)
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    inline def setSingleCharacters(value: Boolean): Self = StObject.set(x, "singleCharacters", value.asInstanceOf[js.Any])
    
    inline def setSingleCharactersUndefined: Self = StObject.set(x, "singleCharacters", js.undefined)
    
    inline def setStartPosition(value: Position): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
  }
}
