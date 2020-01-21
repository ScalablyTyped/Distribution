package typings.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.awsSdkTypesStrings.header
  - typings.awsSdkTypes.awsSdkTypesStrings.headers
  - typings.awsSdkTypes.awsSdkTypesStrings.uri
  - typings.awsSdkTypes.awsSdkTypesStrings.querystring
  - typings.awsSdkTypes.awsSdkTypesStrings.statusCode
*/
trait MemberLocation extends js.Object

object MemberLocation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typings.awsSdkTypes.awsSdkTypesStrings.header = this.cast("header")
  @scala.inline
  def headers: typings.awsSdkTypes.awsSdkTypesStrings.headers = this.cast("headers")
  @scala.inline
  def querystring: typings.awsSdkTypes.awsSdkTypesStrings.querystring = this.cast("querystring")
  @scala.inline
  def statusCode: typings.awsSdkTypes.awsSdkTypesStrings.statusCode = this.cast("statusCode")
  @scala.inline
  def uri: typings.awsSdkTypes.awsSdkTypesStrings.uri = this.cast("uri")
}

