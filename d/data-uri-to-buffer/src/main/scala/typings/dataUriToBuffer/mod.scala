package typings.dataUriToBuffer

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(uri: String): MimeBuffer = ^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any]).asInstanceOf[MimeBuffer]
  
  @JSImport("data-uri-to-buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait MimeBuffer
    extends StObject
       with Buffer {
    
    var charset: String = js.native
    
    var `type`: String = js.native
    
    var typeFull: String = js.native
  }
}
