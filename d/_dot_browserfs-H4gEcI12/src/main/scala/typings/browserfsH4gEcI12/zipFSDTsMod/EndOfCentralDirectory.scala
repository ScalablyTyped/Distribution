package typings.browserfsH4gEcI12.zipFSDTsMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".browserfs-H4gEcI12/dist/node/backend/ZipFS.d.ts", "EndOfCentralDirectory")
@js.native
open class EndOfCentralDirectory protected () extends StObject {
  def this(data: Buffer) = this()
  
  def cdDiskEntryCount(): Double = js.native
  
  def cdDiskNumber(): Double = js.native
  
  def cdOffset(): Double = js.native
  
  def cdSize(): Double = js.native
  
  def cdTotalEntryCount(): Double = js.native
  
  def cdZipComment(): String = js.native
  
  def cdZipCommentLength(): Double = js.native
  
  /* private */ var data: Any = js.native
  
  def diskNumber(): Double = js.native
  
  def rawCdZipComment(): Buffer = js.native
}
