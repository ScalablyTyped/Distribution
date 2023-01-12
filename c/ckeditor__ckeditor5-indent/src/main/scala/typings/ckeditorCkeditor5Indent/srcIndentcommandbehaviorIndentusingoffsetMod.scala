package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.anon.Direction
import typings.ckeditorCkeditor5Indent.srcIndentblockcommandMod.IndentBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentcommandbehaviorIndentusingoffsetMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentcommandbehavior/indentusingoffset", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IndentUsingOffset {
    def this(config: Direction) = this()
    
    /* CompleteClass */
    override def checkEnabled(indentAttributeValue: String): Boolean = js.native
    
    /* CompleteClass */
    override def getNextIndent(indentAttributeValue: String): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override val isForward: Boolean = js.native
    
    /* CompleteClass */
    override val offset: Double = js.native
    
    /* CompleteClass */
    var unit: String = js.native
  }
  
  trait IndentUsingOffset
    extends StObject
       with IndentBehavior {
    
    val isForward: Boolean
    
    val offset: Double
    
    var unit: String
  }
  object IndentUsingOffset {
    
    inline def apply(
      checkEnabled: String => Boolean,
      getNextIndent: String => js.UndefOr[String],
      isForward: Boolean,
      offset: Double,
      unit: String
    ): IndentUsingOffset = {
      val __obj = js.Dynamic.literal(checkEnabled = js.Any.fromFunction1(checkEnabled), getNextIndent = js.Any.fromFunction1(getNextIndent), isForward = isForward.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndentUsingOffset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndentUsingOffset] (val x: Self) extends AnyVal {
      
      inline def setIsForward(value: Boolean): Self = StObject.set(x, "isForward", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
}
