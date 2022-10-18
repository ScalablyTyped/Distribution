package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcViewRangeMod.default
import typings.ckeditorCkeditor5Engine.srcViewTreewalkerMod.TreeWalkerDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundariesDirection extends StObject {
  
  var boundaries: js.UndefOr[default] = js.undefined
  
  var direction: js.UndefOr[TreeWalkerDirection] = js.undefined
  
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  
  var shallow: js.UndefOr[Boolean] = js.undefined
  
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  
  var startPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default
}
object BoundariesDirection {
  
  inline def apply(startPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): BoundariesDirection = {
    val __obj = js.Dynamic.literal(startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundariesDirection]
  }
  
  extension [Self <: BoundariesDirection](x: Self) {
    
    inline def setBoundaries(value: default): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    inline def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
    
    inline def setDirection(value: TreeWalkerDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIgnoreElementEnd(value: Boolean): Self = StObject.set(x, "ignoreElementEnd", value.asInstanceOf[js.Any])
    
    inline def setIgnoreElementEndUndefined: Self = StObject.set(x, "ignoreElementEnd", js.undefined)
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    inline def setSingleCharacters(value: Boolean): Self = StObject.set(x, "singleCharacters", value.asInstanceOf[js.Any])
    
    inline def setSingleCharactersUndefined: Self = StObject.set(x, "singleCharacters", js.undefined)
    
    inline def setStartPosition(value: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
