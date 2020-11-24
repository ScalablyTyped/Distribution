package typings.confit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigFactory extends js.Object {
  
  def addDefault(filepathOrSettingsObj: String): this.type = js.native
  def addDefault(filepathOrSettingsObj: js.Object): this.type = js.native
  
  def addOverride(filepathOrSettingsObj: String): this.type = js.native
  def addOverride(filepathOrSettingsObj: js.Object): this.type = js.native
  
  def create(callback: js.Function2[/* err */ js.Any, /* config */ ConfigStore, _]): Unit = js.native
}
