package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.anon.Classes
import typings.ckeditorCkeditor5Indent.srcIndentblockcommandMod.IndentBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentcommandbehaviorIndentusingclassesMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentcommandbehavior/indentusingclasses", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IndentUsingClasses {
    def this(config: Classes) = this()
    
    /* CompleteClass */
    override def checkEnabled(indentAttributeValue: String): Boolean = js.native
    
    /* CompleteClass */
    override val classes: js.Array[String] = js.native
    
    /* CompleteClass */
    override def getNextIndent(indentAttributeValue: String): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override val isForward: Boolean = js.native
  }
  
  trait IndentUsingClasses
    extends StObject
       with IndentBehavior {
    
    val classes: js.Array[String]
    
    val isForward: Boolean
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
    
    extension [Self <: IndentUsingClasses](x: Self) {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setIsForward(value: Boolean): Self = StObject.set(x, "isForward", value.asInstanceOf[js.Any])
    }
  }
}
