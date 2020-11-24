package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputConfig extends js.Object {
  
  /**
    * Specifies additional parameters for compiler options in JSON format. The compiler options are TargetPlatform specific. It is required for NVIDIA accelerators and highly recommended for CPU compilations. For any other cases, it is optional to specify CompilerOptions.     CPU: Compilation for CPU supports the following compiler options.    mcpu: CPU micro-architecture. For example, {'mcpu': 'skylake-avx512'}     mattr: CPU flags. For example, {'mattr': ['+neon', '+vfpv4']}       ARM: Details of ARM CPU compilations.    NEON: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors. For example, add {'mattr': ['+neon']} to the compiler options if compiling for ARM 32-bit platform with the NEON support.      NVIDIA: Compilation for NVIDIA GPU supports the following compiler options.    gpu_code: Specifies the targeted architecture.    trt-ver: Specifies the TensorRT versions in x.y.z. format.    cuda-ver: Specifies the CUDA version in x.y format.   For example, {'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}     ANDROID: Compilation for the Android OS supports the following compiler options:    ANDROID_PLATFORM: Specifies the Android API levels. Available levels range from 21 to 29. For example, {'ANDROID_PLATFORM': 28}.    mattr: Add {'mattr': ['+neon']} to compiler options if compiling for ARM 32-bit platform with NEON support.      INFERENTIA: Compilation for target ml_inf1 uses compiler options passed in as a JSON string. For example, "CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\"".  For information about supported compiler options, see  Neuron Compiler CLI.     CoreML: Compilation for the CoreML OutputConfig$TargetDevice supports the following compiler options:    class_labels: Specifies the classification labels file name inside input tar.gz file. For example, {"class_labels": "imagenet_labels_1000.txt"}. Labels inside the txt file should be separated by newlines.    
    */
  var CompilerOptions: js.UndefOr[typings.awsSdk.sagemakerMod.CompilerOptions] = js.native
  
  /**
    * Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example, s3://bucket-name/key-name-prefix.
    */
  var S3OutputLocation: S3Uri = js.native
  
  /**
    * Identifies the target device or the machine learning instance that you want to run your model on after the compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using TargetPlatform fields. It can be used instead of TargetPlatform.
    */
  var TargetDevice: js.UndefOr[typings.awsSdk.sagemakerMod.TargetDevice] = js.native
  
  /**
    * Contains information about a target platform that you want your model to run on, such as OS, architecture, and accelerators. It is an alternative of TargetDevice. The following examples show how to configure the TargetPlatform and CompilerOptions JSON strings for popular target platforms:    Raspberry Pi 3 Model B+  "TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},    "CompilerOptions": {'mattr': ['+neon']}    Jetson TX2  "TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},    "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}    EC2 m5.2xlarge instance OS  "TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},    "CompilerOptions": {'mcpu': 'skylake-avx512'}    RK3399  "TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}    ARMv7 phone (CPU)  "TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},    "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}    ARMv8 phone (CPU)  "TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},    "CompilerOptions": {'ANDROID_PLATFORM': 29}   
    */
  var TargetPlatform: js.UndefOr[typings.awsSdk.sagemakerMod.TargetPlatform] = js.native
}
object OutputConfig {
  
  @scala.inline
  def apply(S3OutputLocation: S3Uri): OutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputLocation = S3OutputLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputConfig]
  }
  
  @scala.inline
  implicit class OutputConfigOps[Self <: OutputConfig] (val x: Self) extends AnyVal {
    
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
    def setS3OutputLocation(value: S3Uri): Self = this.set("S3OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = this.set("CompilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerOptions: Self = this.set("CompilerOptions", js.undefined)
    
    @scala.inline
    def setTargetDevice(value: TargetDevice): Self = this.set("TargetDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDevice: Self = this.set("TargetDevice", js.undefined)
    
    @scala.inline
    def setTargetPlatform(value: TargetPlatform): Self = this.set("TargetPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPlatform: Self = this.set("TargetPlatform", js.undefined)
  }
}
