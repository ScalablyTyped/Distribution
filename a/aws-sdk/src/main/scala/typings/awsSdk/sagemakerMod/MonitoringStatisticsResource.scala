package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringStatisticsResource extends StObject {
  
  /**
    * The Amazon S3 URI for the statistics resource.
    */
  var S3Uri: js.UndefOr[typings.awsSdk.sagemakerMod.S3Uri] = js.undefined
}
object MonitoringStatisticsResource {
  
  @scala.inline
  def apply(): MonitoringStatisticsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringStatisticsResource]
  }
  
  @scala.inline
  implicit class MonitoringStatisticsResourceMutableBuilder[Self <: MonitoringStatisticsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
  }
}
