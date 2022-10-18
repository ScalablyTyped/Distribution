package typings.cssWhat

import typings.cssWhat.libEsTypesMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsStringifyMod {
  
  @JSImport("css-what/lib/es/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(selector: js.Array[js.Array[Selector]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
}
