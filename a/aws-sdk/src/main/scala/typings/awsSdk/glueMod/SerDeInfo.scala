package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerDeInfo extends js.Object {
  /**
    * Name of the SerDe.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * These key-value pairs define initialization parameters for the SerDe.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * Usually the class that implements the SerDe. An example is org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var SerializationLibrary: js.UndefOr[NameString] = js.native
}

object SerDeInfo {
  @scala.inline
  def apply(Name: NameString = null, Parameters: ParametersMap = null, SerializationLibrary: NameString = null): SerDeInfo = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (SerializationLibrary != null) __obj.updateDynamic("SerializationLibrary")(SerializationLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerDeInfo]
  }
}

