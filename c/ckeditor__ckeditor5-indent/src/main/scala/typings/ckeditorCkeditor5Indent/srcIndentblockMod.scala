package typings.ckeditorCkeditor5Indent

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentblockMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentblock", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IndentBlock {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @js.native
  trait IndentBlock
    extends StObject
       with Plugin {
    
    /**
      * Setups conversion for using classes.
      */
    /* private */ var _setupConversionUsingClasses: Any = js.native
    
    /**
      * Setups conversion for using offset indents.
      */
    /* private */ var _setupConversionUsingOffset: Any = js.native
    
    /**
      * @inheritDoc
      */
    def afterInit(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
  }
}
