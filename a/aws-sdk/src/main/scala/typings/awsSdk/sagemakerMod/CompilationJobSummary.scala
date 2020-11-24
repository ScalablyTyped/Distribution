package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilationJobSummary extends js.Object {
  
  /**
    * The time when the model compilation job completed.
    */
  var CompilationEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var CompilationJobArn: typings.awsSdk.sagemakerMod.CompilationJobArn = js.native
  
  /**
    * The name of the model compilation job that you want a summary for.
    */
  var CompilationJobName: EntityName = js.native
  
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: typings.awsSdk.sagemakerMod.CompilationJobStatus = js.native
  
  /**
    * The time when the model compilation job started.
    */
  var CompilationStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The type of device that the model will run on after the compilation job has completed.
    */
  var CompilationTargetDevice: js.UndefOr[TargetDevice] = js.native
  
  /**
    * The type of accelerator that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformAccelerator: js.UndefOr[TargetPlatformAccelerator] = js.native
  
  /**
    * The type of architecture that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformArch: js.UndefOr[TargetPlatformArch] = js.native
  
  /**
    * The type of OS that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformOs: js.UndefOr[TargetPlatformOs] = js.native
  
  /**
    * The time when the model compilation job was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
  
  /**
    * The time when the model compilation job was last modified.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
}
object CompilationJobSummary {
  
  @scala.inline
  def apply(
    CompilationJobArn: CompilationJobArn,
    CompilationJobName: EntityName,
    CompilationJobStatus: CompilationJobStatus,
    CreationTime: CreationTime
  ): CompilationJobSummary = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any], CompilationJobName = CompilationJobName.asInstanceOf[js.Any], CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationJobSummary]
  }
  
  @scala.inline
  implicit class CompilationJobSummaryOps[Self <: CompilationJobSummary] (val x: Self) extends AnyVal {
    
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
    def setCompilationJobArn(value: CompilationJobArn): Self = this.set("CompilationJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationJobName(value: EntityName): Self = this.set("CompilationJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationJobStatus(value: CompilationJobStatus): Self = this.set("CompilationJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationEndTime(value: Timestamp): Self = this.set("CompilationEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilationEndTime: Self = this.set("CompilationEndTime", js.undefined)
    
    @scala.inline
    def setCompilationStartTime(value: Timestamp): Self = this.set("CompilationStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilationStartTime: Self = this.set("CompilationStartTime", js.undefined)
    
    @scala.inline
    def setCompilationTargetDevice(value: TargetDevice): Self = this.set("CompilationTargetDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilationTargetDevice: Self = this.set("CompilationTargetDevice", js.undefined)
    
    @scala.inline
    def setCompilationTargetPlatformAccelerator(value: TargetPlatformAccelerator): Self = this.set("CompilationTargetPlatformAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilationTargetPlatformAccelerator: Self = this.set("CompilationTargetPlatformAccelerator", js.undefined)
    
    @scala.inline
    def setCompilationTargetPlatformArch(value: TargetPlatformArch): Self = this.set("CompilationTargetPlatformArch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilationTargetPlatformArch: Self = this.set("CompilationTargetPlatformArch", js.undefined)
    
    @scala.inline
    def setCompilationTargetPlatformOs(value: TargetPlatformOs): Self = this.set("CompilationTargetPlatformOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilationTargetPlatformOs: Self = this.set("CompilationTargetPlatformOs", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
  }
}
