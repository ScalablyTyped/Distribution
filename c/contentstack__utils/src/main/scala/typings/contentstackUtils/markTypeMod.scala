package typings.contentstackUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markTypeMod {
  
  @JSImport("@contentstack/utils/dist/types/nodes/mark-type", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MarkType & String] = js.native
    
    /* "bold" */ val BOLD: typings.contentstackUtils.markTypeMod.MarkType.BOLD & String = js.native
    
    /* "inlineCode" */ val INLINE_CODE: typings.contentstackUtils.markTypeMod.MarkType.INLINE_CODE & String = js.native
    
    /* "italic" */ val ITALIC: typings.contentstackUtils.markTypeMod.MarkType.ITALIC & String = js.native
    
    /* "strikethrough" */ val STRIKE_THROUGH: typings.contentstackUtils.markTypeMod.MarkType.STRIKE_THROUGH & String = js.native
    
    /* "subscript" */ val SUBSCRIPT: typings.contentstackUtils.markTypeMod.MarkType.SUBSCRIPT & String = js.native
    
    /* "superscript" */ val SUPERSCRIPT: typings.contentstackUtils.markTypeMod.MarkType.SUPERSCRIPT & String = js.native
    
    /* "underline" */ val UNDERLINE: typings.contentstackUtils.markTypeMod.MarkType.UNDERLINE & String = js.native
  }
  
  @js.native
  sealed trait MarkType extends StObject
  @JSImport("@contentstack/utils/dist/types/nodes/mark-type", "MarkType")
  @js.native
  object MarkType extends StObject {
    
    @js.native
    sealed trait BOLD
      extends StObject
         with MarkType
    
    @js.native
    sealed trait INLINE_CODE
      extends StObject
         with MarkType
    
    @js.native
    sealed trait ITALIC
      extends StObject
         with MarkType
    
    @js.native
    sealed trait STRIKE_THROUGH
      extends StObject
         with MarkType
    
    @js.native
    sealed trait SUBSCRIPT
      extends StObject
         with MarkType
    
    @js.native
    sealed trait SUPERSCRIPT
      extends StObject
         with MarkType
    
    @js.native
    sealed trait UNDERLINE
      extends StObject
         with MarkType
  }
}
