package typings.chartmogulNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chartmogul-node", "Config")
@js.native
class Config protected () extends js.Object {
  def this(token: String, secret: String) = this()
  def this(token: String, secret: String, base: String) = this()
  
  var API_BASE: String = js.native
  
  var VERSION: String = js.native
  
  def getAccountToken(): String = js.native
  
  def getSecretKey(): String = js.native
  
  var retries: Double = js.native
}
