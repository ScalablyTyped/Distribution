package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringConstraintsResource extends StObject {
  
  /**
    * The Amazon S3 URI for the constraints resource.
    */
  var S3Uri: js.UndefOr[typings.awsSdk.sagemakerMod.S3Uri] = js.native
}
object MonitoringConstraintsResource {
  
  @scala.inline
  def apply(): MonitoringConstraintsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConstraintsResource]
  }
  
  @scala.inline
  implicit class MonitoringConstraintsResourceMutableBuilder[Self <: MonitoringConstraintsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
  }
}
