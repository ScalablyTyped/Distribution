package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.mod.IndentBlockCommand
import typings.ckeditorCkeditor5Indent.srcIndentconfigMod.IndentBlockConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditor5CoreMod {
  
  trait CommandsMap extends StObject {
    
    var indentBlock: IndentBlockCommand
    
    var outdentBlock: IndentBlockCommand
  }
  object CommandsMap {
    
    inline def apply(indentBlock: IndentBlockCommand, outdentBlock: IndentBlockCommand): CommandsMap = {
      val __obj = js.Dynamic.literal(indentBlock = indentBlock.asInstanceOf[js.Any], outdentBlock = outdentBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandsMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandsMap] (val x: Self) extends AnyVal {
      
      inline def setIndentBlock(value: IndentBlockCommand): Self = StObject.set(x, "indentBlock", value.asInstanceOf[js.Any])
      
      inline def setOutdentBlock(value: IndentBlockCommand): Self = StObject.set(x, "outdentBlock", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditorConfig extends StObject {
    
    /**
      * The configuration of the {@link module:indent/indentblock~IndentBlock block indentation feature}.
      *
      * Read more in {@link module:indent/indentconfig~IndentBlockConfig}.
      */
    var indentBlock: js.UndefOr[IndentBlockConfig] = js.undefined
  }
  object EditorConfig {
    
    inline def apply(): EditorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorConfig] (val x: Self) extends AnyVal {
      
      inline def setIndentBlock(value: IndentBlockConfig): Self = StObject.set(x, "indentBlock", value.asInstanceOf[js.Any])
      
      inline def setIndentBlockUndefined: Self = StObject.set(x, "indentBlock", js.undefined)
    }
  }
  
  @js.native
  trait PluginsMap extends StObject
}
