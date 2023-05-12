package typings.ckeditorCkeditor5SelectAll

import typings.ckeditorCkeditor5SelectAll.srcSelectallMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-select-all", "SelectAll")
  @js.native
  open class SelectAll () extends default
  
  @JSImport("@ckeditor/ckeditor5-select-all", "SelectAllCommand")
  @js.native
  open class SelectAllCommand protected ()
    extends typings.ckeditorCkeditor5SelectAll.srcSelectallcommandMod.default {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-select-all", "SelectAllEditing")
  @js.native
  open class SelectAllEditing ()
    extends typings.ckeditorCkeditor5SelectAll.srcSelectalleditingMod.default
  
  @JSImport("@ckeditor/ckeditor5-select-all", "SelectAllUI")
  @js.native
  open class SelectAllUI ()
    extends typings.ckeditorCkeditor5SelectAll.srcSelectalluiMod.default
}
