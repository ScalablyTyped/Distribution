package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.stylesmapMod.StylesProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marginMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/styles/margin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMarginRules(stylesProcessor: StylesProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMarginRules")(stylesProcessor.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
