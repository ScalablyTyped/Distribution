package typings.ckeditorCkeditor5Utils

import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomGlobalMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/dom/global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A helper (module) giving an access to the global DOM objects such as `window` and
    * `document`. Accessing these objects using this helper allows easy and bulletproof
    * testing, i.e. stubbing native properties:
    *
    * ```ts
    * import { global } from 'ckeditor5/utils';
    *
    * // This stub will work for any code using global module.
    * testUtils.sinon.stub( global, 'window', {
    * 	innerWidth: 10000
    * } );
    *
    * console.log( global.window.innerWidth );
    * ```
    */
  @JSImport("@ckeditor/ckeditor5-utils/src/dom/global", JSImport.Default)
  @js.native
  def default: GlobalType = js.native
  inline def default_=(x: GlobalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait GlobalType extends StObject {
    
    val document: Document
    
    val window: Window & (/* globalThis */ Any)
  }
  object GlobalType {
    
    inline def apply(document: Document, window: Window & (/* globalThis */ Any)): GlobalType = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalType] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Window & (/* globalThis */ Any)): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
}
