package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.Position
import typings.ckeditorCkeditor5Engine.mod.view.Range
import typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shallow extends StObject {
  
  var boundaries: js.UndefOr[Range] = js.native
  
  var direction: js.UndefOr[TreeWalkerDirection] = js.native
  
  var ignoreElementEnd: js.UndefOr[Boolean] = js.native
  
  var shallow: js.UndefOr[Boolean] = js.native
  
  var singleCharacters: js.UndefOr[Boolean] = js.native
  
  var startPosition: js.UndefOr[Position] = js.native
}
object Shallow {
  
  @scala.inline
  def apply(): Shallow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shallow]
  }
  
  @scala.inline
  implicit class ShallowMutableBuilder[Self <: Shallow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundaries(value: Range): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
    
    @scala.inline
    def setDirection(value: TreeWalkerDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
  }
}
