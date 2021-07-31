package typings.cids

import typings.cids.cidsNumbers.`0`
import typings.cids.cidsNumbers.`1`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Codec extends StObject {
    
    var codec: String
    
    var hash: Uint8Array
    
    var version: `0` | `1`
  }
  object Codec {
    
    @scala.inline
    def apply(codec: String, hash: Uint8Array, version: `0` | `1`): Codec = {
      val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codec]
    }
    
    @scala.inline
    implicit class CodecMutableBuilder[Self <: Codec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: `0` | `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
