package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputConfig extends js.Object {
  /**
    * Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary form. The data inputs are InputConfig$Framework specific.     TensorFlow: You must specify the name and shape (NHWC format) of the expected data inputs using a dictionary format for your trained model. The dictionary formats required for the console and CLI are different.   Examples for one input:   If using the console, {"input":[1,1024,1024,3]}    If using the CLI, {\"input\":[1,1024,1024,3]}      Examples for two inputs:   If using the console, {"data1": [1,28,28,1], "data2":[1,28,28,1]}    If using the CLI, {\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}         KERAS: You must specify the name and shape (NCHW format) of expected data inputs using a dictionary format for your trained model. Note that while Keras model artifacts should be uploaded in NHWC (channel-last) format, DataInputConfig should be specified in NCHW (channel-first) format. The dictionary formats required for the console and CLI are different.   Examples for one input:   If using the console, {"input_1":[1,3,224,224]}    If using the CLI, {\"input_1\":[1,3,224,224]}      Examples for two inputs:   If using the console, {"input_1": [1,3,224,224], "input_2":[1,3,224,224]}     If using the CLI, {\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}         MXNET/ONNX: You must specify the name and shape (NCHW format) of the expected data inputs in order using a dictionary format for your trained model. The dictionary formats required for the console and CLI are different.   Examples for one input:   If using the console, {"data":[1,3,1024,1024]}    If using the CLI, {\"data\":[1,3,1024,1024]}      Examples for two inputs:   If using the console, {"var1": [1,1,28,28], "var2":[1,1,28,28]}     If using the CLI, {\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}         PyTorch: You can either specify the name and shape (NCHW format) of expected data inputs in order using a dictionary format for your trained model or you can specify the shape only using a list format. The dictionary formats required for the console and CLI are different. The list formats for the console and CLI are the same.   Examples for one input in dictionary format:   If using the console, {"input0":[1,3,224,224]}    If using the CLI, {\"input0\":[1,3,224,224]}      Example for one input in list format: [[1,3,224,224]]    Examples for two inputs in dictionary format:   If using the console, {"input0":[1,3,224,224], "input1":[1,3,224,224]}    If using the CLI, {\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]}       Example for two inputs in list format: [[1,3,224,224], [1,3,224,224]]       XGBOOST: input data name and shape are not needed.  
    */
  var DataInputConfig: typings.awsSdk.sagemakerMod.DataInputConfig = js.native
  /**
    * Identifies the framework in which the model was trained. For example: TENSORFLOW.
    */
  var Framework: typings.awsSdk.sagemakerMod.Framework = js.native
  /**
    * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri = js.native
}

object InputConfig {
  @scala.inline
  def apply(DataInputConfig: DataInputConfig, Framework: Framework, S3Uri: S3Uri): InputConfig = {
    val __obj = js.Dynamic.literal(DataInputConfig = DataInputConfig.asInstanceOf[js.Any], Framework = Framework.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfig]
  }
  @scala.inline
  implicit class InputConfigOps[Self <: InputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataInputConfig(value: DataInputConfig): Self = this.set("DataInputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramework(value: Framework): Self = this.set("Framework", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
  }
  
}

