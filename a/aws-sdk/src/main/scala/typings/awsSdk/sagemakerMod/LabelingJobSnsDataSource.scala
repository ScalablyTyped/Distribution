package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobSnsDataSource extends StObject {
  
  /**
    * The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to send new data objects to a streaming labeling job.
    */
  var SnsTopicArn: typings.awsSdk.sagemakerMod.SnsTopicArn
}
object LabelingJobSnsDataSource {
  
  inline def apply(SnsTopicArn: SnsTopicArn): LabelingJobSnsDataSource = {
    val __obj = js.Dynamic.literal(SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobSnsDataSource]
  }
  
  extension [Self <: LabelingJobSnsDataSource](x: Self) {
    
    inline def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
  }
}
