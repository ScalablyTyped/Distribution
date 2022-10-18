package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcViewPositionMod.default
import typings.ckeditorCkeditor5Engine.srcViewTreewalkerMod.TreeWalkerDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPosition extends StObject {
  
  var boundaries: js.UndefOr[typings.ckeditorCkeditor5Engine.srcViewRangeMod.Range] = js.undefined
  
  var direction: js.UndefOr[TreeWalkerDirection] = js.undefined
  
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  
  var shallow: js.UndefOr[Boolean] = js.undefined
  
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  
  var startPosition: default
}
object StartPosition {
  
  inline def apply(startPosition: default): StartPosition = {
    val __obj = js.Dynamic.literal(startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPosition]
  }
  
  extension [Self <: StartPosition](x: Self) {
    
    inline def setBoundaries(value: typings.ckeditorCkeditor5Engine.srcViewRangeMod.Range): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    inline def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
    
    inline def setDirection(value: TreeWalkerDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIgnoreElementEnd(value: Boolean): Self = StObject.set(x, "ignoreElementEnd", value.asInstanceOf[js.Any])
    
    inline def setIgnoreElementEndUndefined: Self = StObject.set(x, "ignoreElementEnd", js.undefined)
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    inline def setSingleCharacters(value: Boolean): Self = StObject.set(x, "singleCharacters", value.asInstanceOf[js.Any])
    
    inline def setSingleCharactersUndefined: Self = StObject.set(x, "singleCharacters", js.undefined)
    
    inline def setStartPosition(value: default): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
