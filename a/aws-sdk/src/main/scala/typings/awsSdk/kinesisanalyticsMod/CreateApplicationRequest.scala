package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationRequest extends js.Object {
  /**
    * One or more SQL statements that read input data, transform it, and generate output. For example, you can write a SQL statement that reads data from one in-application stream, generates a running average of the number of advertisement clicks by vendor, and insert resulting rows in another in-application stream using pumps. For more information about the typical pattern, see Application Code.  You can provide such series of SQL statements, where output of one statement can be used as the input for the next statement. You store intermediate results by creating in-application streams and pumps. Note that the application code must create the streams with names specified in the Outputs. For example, if your Outputs defines output streams named ExampleOutputStream1 and ExampleOutputStream2, then your application code must create these streams. 
    */
  var ApplicationCode: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ApplicationCode] = js.native
  /**
    * Summary description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ApplicationDescription] = js.native
  /**
    * Name of your Amazon Kinesis Analytics application (for example, sample-app).
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Use this parameter to configure a CloudWatch log stream to monitor application configuration errors. For more information, see Working with Amazon CloudWatch Logs.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptions] = js.native
  /**
    * Use this parameter to configure the application input. You can configure your application to receive input from a single streaming source. In this configuration, you map this streaming source to an in-application stream that is created. Your application code can then query the in-application stream like a table (you can think of it as a constantly updating table). For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon Kinesis Analytics can assume to read this stream on your behalf. To create the in-application stream, you need to specify a schema to transform your data into a schematized version used in SQL. In the schema, you provide the necessary mapping of the data elements in the streaming source to record columns in the in-app stream.
    */
  var Inputs: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.Inputs] = js.native
  /**
    * You can configure application output to write data from any of the in-application streams to up to three destinations. These destinations can be Amazon Kinesis streams, Amazon Kinesis Firehose delivery streams, AWS Lambda destinations, or any combination of the three. In the configuration, you specify the in-application stream name, the destination stream or Lambda function Amazon Resource Name (ARN), and the format to use when writing data. You must also provide an IAM role that Amazon Kinesis Analytics can assume to write to the destination stream or Lambda function on your behalf. In the output configuration, you also provide the output stream or Lambda function ARN. For stream destinations, you provide the format of data in the stream (for example, JSON, CSV). You also must provide an IAM role that Amazon Kinesis Analytics can assume to write to the stream or Lambda function on your behalf.
    */
  var Outputs: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.Outputs] = js.native
  /**
    * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an application. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see Using Tagging.
    */
  var Tags: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.Tags] = js.native
}

object CreateApplicationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    ApplicationCode: ApplicationCode = null,
    ApplicationDescription: ApplicationDescription = null,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    Inputs: Inputs = null,
    Outputs: Outputs = null,
    Tags: Tags = null
  ): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    if (ApplicationCode != null) __obj.updateDynamic("ApplicationCode")(ApplicationCode.asInstanceOf[js.Any])
    if (ApplicationDescription != null) __obj.updateDynamic("ApplicationDescription")(ApplicationDescription.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

