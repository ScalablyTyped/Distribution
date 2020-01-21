package typings.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.awsSdkTypesStrings.v4
  - typings.awsSdkTypes.awsSdkTypesStrings.s3
  - typings.awsSdkTypes.awsSdkTypesStrings.s3v4
  - typings.awsSdkTypes.awsSdkTypesStrings.`v4-unsigned-body`
  - typings.awsSdkTypes.awsSdkTypesStrings.none
*/
trait SupportedSignatureVersion extends js.Object

object SupportedSignatureVersion {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.awsSdkTypes.awsSdkTypesStrings.none = this.cast("none")
  @scala.inline
  def s3: typings.awsSdkTypes.awsSdkTypesStrings.s3 = this.cast("s3")
  @scala.inline
  def s3v4: typings.awsSdkTypes.awsSdkTypesStrings.s3v4 = this.cast("s3v4")
  @scala.inline
  def v4: typings.awsSdkTypes.awsSdkTypesStrings.v4 = this.cast("v4")
  @scala.inline
  def `v4-unsigned-body`: typings.awsSdkTypes.awsSdkTypesStrings.`v4-unsigned-body` = this.cast("v4-unsigned-body")
}

