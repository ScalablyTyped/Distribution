package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricStreamEntry extends StObject {
  
  /**
    * The ARN of the metric stream.
    */
  var Arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The date that the metric stream was originally created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the Kinesis Firehose devlivery stream that is used for this metric stream.
    */
  var FirehoseArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The date that the configuration of this metric stream was most recently updated.
    */
  var LastUpdateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the metric stream.
    */
  var Name: js.UndefOr[MetricStreamName] = js.undefined
  
  /**
    * The output format of this metric stream. Valid values are json and opentelemetry0.7.
    */
  var OutputFormat: js.UndefOr[MetricStreamOutputFormat] = js.undefined
  
  /**
    * The current state of this stream. Valid values are running and stopped.
    */
  var State: js.UndefOr[MetricStreamState] = js.undefined
}
object MetricStreamEntry {
  
  inline def apply(): MetricStreamEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricStreamEntry]
  }
  
  extension [Self <: MetricStreamEntry](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setFirehoseArn(value: AmazonResourceName): Self = StObject.set(x, "FirehoseArn", value.asInstanceOf[js.Any])
    
    inline def setFirehoseArnUndefined: Self = StObject.set(x, "FirehoseArn", js.undefined)
    
    inline def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "LastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "LastUpdateDate", js.undefined)
    
    inline def setName(value: MetricStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputFormat(value: MetricStreamOutputFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
    
    inline def setState(value: MetricStreamState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
