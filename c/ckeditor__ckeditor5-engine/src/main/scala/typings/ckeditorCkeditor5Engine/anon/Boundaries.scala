package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typings.ckeditorCkeditor5Engine.mod.model.Position
import typings.ckeditorCkeditor5Engine.mod.model.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundaries extends StObject {
  
  var boundaries: js.UndefOr[Range] = js.undefined
  
  var direction: js.UndefOr[forward | backward] = js.undefined
  
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  
  var shallow: js.UndefOr[Boolean] = js.undefined
  
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  
  var startPosition: Position
}
object Boundaries {
  
  @scala.inline
  def apply(startPosition: Position): Boundaries = {
    val __obj = js.Dynamic.literal(startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
  
  @scala.inline
  implicit class BoundariesMutableBuilder[Self <: Boundaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundaries(value: Range): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
    
    @scala.inline
    def setDirection(value: forward | backward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setIgnoreElementEnd(value: Boolean): Self = StObject.set(x, "ignoreElementEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreElementEndUndefined: Self = StObject.set(x, "ignoreElementEnd", js.undefined)
    
    @scala.inline
    def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    @scala.inline
    def setSingleCharacters(value: Boolean): Self = StObject.set(x, "singleCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleCharactersUndefined: Self = StObject.set(x, "singleCharacters", js.undefined)
    
    @scala.inline
    def setStartPosition(value: Position): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
