package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminServicesOptions extends js.Object {
  var databaseFileInfoOptions: js.Array[ServiceOption]
  var databaseInfoOptions: js.Array[ServiceOption]
  var fileGroupInfoOptions: js.Array[ServiceOption]
}

object AdminServicesOptions {
  @scala.inline
  def apply(
    databaseFileInfoOptions: js.Array[ServiceOption],
    databaseInfoOptions: js.Array[ServiceOption],
    fileGroupInfoOptions: js.Array[ServiceOption]
  ): AdminServicesOptions = {
    val __obj = js.Dynamic.literal(databaseFileInfoOptions = databaseFileInfoOptions.asInstanceOf[js.Any], databaseInfoOptions = databaseInfoOptions.asInstanceOf[js.Any], fileGroupInfoOptions = fileGroupInfoOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdminServicesOptions]
  }
}

