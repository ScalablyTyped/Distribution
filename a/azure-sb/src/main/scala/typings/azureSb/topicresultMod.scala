package typings.azureSb

import typings.azureSb.topicresultMod.Azure.ServiceBus.Results.TopicProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicresultMod {
  
  @JSImport("azure-sb/lib/models/topicresult", "parse")
  @js.native
  def parse(xml: js.Object): js.Object | js.Array[js.Object] = js.native
  
  @JSImport("azure-sb/lib/models/topicresult", "serialize")
  @js.native
  def serialize(resource: TopicProperties): String = js.native
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        @js.native
        trait TopicProperties extends StObject {
          
          var DefaultMessageTimeToLive: String = js.native
          
          var DuplicateDetectionHistoryTimeWindow: String = js.native
          
          var EnableBatchedOperations: Boolean = js.native
          
          var EnablePartitioning: Boolean = js.native
          
          var MaxSizeInMegabytes: Double = js.native
          
          var RequiresDuplicateDetection: Boolean = js.native
          
          var SizeInBytes: Double = js.native
          
          var SupportOrdering: Boolean = js.native
        }
        object TopicProperties {
          
          @scala.inline
          def apply(
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
          
          @scala.inline
          implicit class TopicPropertiesMutableBuilder[Self <: TopicProperties] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setSizeInBytes(value: Double): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setSupportOrdering(value: Boolean): Self = StObject.set(x, "SupportOrdering", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
