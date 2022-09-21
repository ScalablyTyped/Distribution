package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyDetectorSummary extends StObject {
  
  /**
    * The ARN of the detector.
    */
  var AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A description of the detector.
    */
  var AnomalyDetectorDescription: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AnomalyDetectorDescription] = js.undefined
  
  /**
    * The name of the detector.
    */
  var AnomalyDetectorName: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AnomalyDetectorName] = js.undefined
  
  /**
    * The time at which the detector was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the detector was last modified.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of detector.
    */
  var Status: js.UndefOr[AnomalyDetectorStatus] = js.undefined
  
  /**
    * The detector's tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object AnomalyDetectorSummary {
  
  inline def apply(): AnomalyDetectorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetectorSummary]
  }
  
  extension [Self <: AnomalyDetectorSummary](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorArnUndefined: Self = StObject.set(x, "AnomalyDetectorArn", js.undefined)
    
    inline def setAnomalyDetectorDescription(value: AnomalyDetectorDescription): Self = StObject.set(x, "AnomalyDetectorDescription", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorDescriptionUndefined: Self = StObject.set(x, "AnomalyDetectorDescription", js.undefined)
    
    inline def setAnomalyDetectorName(value: AnomalyDetectorName): Self = StObject.set(x, "AnomalyDetectorName", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorNameUndefined: Self = StObject.set(x, "AnomalyDetectorName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setStatus(value: AnomalyDetectorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
