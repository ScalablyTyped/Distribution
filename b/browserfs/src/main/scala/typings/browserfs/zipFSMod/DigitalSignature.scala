package typings.browserfs.zipFSMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "DigitalSignature")
@js.native
open class DigitalSignature protected () extends StObject {
  def this(data: Buffer) = this()
  
  /* private */ var data: Any = js.native
  
  def signatureData(): Buffer = js.native
  
  def size(): Double = js.native
}
