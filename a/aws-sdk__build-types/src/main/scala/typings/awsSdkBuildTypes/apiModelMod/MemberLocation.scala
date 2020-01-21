package typings.awsSdkBuildTypes.apiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.header
  - typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.headers
  - typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.uri
  - typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.querystring
*/
trait MemberLocation extends js.Object

object MemberLocation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.header = this.cast("header")
  @scala.inline
  def headers: typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.headers = this.cast("headers")
  @scala.inline
  def querystring: typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.querystring = this.cast("querystring")
  @scala.inline
  def uri: typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.uri = this.cast("uri")
}

