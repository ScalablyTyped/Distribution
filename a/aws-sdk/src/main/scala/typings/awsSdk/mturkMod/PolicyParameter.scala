package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyParameter extends js.Object {
  /**
    *  Name of the parameter from the list of Review Polices. 
    */
  var Key: js.UndefOr[String] = js.native
  /**
    *  List of ParameterMapEntry objects. 
    */
  var MapEntries: js.UndefOr[ParameterMapEntryList] = js.native
  /**
    *  The list of values of the Parameter
    */
  var Values: js.UndefOr[StringList] = js.native
}

object PolicyParameter {
  @scala.inline
  def apply(Key: String = null, MapEntries: ParameterMapEntryList = null, Values: StringList = null): PolicyParameter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (MapEntries != null) __obj.updateDynamic("MapEntries")(MapEntries.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyParameter]
  }
}

