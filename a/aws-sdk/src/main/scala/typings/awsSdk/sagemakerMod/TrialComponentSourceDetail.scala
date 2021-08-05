package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponentSourceDetail extends StObject {
  
  /**
    * Information about a processing job that's the source of a trial component.
    */
  var ProcessingJob: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingJob] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.undefined
  
  /**
    * Information about a training job that's the source of a trial component.
    */
  var TrainingJob: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJob] = js.undefined
  
  /**
    * Information about a transform job that's the source of a trial component.
    */
  var TransformJob: js.UndefOr[typings.awsSdk.sagemakerMod.TransformJob] = js.undefined
}
object TrialComponentSourceDetail {
  
  inline def apply(): TrialComponentSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentSourceDetail]
  }
  
  extension [Self <: TrialComponentSourceDetail](x: Self) {
    
    inline def setProcessingJob(value: ProcessingJob): Self = StObject.set(x, "ProcessingJob", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobUndefined: Self = StObject.set(x, "ProcessingJob", js.undefined)
    
    inline def setSourceArn(value: TrialComponentSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setTrainingJob(value: TrainingJob): Self = StObject.set(x, "TrainingJob", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobUndefined: Self = StObject.set(x, "TrainingJob", js.undefined)
    
    inline def setTransformJob(value: TransformJob): Self = StObject.set(x, "TransformJob", value.asInstanceOf[js.Any])
    
    inline def setTransformJobUndefined: Self = StObject.set(x, "TransformJob", js.undefined)
  }
}
