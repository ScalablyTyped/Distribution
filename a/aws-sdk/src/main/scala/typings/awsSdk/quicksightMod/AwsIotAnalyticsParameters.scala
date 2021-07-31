package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIotAnalyticsParameters extends StObject {
  
  /**
    * Dataset name.
    */
  var DataSetName: typings.awsSdk.quicksightMod.DataSetName
}
object AwsIotAnalyticsParameters {
  
  @scala.inline
  def apply(DataSetName: DataSetName): AwsIotAnalyticsParameters = {
    val __obj = js.Dynamic.literal(DataSetName = DataSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsIotAnalyticsParameters]
  }
  
  @scala.inline
  implicit class AwsIotAnalyticsParametersMutableBuilder[Self <: AwsIotAnalyticsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSetName(value: DataSetName): Self = StObject.set(x, "DataSetName", value.asInstanceOf[js.Any])
  }
}
