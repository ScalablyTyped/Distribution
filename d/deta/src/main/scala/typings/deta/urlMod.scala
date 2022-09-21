package typings.deta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  object default {
    
    @JSImport("deta/dist/types/constants/url", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def base(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base")().asInstanceOf[String]
    inline def base(host: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base")(host.asInstanceOf[js.Any]).asInstanceOf[String]
    @JSImport("deta/dist/types/constants/url", "default.base")
    @js.native
    def base_Fdefault: js.Function1[/* host */ js.UndefOr[String], String] = js.native
    
    inline def base_Fdefault_=(x: js.Function1[/* host */ js.UndefOr[String], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base")(x.asInstanceOf[js.Any])
    
    inline def drive(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("drive")().asInstanceOf[String]
    inline def drive(host: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("drive")(host.asInstanceOf[js.Any]).asInstanceOf[String]
    @JSImport("deta/dist/types/constants/url", "default.drive")
    @js.native
    def drive_Fdefault: js.Function1[/* host */ js.UndefOr[String], String] = js.native
    
    inline def drive_Fdefault_=(x: js.Function1[/* host */ js.UndefOr[String], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drive")(x.asInstanceOf[js.Any])
  }
}
