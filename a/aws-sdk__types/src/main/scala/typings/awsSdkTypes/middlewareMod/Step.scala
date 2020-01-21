package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.awsSdkTypesStrings.initialize
  - typings.awsSdkTypes.awsSdkTypesStrings.serialize
  - typings.awsSdkTypes.awsSdkTypesStrings.build
  - typings.awsSdkTypes.awsSdkTypesStrings.finalize
*/
trait Step extends js.Object

object Step {
  @scala.inline
  def build: typings.awsSdkTypes.awsSdkTypesStrings.build = this.cast("build")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initialize: typings.awsSdkTypes.awsSdkTypesStrings.initialize = this.cast("initialize")
  @scala.inline
  def serialize: typings.awsSdkTypes.awsSdkTypesStrings.serialize = this.cast("serialize")
}

