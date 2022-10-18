package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.BoundariesDirection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewTreewalkerMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/treewalker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TreeWalker {
    def this(options: BoundariesDirection) = this()
  }
  
  @js.native
  trait TreeWalker
    extends StObject
       with Iterable[TreeWalkerValue] {
    
    val boundaries: typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    val direction: TreeWalkerDirection = js.native
    
    val ignoreElementEnd: Boolean = js.native
    
    def next(): TreeWalkerValue = js.native
    
    val position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    val shallow: Boolean = js.native
    
    val singleCharacters: Boolean = js.native
    
    def skip(skip: js.Function1[/* value */ TreeWalkerValue, Boolean]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
  */
  trait TreeWalkerDirection extends StObject
  object TreeWalkerDirection {
    
    inline def backward: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward = "backward".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward]
    
    inline def forward: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward = "forward".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.anon.ItemLength
    - typings.ckeditorCkeditor5Engine.anon.LengthNextPosition
  */
  trait TreeWalkerValue extends StObject
  object TreeWalkerValue {
    
    inline def ItemLength(
      item: typings.ckeditorCkeditor5Engine.srcViewTextproxyMod.default,
      length: Double,
      nextPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      previousPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): typings.ckeditorCkeditor5Engine.anon.ItemLength = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[typings.ckeditorCkeditor5Engine.anon.ItemLength]
    }
    
    inline def LengthNextPosition(
      item: typings.ckeditorCkeditor5Engine.srcViewElementMod.default,
      length: Double,
      nextPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      previousPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      `type`: elementStart | elementEnd
    ): typings.ckeditorCkeditor5Engine.anon.LengthNextPosition = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ckeditorCkeditor5Engine.anon.LengthNextPosition]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
  */
  trait TreeWalkerValueType extends StObject
  object TreeWalkerValueType {
    
    inline def elementEnd: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd = "elementEnd".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd]
    
    inline def elementStart: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart = "elementStart".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart]
    
    inline def text: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text = "text".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text]
  }
}
