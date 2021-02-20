package typings.base64Async

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-async", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[Buffer] = js.native
  @JSImport("base64-async", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): js.Promise[Buffer] = js.native
  @JSImport("base64-async", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): js.Promise[String] = js.native
  @JSImport("base64-async", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, options: Options): js.Promise[String] = js.native
  
  @JSImport("base64-async", "decode")
  @js.native
  def decode(input: String): js.Promise[Buffer] = js.native
  @JSImport("base64-async", "decode")
  @js.native
  def decode(input: String, options: Options): js.Promise[Buffer] = js.native
  
  @JSImport("base64-async", "encode")
  @js.native
  def encode(input: Buffer): js.Promise[String] = js.native
  @JSImport("base64-async", "encode")
  @js.native
  def encode(input: Buffer, options: Options): js.Promise[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    }
  }
}
