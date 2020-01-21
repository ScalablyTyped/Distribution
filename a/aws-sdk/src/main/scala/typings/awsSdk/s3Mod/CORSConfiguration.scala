package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CORSConfiguration extends js.Object {
  /**
    * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
    */
  var CORSRules: typings.awsSdk.s3Mod.CORSRules = js.native
}

object CORSConfiguration {
  @scala.inline
  def apply(CORSRules: CORSRules): CORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CORSConfiguration]
  }
}

