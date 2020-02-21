package typings.contractProxyKit.mod

import typings.contractProxyKit.contractProxyKitNumbers.`0`
import typings.contractProxyKit.contractProxyKitNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("contract-proxy-kit", JSImport.Namespace)
@js.native
class ^ () extends CPK

@JSImport("contract-proxy-kit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CALL: `0` = js.native
  var DELEGATECALL: `1` = js.native
  def create(opts: CPKConfig): js.Promise[CPK] = js.native
}

