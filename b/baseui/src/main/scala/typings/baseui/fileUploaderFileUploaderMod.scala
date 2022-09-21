package typings.baseui

import typings.baseui.fileUploaderTypesMod.FileUploaderProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploaderFileUploaderMod {
  
  object default {
    
    inline def apply(props: FileUploaderProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/file-uploader/file-uploader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/file-uploader/file-uploader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/file-uploader/file-uploader", "default.defaultProps.disableClick")
      @js.native
      def disableClick: Boolean = js.native
      inline def disableClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableClick")(x.asInstanceOf[js.Any])
    }
  }
}
