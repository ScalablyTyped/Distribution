package typings.cids.anon

import typings.cids.cidsNumbers.`0`
import typings.cids.cidsNumbers.`1`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codec extends js.Object {
  
  var codec: String = js.native
  
  var hash: Uint8Array = js.native
  
  var version: `0` | `1` = js.native
}
object Codec {
  
  @scala.inline
  def apply(codec: String, hash: Uint8Array, version: `0` | `1`): Codec = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
  
  @scala.inline
  implicit class CodecOps[Self <: Codec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: Uint8Array): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: `0` | `1`): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
