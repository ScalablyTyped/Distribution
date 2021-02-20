package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPlatform extends StObject {
  
  /**
    * Specifies a target platform accelerator (optional).    NVIDIA: Nvidia graphics processing unit. It also requires gpu-code, trt-ver, cuda-ver compiler options    MALI: ARM Mali graphics processor    INTEL_GRAPHICS: Integrated Intel graphics  
    */
  var Accelerator: js.UndefOr[TargetPlatformAccelerator] = js.native
  
  /**
    * Specifies a target platform architecture.    X86_64: 64-bit version of the x86 instruction set.    X86: 32-bit version of the x86 instruction set.    ARM64: ARMv8 64-bit CPU.    ARM_EABIHF: ARMv7 32-bit, Hard Float.    ARM_EABI: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.  
    */
  var Arch: TargetPlatformArch = js.native
  
  /**
    * Specifies a target platform OS.    LINUX: Linux-based operating systems.    ANDROID: Android operating systems. Android API level can be specified using the ANDROID_PLATFORM compiler option. For example, "CompilerOptions": {'ANDROID_PLATFORM': 28}   
    */
  var Os: TargetPlatformOs = js.native
}
object TargetPlatform {
  
  @scala.inline
  def apply(Arch: TargetPlatformArch, Os: TargetPlatformOs): TargetPlatform = {
    val __obj = js.Dynamic.literal(Arch = Arch.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPlatform]
  }
  
  @scala.inline
  implicit class TargetPlatformMutableBuilder[Self <: TargetPlatform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: TargetPlatformAccelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
    
    @scala.inline
    def setArch(value: TargetPlatformArch): Self = StObject.set(x, "Arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: TargetPlatformOs): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
  }
}
