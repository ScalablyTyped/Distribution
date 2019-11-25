package typings.atAwsDashSdkTypes.buildMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.initialize
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.serialize
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.build
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.finalize
*/
trait Step extends js.Object

object Step {
  @scala.inline
  def build: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.build = this.cast("build")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initialize: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.initialize = this.cast("initialize")
  @scala.inline
  def serialize: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.serialize = this.cast("serialize")
}

