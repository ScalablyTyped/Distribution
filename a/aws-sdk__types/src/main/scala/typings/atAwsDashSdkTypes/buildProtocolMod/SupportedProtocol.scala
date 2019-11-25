package typings.atAwsDashSdkTypes.buildProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.json
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.`rest-json`
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.`rest-xml`
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.query
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.ec2
*/
trait SupportedProtocol extends js.Object

object SupportedProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ec2: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.ec2 = this.cast("ec2")
  @scala.inline
  def json: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.json = this.cast("json")
  @scala.inline
  def query: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.query = this.cast("query")
  @scala.inline
  def `rest-json`: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.`rest-json` = this.cast("rest-json")
  @scala.inline
  def `rest-xml`: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.`rest-xml` = this.cast("rest-xml")
}

