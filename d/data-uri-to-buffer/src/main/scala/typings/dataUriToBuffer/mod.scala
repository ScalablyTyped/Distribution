package typings.dataUriToBuffer

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("data-uri-to-buffer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(uri: String): MimeBuffer = js.native
  
  @js.native
  trait MimeBuffer extends Buffer {
    
    var charset: String = js.native
    
    var `type`: String = js.native
    
    var typeFull: String = js.native
  }
}
