package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Options interfaces
  */
trait CreateOptions extends StObject {
  
  var DefaultMessageTimeToLive: String
  
  var DuplicateDetectionHistoryTimeWindow: String
  
  var EnablePartitioning: Boolean
  
  var MaxSizeInMegabytes: Double
  
  var RequiresDuplicateDetection: Boolean
}
object CreateOptions {
  
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnablePartitioning: Boolean,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean
  ): CreateOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
  
  @scala.inline
  implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
  }
}
