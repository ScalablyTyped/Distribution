package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVersionMod extends Shortcut {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/version", JSImport.Default)
  @js.native
  val default: /* "37.1.0" */ String = js.native
  
  object global {
    
    @JSGlobal("CKEDITOR_VERSION")
    @js.native
    def CKEDITOR_VERSION: String = js.native
    inline def CKEDITOR_VERSION_=(x: String): Unit = js.Dynamic.global.updateDynamic("CKEDITOR_VERSION")(x.asInstanceOf[js.Any])
  }
  
  type _To = /* "37.1.0" */ String
  
  /* This means you don't have to write `default`, but can instead just say `srcVersionMod.foo` */
  override def _to: /* "37.1.0" */ String = default
}
