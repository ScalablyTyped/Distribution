package typings.cassandraDashDriver.cassandraDashDriverMod.policies.addressResolution

import typings.cassandraDashDriver.cassandraDashDriverMod.Callback
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.addressResolution.EC2MultiRegionTranslator")
@js.native
class EC2MultiRegionTranslatorCls () extends EC2MultiRegionTranslator {
  /* CompleteClass */
  override def logError(address: String, err: Error): Unit = js.native
  /* CompleteClass */
  override def translate(address: String, port: Double, callback: Callback): Unit = js.native
}

