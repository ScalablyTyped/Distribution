package typings.cipherBase

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cipher-base", JSImport.Namespace)
  @js.native
  abstract class ^ ()
    extends StObject
       with CipherBase {
    def this(hashMode: String) = this()
  }
  
  @js.native
  trait CipherBase extends StObject {
    
    def `final`(): Buffer = js.native
    
    def update(value: Buffer): Buffer = js.native
    def update(value: Buffer, inputEnc: String): Buffer = js.native
    def update(value: Buffer, inputEnc: String, outputEnc: String): Buffer = js.native
    def update(value: Buffer, inputEnc: Unit, outputEnc: String): Buffer = js.native
  }
}
