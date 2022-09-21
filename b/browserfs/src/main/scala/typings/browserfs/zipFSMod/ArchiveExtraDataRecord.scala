package typings.browserfs.zipFSMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "ArchiveExtraDataRecord")
@js.native
open class ArchiveExtraDataRecord protected () extends StObject {
  def this(data: Buffer) = this()
  
  /* private */ var data: Any = js.native
  
  def extraFieldData(): Buffer = js.native
  
  def length(): Double = js.native
}
