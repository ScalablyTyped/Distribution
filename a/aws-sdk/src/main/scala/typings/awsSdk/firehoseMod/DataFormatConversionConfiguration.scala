package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DataFormatConversionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFormatConversionConfiguration]
  }
  
  @scala.inline
  implicit class DataFormatConversionConfigurationOps[Self <: DataFormatConversionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: BooleanObject): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setInputFormatConfiguration(value: InputFormatConfiguration): Self = this.set("InputFormatConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFormatConfiguration: Self = this.set("InputFormatConfiguration", js.undefined)
    
    @scala.inline
    def setOutputFormatConfiguration(value: OutputFormatConfiguration): Self = this.set("OutputFormatConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFormatConfiguration: Self = this.set("OutputFormatConfiguration", js.undefined)
    
    @scala.inline
    def setSchemaConfiguration(value: SchemaConfiguration): Self = this.set("SchemaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaConfiguration: Self = this.set("SchemaConfiguration", js.undefined)
  }
}
