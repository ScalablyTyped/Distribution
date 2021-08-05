package typings.browserfs.zipFSMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "EndOfCentralDirectory")
@js.native
class EndOfCentralDirectory protected () extends StObject {
  def this(data: Buffer) = this()
  
  def cdDiskEntryCount(): Double = js.native
  
  def cdDiskNumber(): Double = js.native
  
  def cdOffset(): Double = js.native
  
  def cdSize(): Double = js.native
  
  def cdTotalEntryCount(): Double = js.native
  
  def cdZipComment(): String = js.native
  
  def cdZipCommentLength(): Double = js.native
  
  /* private */ var data: js.Any = js.native
  
  def diskNumber(): Double = js.native
  
  def rawCdZipComment(): Buffer = js.native
}
