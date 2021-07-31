package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputConfig extends StObject {
  
  /**
    * Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary form. The data inputs are InputConfig$Framework specific.     TensorFlow: You must specify the name and shape (NHWC format) of the expected data inputs using a dictionary format for your trained model. The dictionary formats required for the console and CLI are different.   Examples for one input:   If using the console, {"input":[1,1024,1024,3]}    If using the CLI, {\"input\":[1,1024,1024,3]}      Examples for two inputs:   If using the console, {"data1": [1,28,28,1], "data2":[1,28,28,1]}    If using the CLI, {\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}         KERAS: You must specify the name and shape (NCHW format) of expected data inputs using a dictionary format for your trained model. Note that while Keras model artifacts should be uploaded in NHWC (channel-last) format, DataInputConfig should be specified in NCHW (channel-first) format. The dictionary formats required for the console and CLI are different.   Examples for one input:   If using the console, {"input_1":[1,3,224,224]}    If using the CLI, {\"input_1\":[1,3,224,224]}      Examples for two inputs:   If using the console, {"input_1": [1,3,224,224], "input_2":[1,3,224,224]}     If using the CLI, {\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}         MXNET/ONNX/DARKNET: You must specify the name and shape (NCHW format) of the expected data inputs in order using a dictionary format for your trained model. The dictionary formats required for the console and CLI are different.   Examples for one input:   If using the console, {"data":[1,3,1024,1024]}    If using the CLI, {\"data\":[1,3,1024,1024]}      Examples for two inputs:   If using the console, {"var1": [1,1,28,28], "var2":[1,1,28,28]}     If using the CLI, {\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}         PyTorch: You can either specify the name and shape (NCHW format) of expected data inputs in order using a dictionary format for your trained model or you can specify the shape only using a list format. The dictionary formats required for the console and CLI are different. The list formats for the console and CLI are the same.   Examples for one input in dictionary format:   If using the console, {"input0":[1,3,224,224]}    If using the CLI, {\"input0\":[1,3,224,224]}      Example for one input in list format: [[1,3,224,224]]    Examples for two inputs in dictionary format:   If using the console, {"input0":[1,3,224,224], "input1":[1,3,224,224]}    If using the CLI, {\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]}       Example for two inputs in list format: [[1,3,224,224], [1,3,224,224]]       XGBOOST: input data name and shape are not needed.    DataInputConfig supports the following parameters for CoreML OutputConfig$TargetDevice (ML Model format):    shape: Input shape, for example {"input_1": {"shape": [1,224,224,3]}}. In addition to static input shapes, CoreML converter supports Flexible input shapes:   Range Dimension. You can use the Range Dimension feature if you know the input shape will be within some specific interval in that dimension, for example: {"input_1": {"shape": ["1..10", 224, 224, 3]}}    Enumerated shapes. Sometimes, the models are trained to work only on a select set of inputs. You can enumerate all supported input shapes, for example: {"input_1": {"shape": [[1, 224, 224, 3], [1, 160, 160, 3]]}}       default_shape: Default input shape. You can set a default shape during conversion for both Range Dimension and Enumerated Shapes. For example {"input_1": {"shape": ["1..10", 224, 224, 3], "default_shape": [1, 224, 224, 3]}}     type: Input type. Allowed values: Image and Tensor. By default, the converter generates an ML Model with inputs of type Tensor (MultiArray). User can set input type to be Image. Image input type requires additional input parameters such as bias and scale.    bias: If the input type is an Image, you need to provide the bias vector.    scale: If the input type is an Image, you need to provide a scale factor.   CoreML ClassifierConfig parameters can be specified using OutputConfig$CompilerOptions. CoreML converter supports Tensorflow and PyTorch models. CoreML conversion examples:   Tensor type input:    "DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3]}}      Tensor type input without input name (PyTorch):    "DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224]}]      Image type input:    "DataInputConfig": {"input_1": {"shape": [[1,224,224,3], [1,160,160,3]], "default_shape": [1,224,224,3], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}}     "CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}      Image type input without input name (PyTorch):    "DataInputConfig": [{"shape": [[1,3,224,224], [1,3,160,160]], "default_shape": [1,3,224,224], "type": "Image", "bias": [-1,-1,-1], "scale": 0.007843137255}]     "CompilerOptions": {"class_labels": "imagenet_labels_1000.txt"}     
    */
  var DataInputConfig: typings.awsSdk.sagemakerMod.DataInputConfig
  
  /**
    * Identifies the framework in which the model was trained. For example: TENSORFLOW.
    */
  var Framework: typings.awsSdk.sagemakerMod.Framework
  
  /**
    * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri
}
object InputConfig {
  
  @scala.inline
  def apply(DataInputConfig: DataInputConfig, Framework: Framework, S3Uri: S3Uri): InputConfig = {
    val __obj = js.Dynamic.literal(DataInputConfig = DataInputConfig.asInstanceOf[js.Any], Framework = Framework.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfig]
  }
  
  @scala.inline
  implicit class InputConfigMutableBuilder[Self <: InputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataInputConfig(value: DataInputConfig): Self = StObject.set(x, "DataInputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramework(value: Framework): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
