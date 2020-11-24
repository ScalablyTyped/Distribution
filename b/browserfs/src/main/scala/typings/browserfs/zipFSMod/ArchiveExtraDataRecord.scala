package typings.browserfs.zipFSMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "ArchiveExtraDataRecord")
@js.native
class ArchiveExtraDataRecord protected () extends js.Object {
  def this(data: Buffer) = this()
  
  var data: js.Any = js.native
  
  def extraFieldData(): Buffer = js.native
  
  def length(): Double = js.native
}
