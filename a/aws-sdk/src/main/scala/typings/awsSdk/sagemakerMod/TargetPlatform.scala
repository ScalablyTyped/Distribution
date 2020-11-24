package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPlatform extends js.Object {
  
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
  implicit class TargetPlatformOps[Self <: TargetPlatform] (val x: Self) extends AnyVal {
    
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
    def setArch(value: TargetPlatformArch): Self = this.set("Arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: TargetPlatformOs): Self = this.set("Os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerator(value: TargetPlatformAccelerator): Self = this.set("Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerator: Self = this.set("Accelerator", js.undefined)
  }
}
