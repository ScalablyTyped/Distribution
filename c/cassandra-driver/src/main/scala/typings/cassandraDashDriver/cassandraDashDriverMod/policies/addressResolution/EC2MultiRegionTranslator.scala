package typings.cassandraDashDriver.cassandraDashDriverMod.policies.addressResolution

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2MultiRegionTranslator extends AddressTranslator {
  def logError(address: String, err: Error): Unit
}

@JSImport("cassandra-driver", "policies.addressResolution.EC2MultiRegionTranslator")
@js.native
object EC2MultiRegionTranslator extends TopLevel[EC2MultiRegionTranslatorStatic]

