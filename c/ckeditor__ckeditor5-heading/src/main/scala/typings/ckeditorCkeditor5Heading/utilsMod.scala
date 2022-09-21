package typings.ckeditorCkeditor5Heading

import typings.ckeditorCkeditor5Heading.headingMod.HeadingOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalizedOptions(
    editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
  ): js.Array[HeadingOption] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedOptions")(editor.asInstanceOf[js.Any]).asInstanceOf[js.Array[HeadingOption]]
}
