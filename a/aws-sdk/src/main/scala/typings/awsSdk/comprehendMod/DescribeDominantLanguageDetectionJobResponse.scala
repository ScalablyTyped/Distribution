package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDominantLanguageDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a dominant language detection job.
    */
  var DominantLanguageDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.DominantLanguageDetectionJobProperties] = js.native
}
object DescribeDominantLanguageDetectionJobResponse {
  
  @scala.inline
  def apply(): DescribeDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
  }
  
  @scala.inline
  implicit class DescribeDominantLanguageDetectionJobResponseMutableBuilder[Self <: DescribeDominantLanguageDetectionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDominantLanguageDetectionJobProperties(value: DominantLanguageDetectionJobProperties): Self = StObject.set(x, "DominantLanguageDetectionJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantLanguageDetectionJobPropertiesUndefined: Self = StObject.set(x, "DominantLanguageDetectionJobProperties", js.undefined)
  }
}
