package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSummary extends StObject {
  
  /**
    * The number of apps.
    */
  var AppsCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The stack's ARN.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * An InstancesCount object with the number of instances in each status.
    */
  var InstancesCount: js.UndefOr[typings.awsSdk.opsworksMod.InstancesCount] = js.undefined
  
  /**
    * The number of layers.
    */
  var LayersCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The stack name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object StackSummary {
  
  @scala.inline
  def apply(): StackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSummary]
  }
  
  @scala.inline
  implicit class StackSummaryMutableBuilder[Self <: StackSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsCount(value: Integer): Self = StObject.set(x, "AppsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsCountUndefined: Self = StObject.set(x, "AppsCount", js.undefined)
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setInstancesCount(value: InstancesCount): Self = StObject.set(x, "InstancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesCountUndefined: Self = StObject.set(x, "InstancesCount", js.undefined)
    
    @scala.inline
    def setLayersCount(value: Integer): Self = StObject.set(x, "LayersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersCountUndefined: Self = StObject.set(x, "LayersCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
