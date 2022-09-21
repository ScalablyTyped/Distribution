package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPlatform extends StObject {
  
  /**
    * The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia graphics processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also specify the gpu-code, trt-ver, and cuda-ver compiler options. If you don't specify an accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend that you use the GreengrassConfiguration$CompilerOptions field. For example, you can use the following compiler options for CPU:     mcpu: CPU micro-architecture. For example, {'mcpu': 'skylake-avx512'}     mattr: CPU flags. For example, {'mattr': ['+neon', '+vfpv4']}   
    */
  var Accelerator: js.UndefOr[TargetPlatformAccelerator] = js.undefined
  
  /**
    * The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of the x86 instruction set) and ARM_64 (ARMv8 64-bit CPU). 
    */
  var Arch: TargetPlatformArch
  
  /**
    * The target operating system for the model. Linux is the only operating system that is currently supported. 
    */
  var Os: TargetPlatformOs
}
object TargetPlatform {
  
  inline def apply(Arch: TargetPlatformArch, Os: TargetPlatformOs): TargetPlatform = {
    val __obj = js.Dynamic.literal(Arch = Arch.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPlatform]
  }
  
  extension [Self <: TargetPlatform](x: Self) {
    
    inline def setAccelerator(value: TargetPlatformAccelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
    
    inline def setArch(value: TargetPlatformArch): Self = StObject.set(x, "Arch", value.asInstanceOf[js.Any])
    
    inline def setOs(value: TargetPlatformOs): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
  }
}
