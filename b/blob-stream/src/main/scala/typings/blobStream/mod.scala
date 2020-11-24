package typings.blobStream

import typings.node.NodeJS.WritableStream
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blob-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): IBlobStream = js.native
  
  @js.native
  trait IBlobStream extends WritableStream {
    
    def toBlob(): Blob = js.native
    def toBlob(`type`: String): Blob = js.native
    
    def toBlobURL(): String = js.native
    def toBlobURL(`type`: String): String = js.native
  }
}
