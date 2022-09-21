package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.rangeMod.default
import typings.ckeditorCkeditor5Engine.treewalkerMod.TreeWalkerDirection
import typings.ckeditorCkeditor5Engine.treewalkerMod.TreeWalkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreElementEnd
  extends StObject
     with TreeWalkerOptions {
  
  var boundaries: default
  
  var direction: js.UndefOr[TreeWalkerDirection] = js.undefined
  
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  
  var shallow: js.UndefOr[Boolean] = js.undefined
  
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  
  var startPosition: js.UndefOr[typings.ckeditorCkeditor5Engine.positionMod.default] = js.undefined
}
object IgnoreElementEnd {
  
  inline def apply(boundaries: default): IgnoreElementEnd = {
    val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreElementEnd]
  }
  
  extension [Self <: IgnoreElementEnd](x: Self) {
    
    inline def setBoundaries(value: default): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: TreeWalkerDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIgnoreElementEnd(value: Boolean): Self = StObject.set(x, "ignoreElementEnd", value.asInstanceOf[js.Any])
    
    inline def setIgnoreElementEndUndefined: Self = StObject.set(x, "ignoreElementEnd", js.undefined)
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    inline def setSingleCharacters(value: Boolean): Self = StObject.set(x, "singleCharacters", value.asInstanceOf[js.Any])
    
    inline def setSingleCharactersUndefined: Self = StObject.set(x, "singleCharacters", js.undefined)
    
    inline def setStartPosition(value: typings.ckeditorCkeditor5Engine.positionMod.default): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
  }
}
