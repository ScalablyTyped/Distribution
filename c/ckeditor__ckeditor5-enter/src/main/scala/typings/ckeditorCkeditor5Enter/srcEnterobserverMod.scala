package typings.ckeditorCkeditor5Enter

import typings.ckeditorCkeditor5Engine.srcViewViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEnterobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-enter/src/enterobserver", JSImport.Default)
  @js.native
  open class default () extends EnterObserver
  
  @js.native
  trait EnterObserver
    extends typings.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[View] {
    
    def observe(): Unit = js.native
  }
}
