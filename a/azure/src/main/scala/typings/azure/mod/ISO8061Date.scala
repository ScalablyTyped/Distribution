package typings.azure.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "ISO8061Date")
@js.native
object ISO8061Date extends js.Object {
  
  def format(date: Date): String = js.native
  
  def parse(stringDateTime: String): Date = js.native
}
