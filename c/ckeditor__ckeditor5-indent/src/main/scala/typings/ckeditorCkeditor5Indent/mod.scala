package typings.ckeditorCkeditor5Indent

import typings.ckeditorCkeditor5Indent.srcIndentMod.default
import typings.ckeditorCkeditor5Indent.srcIndentcommandbehaviorIndentbehaviorMod.IndentBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-indent", "Indent")
  @js.native
  open class Indent () extends default
  
  @JSImport("@ckeditor/ckeditor5-indent", "IndentBlock")
  @js.native
  open class IndentBlock protected ()
    extends typings.ckeditorCkeditor5Indent.srcIndentblockMod.default {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-indent", "IndentBlockCommand")
  @js.native
  open class IndentBlockCommand protected ()
    extends typings.ckeditorCkeditor5Indent.srcIndentblockcommandMod.default {
    /**
      * Creates an instance of the command.
      */
    def this(
      editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any,
      indentBehavior: IndentBehavior
    ) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-indent", "IndentEditing")
  @js.native
  open class IndentEditing ()
    extends typings.ckeditorCkeditor5Indent.srcIndenteditingMod.default
  
  @JSImport("@ckeditor/ckeditor5-indent", "IndentUI")
  @js.native
  open class IndentUI ()
    extends typings.ckeditorCkeditor5Indent.srcIndentuiMod.default
}
