package typings.awsSdkServiceErrorClassification

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/service-error-classification", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def isClockSkewError(error: Error): Boolean = js.native
  def isStillProcessingError(error: Error): Boolean = js.native
  def isThrottlingError(error: Error): Boolean = js.native
}

