package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStandardKernel extends js.Object {
  val connectionProviderIds: js.Array[String]
  val displayName: String
  val name: String
}

object IStandardKernel {
  @scala.inline
  def apply(connectionProviderIds: js.Array[String], displayName: String, name: String): IStandardKernel = {
    val __obj = js.Dynamic.literal(connectionProviderIds = connectionProviderIds.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStandardKernel]
  }
}

