package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.stylesmapMod.StylesProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/styles/border", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBorderRules(stylesProcessor: StylesProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBorderRules")(stylesProcessor.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
