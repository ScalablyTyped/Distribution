package typings.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.node
  - typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.browser
  - typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.universal
*/
trait RuntimeTarget extends js.Object

object RuntimeTarget {
  @scala.inline
  def browser: typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def node: typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.node = this.cast("node")
  @scala.inline
  def universal: typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.universal = this.cast("universal")
}

