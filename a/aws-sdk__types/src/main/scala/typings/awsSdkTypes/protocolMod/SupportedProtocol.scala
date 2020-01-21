package typings.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.awsSdkTypesStrings.json
  - typings.awsSdkTypes.awsSdkTypesStrings.`rest-json`
  - typings.awsSdkTypes.awsSdkTypesStrings.`rest-xml`
  - typings.awsSdkTypes.awsSdkTypesStrings.query
  - typings.awsSdkTypes.awsSdkTypesStrings.ec2
*/
trait SupportedProtocol extends js.Object

object SupportedProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ec2: typings.awsSdkTypes.awsSdkTypesStrings.ec2 = this.cast("ec2")
  @scala.inline
  def json: typings.awsSdkTypes.awsSdkTypesStrings.json = this.cast("json")
  @scala.inline
  def query: typings.awsSdkTypes.awsSdkTypesStrings.query = this.cast("query")
  @scala.inline
  def `rest-json`: typings.awsSdkTypes.awsSdkTypesStrings.`rest-json` = this.cast("rest-json")
  @scala.inline
  def `rest-xml`: typings.awsSdkTypes.awsSdkTypesStrings.`rest-xml` = this.cast("rest-xml")
}

