package typings.azureSb

import typings.azureSb.libModelsTopicresultMod.Azure.ServiceBus.Results.TopicProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsTopicresultMod {
  
  @JSImport("azure-sb/lib/models/topicresult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(xml: js.Object): js.Object | js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Object | js.Array[js.Object]]
  
  inline def serialize(resource: TopicProperties): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(resource.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        trait TopicProperties extends StObject {
          
          var DefaultMessageTimeToLive: String
          
          var DuplicateDetectionHistoryTimeWindow: String
          
          var EnableBatchedOperations: Boolean
          
          var EnablePartitioning: Boolean
          
          var MaxSizeInMegabytes: Double
          
          var RequiresDuplicateDetection: Boolean
          
          var SizeInBytes: Double
          
          var SupportOrdering: Boolean
        }
        object TopicProperties {
          
          inline def apply(
            DefaultMessageTimeToLive: String,
            DuplicateDetectionHistoryTimeWindow: String,
            EnableBatchedOperations: Boolean,
            EnablePartitioning: Boolean,
            MaxSizeInMegabytes: Double,
            RequiresDuplicateDetection: Boolean,
            SizeInBytes: Double,
            SupportOrdering: Boolean
          ): TopicProperties = {
            val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], SupportOrdering = SupportOrdering.asInstanceOf[js.Any])
            __obj.asInstanceOf[TopicProperties]
          }
          
          extension [Self <: TopicProperties](x: Self) {
            
            inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
            
            inline def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
            
            inline def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
            
            inline def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
            
            inline def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
            
            inline def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
            
            inline def setSizeInBytes(value: Double): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
            
            inline def setSupportOrdering(value: Boolean): Self = StObject.set(x, "SupportOrdering", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
