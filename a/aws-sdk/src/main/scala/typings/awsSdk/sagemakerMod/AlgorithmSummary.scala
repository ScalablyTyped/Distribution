package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typings.awsSdk.sagemakerMod.AlgorithmArn = js.native
  
  /**
    * A brief description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The name of the algorithm that is described by the summary.
    */
  var AlgorithmName: EntityName = js.native
  
  /**
    * The overall status of the algorithm.
    */
  var AlgorithmStatus: typings.awsSdk.sagemakerMod.AlgorithmStatus = js.native
  
  /**
    * A timestamp that shows when the algorithm was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
}
object AlgorithmSummary {
  
  @scala.inline
  def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    CreationTime: CreationTime
  ): AlgorithmSummary = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmSummary]
  }
  
  @scala.inline
  implicit class AlgorithmSummaryOps[Self <: AlgorithmSummary] (val x: Self) extends AnyVal {
    
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
    def setAlgorithmArn(value: AlgorithmArn): Self = this.set("AlgorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmName(value: EntityName): Self = this.set("AlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmStatus(value: AlgorithmStatus): Self = this.set("AlgorithmStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmDescription(value: EntityDescription): Self = this.set("AlgorithmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithmDescription: Self = this.set("AlgorithmDescription", js.undefined)
  }
}
