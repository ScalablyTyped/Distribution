package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.sharedMod.FileStatus
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filenameMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FileUploader/Filename", JSImport.Default)
  @js.native
  val default: FC[FilenameIconProps] = js.native
  
  trait FilenameIconProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var iconDescription: js.UndefOr[String] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[FileStatus] = js.undefined
  }
  object FilenameIconProps {
    
    inline def apply(): FilenameIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilenameIconProps]
    }
    
    extension [Self <: FilenameIconProps](x: Self) {
      
      inline def setIconDescription(value: String): Self = StObject.set(x, "iconDescription", value.asInstanceOf[js.Any])
      
      inline def setIconDescriptionUndefined: Self = StObject.set(x, "iconDescription", js.undefined)
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setStatus(value: FileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type _To = FC[FilenameIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `filenameMod.foo` */
  override def _to: FC[FilenameIconProps] = default
}
