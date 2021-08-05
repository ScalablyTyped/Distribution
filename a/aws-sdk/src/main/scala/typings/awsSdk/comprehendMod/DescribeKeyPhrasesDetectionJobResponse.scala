package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyPhrasesDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a key phrases detection job. 
    */
  var KeyPhrasesDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.KeyPhrasesDetectionJobProperties] = js.undefined
}
object DescribeKeyPhrasesDetectionJobResponse {
  
  inline def apply(): DescribeKeyPhrasesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobResponse]
  }
  
  extension [Self <: DescribeKeyPhrasesDetectionJobResponse](x: Self) {
    
    inline def setKeyPhrasesDetectionJobProperties(value: KeyPhrasesDetectionJobProperties): Self = StObject.set(x, "KeyPhrasesDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setKeyPhrasesDetectionJobPropertiesUndefined: Self = StObject.set(x, "KeyPhrasesDetectionJobProperties", js.undefined)
  }
}
