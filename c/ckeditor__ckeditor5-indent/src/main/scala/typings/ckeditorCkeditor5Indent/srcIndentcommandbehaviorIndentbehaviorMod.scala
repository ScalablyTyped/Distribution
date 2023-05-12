package typings.ckeditorCkeditor5Indent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentcommandbehaviorIndentbehaviorMod {
  
  trait IndentBehavior extends StObject {
    
    /**
      * Checks if the command should be enabled.
      */
    def checkEnabled(indentAttributeValue: String): Boolean
    
    /**
      * Returns a new indent attribute value based on the current indent.
      * This method returns `undefined` when the indentation should be removed.
      */
    def getNextIndent(indentAttributeValue: String): js.UndefOr[String]
  }
  object IndentBehavior {
    
    inline def apply(checkEnabled: String => Boolean, getNextIndent: String => js.UndefOr[String]): IndentBehavior = {
      val __obj = js.Dynamic.literal(checkEnabled = js.Any.fromFunction1(checkEnabled), getNextIndent = js.Any.fromFunction1(getNextIndent))
      __obj.asInstanceOf[IndentBehavior]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndentBehavior] (val x: Self) extends AnyVal {
      
      inline def setCheckEnabled(value: String => Boolean): Self = StObject.set(x, "checkEnabled", js.Any.fromFunction1(value))
      
      inline def setGetNextIndent(value: String => js.UndefOr[String]): Self = StObject.set(x, "getNextIndent", js.Any.fromFunction1(value))
    }
  }
}
