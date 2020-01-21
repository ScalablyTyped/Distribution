package typings.awsSdkClientS3Browser.typesOutputSerializationMod

import typings.awsSdkClientS3Browser.typesCsvoutputMod.UnmarshalledCSVOutput
import typings.awsSdkClientS3Browser.typesJsonoutputMod.UnmarshalledJSONOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledOutputSerialization extends OutputSerialization {
  /**
    * <p>Describes the serialization of CSV-encoded Select results.</p>
    */
  @JSName("CSV")
  var CSV_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.undefined
  /**
    * <p>Specifies JSON as request's output serialization format.</p>
    */
  @JSName("JSON")
  var JSON_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledJSONOutput] = js.undefined
}

object UnmarshalledOutputSerialization {
  @scala.inline
  def apply(CSV: UnmarshalledCSVOutput = null, JSON: UnmarshalledJSONOutput = null): UnmarshalledOutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledOutputSerialization]
  }
}

