package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFormatConversionConfiguration extends js.Object {
  /**
    * Defaults to true. Set it to false if you want to disable format conversion while preserving the configuration details.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. This parameter is required if Enabled is set to true.
    */
  var InputFormatConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.InputFormatConfiguration] = js.native
  /**
    * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. This parameter is required if Enabled is set to true.
    */
  var OutputFormatConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.OutputFormatConfiguration] = js.native
  /**
    * Specifies the AWS Glue Data Catalog table that contains the column information. This parameter is required if Enabled is set to true.
    */
  var SchemaConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.SchemaConfiguration] = js.native
}

object DataFormatConversionConfiguration {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[BooleanObject] = js.undefined,
    InputFormatConfiguration: InputFormatConfiguration = null,
    OutputFormatConfiguration: OutputFormatConfiguration = null,
    SchemaConfiguration: SchemaConfiguration = null
  ): DataFormatConversionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (InputFormatConfiguration != null) __obj.updateDynamic("InputFormatConfiguration")(InputFormatConfiguration.asInstanceOf[js.Any])
    if (OutputFormatConfiguration != null) __obj.updateDynamic("OutputFormatConfiguration")(OutputFormatConfiguration.asInstanceOf[js.Any])
    if (SchemaConfiguration != null) __obj.updateDynamic("SchemaConfiguration")(SchemaConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFormatConversionConfiguration]
  }
}

