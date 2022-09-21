package typings.dataUriToBuffer

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("data-uri-to-buffer/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(uri: String): MimeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any]).asInstanceOf[MimeBuffer]
  
  inline def dataUriToBuffer(uri: String): MimeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("dataUriToBuffer")(uri.asInstanceOf[js.Any]).asInstanceOf[MimeBuffer]
  
  @js.native
  trait MimeBuffer
    extends StObject
       with Buffer {
    
    var charset: String = js.native
    
    var `type`: String = js.native
    
    var typeFull: String = js.native
  }
}
