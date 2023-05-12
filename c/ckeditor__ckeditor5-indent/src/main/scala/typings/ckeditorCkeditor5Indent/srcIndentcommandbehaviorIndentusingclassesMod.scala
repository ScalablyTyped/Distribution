package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.anon.Classes
import typings.ckeditorCkeditor5Indent.srcIndentcommandbehaviorIndentbehaviorMod.IndentBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentcommandbehaviorIndentusingclassesMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentcommandbehavior/indentusingclasses", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IndentUsingClasses {
    /**
      * Creates an instance of the indentation behavior.
      *
      * @param config.direction The direction of indentation.
      * @param config.classes A list of classes used for indentation.
      */
    def this(config: Classes) = this()
    
    /**
      * Checks if the command should be enabled.
      */
    /* CompleteClass */
    override def checkEnabled(indentAttributeValue: String): Boolean = js.native
    
    /**
      * A list of classes used for indentation.
      */
    /* CompleteClass */
    var classes: js.Array[String] = js.native
    
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
  }
  
  trait IndentUsingClasses
    extends StObject
       with IndentBehavior {
    
    /**
      * A list of classes used for indentation.
      */
    var classes: js.Array[String]
    
    /**
      * The direction of indentation.
      */
    var isForward: Boolean
  }
  object IndentUsingClasses {
    
    inline def apply(
      checkEnabled: String => Boolean,
      classes: js.Array[String],
      getNextIndent: String => js.UndefOr[String],
      isForward: Boolean
    ): IndentUsingClasses = {
      val __obj = js.Dynamic.literal(checkEnabled = js.Any.fromFunction1(checkEnabled), classes = classes.asInstanceOf[js.Any], getNextIndent = js.Any.fromFunction1(getNextIndent), isForward = isForward.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndentUsingClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndentUsingClasses] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setIsForward(value: Boolean): Self = StObject.set(x, "isForward", value.asInstanceOf[js.Any])
    }
  }
}
