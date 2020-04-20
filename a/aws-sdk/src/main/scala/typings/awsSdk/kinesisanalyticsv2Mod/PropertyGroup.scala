package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyGroup extends js.Object {
  /**
    * Describes the key of an application execution property key-value pair.
    */
  var PropertyGroupId: Id = js.native
  /**
    * Describes the value of an application execution property key-value pair.
    */
  var PropertyMap: typings.awsSdk.kinesisanalyticsv2Mod.PropertyMap = js.native
}

object PropertyGroup {
  @scala.inline
  def apply(PropertyGroupId: Id, PropertyMap: PropertyMap): PropertyGroup = {
    val __obj = js.Dynamic.literal(PropertyGroupId = PropertyGroupId.asInstanceOf[js.Any], PropertyMap = PropertyMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyGroup]
  }
}

