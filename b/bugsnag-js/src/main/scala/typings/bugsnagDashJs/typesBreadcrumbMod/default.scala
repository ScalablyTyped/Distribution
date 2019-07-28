package typings.bugsnagDashJs.typesBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/breadcrumb", JSImport.Default)
@js.native
class default protected () extends Breadcrumb {
  def this(name: String) = this()
  def this(name: String, metaData: js.Object) = this()
  def this(name: String, metaData: js.Object, `type`: String) = this()
  def this(name: String, metaData: js.Object, `type`: String, timestamp: String) = this()
  /* CompleteClass */
  override var metaData: js.Object = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var timestamp: String = js.native
  /* CompleteClass */
  override var `type`: String = js.native
}

