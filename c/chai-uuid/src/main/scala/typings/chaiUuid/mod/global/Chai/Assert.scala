package typings.chaiUuid.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assert extends js.Object {
  
  def guid(guid: String): Unit = js.native
  def guid(guid: String, version: js.Any): Unit = js.native
  
  def uuid(uuid: String): Unit = js.native
  def uuid(uuid: String, version: UuidVersion): Unit = js.native
}
