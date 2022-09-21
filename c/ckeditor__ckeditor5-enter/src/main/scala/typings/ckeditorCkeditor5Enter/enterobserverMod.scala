package typings.ckeditorCkeditor5Enter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enterobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-enter/src/enterobserver", JSImport.Default)
  @js.native
  open class default () extends EnterObserver
  
  @js.native
  trait EnterObserver
    extends typings.ckeditorCkeditor5Engine.observerMod.default[
          /* Couldn't translate: 'key not found: IArray(TsIdentLibraryScoped(ckeditor,ckeditor5-engine), TsIdentModule(Some(ckeditor),List(ckeditor5-engine, src, view, view)))' */ Any
        ] {
    
    def observe(): Unit = js.native
  }
}
