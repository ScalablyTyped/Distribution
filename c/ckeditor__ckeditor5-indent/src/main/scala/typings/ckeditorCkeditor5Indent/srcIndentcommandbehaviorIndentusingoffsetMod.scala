package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.anon.Direction
import typings.ckeditorCkeditor5Indent.srcIndentcommandbehaviorIndentbehaviorMod.IndentBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentcommandbehaviorIndentusingoffsetMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentcommandbehavior/indentusingoffset", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IndentUsingOffset {
    /**
      * Creates an instance of the indentation behavior.
      *
      * @param config.direction The direction of indentation.
      * @param config.offset The offset of the next indentation step.
      * @param config.unit Indentation unit.
      */
    def this(config: Direction) = this()
    
    /**
      * Checks if the command should be enabled.
      */
    /* CompleteClass */
    override def checkEnabled(indentAttributeValue: String): Boolean = js.native
    
    /**
      * Returns a new indent attribute value based on the current indent.
      * This method returns `undefined` when the indentation should be removed.
      */
    /* CompleteClass */
    override def getNextIndent(indentAttributeValue: String): js.UndefOr[String] = js.native
    
    /**
      * The direction of indentation.
      */
    /* CompleteClass */
    var isForward: Boolean = js.native
    
    /**
      * The offset of the next indentation step.
      */
    /* CompleteClass */
    var offset: Double = js.native
    
    /**
      * Indentation unit.
      */
    /* CompleteClass */
    var unit: String = js.native
  }
  
  trait IndentUsingOffset
    extends StObject
       with IndentBehavior {
    
    /**
      * The direction of indentation.
      */
    var isForward: Boolean
    
    /**
      * The offset of the next indentation step.
      */
    var offset: Double
    
    /**
      * Indentation unit.
      */
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
