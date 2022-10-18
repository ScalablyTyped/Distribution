package typings.contentstackUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEmbeddedTypesStyleTypeMod {
  
  @JSImport("@contentstack/utils/dist/types/embedded-types/style-type", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StyleType & String] = js.native
    
    /* "block" */ val BLOCK: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.BLOCK & String = js.native
    
    /* "display" */ val DISPLAY: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.DISPLAY & String = js.native
    
    /* "download" */ val DOWNLOAD: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.DOWNLOAD & String = js.native
    
    /* "inline" */ val INLINE: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.INLINE & String = js.native
    
    /* "link" */ val LINK: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.LINK & String = js.native
  }
  
  @js.native
  sealed trait StyleType extends StObject
  @JSImport("@contentstack/utils/dist/types/embedded-types/style-type", "StyleType")
  @js.native
  object StyleType extends StObject {
    
    @js.native
    sealed trait BLOCK
      extends StObject
         with StyleType
    
    @js.native
    sealed trait DISPLAY
      extends StObject
         with StyleType
    
    @js.native
    sealed trait DOWNLOAD
      extends StObject
         with StyleType
    
    @js.native
    sealed trait INLINE
      extends StObject
         with StyleType
    
    @js.native
    sealed trait LINK
      extends StObject
         with StyleType
  }
}
