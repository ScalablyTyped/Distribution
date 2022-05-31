package typings.basicscroll

import typings.basicscroll.mod.BasicScroll
import typings.basicscroll.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object basicScroll {
    
    @JSGlobal("basicScroll")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(opts: Data): BasicScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[BasicScroll]
  }
}
