package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentTier extends StObject {
  
  /**
    * The name of this environment tier. Valid values:   For Web server tier – WebServer    For Worker tier – Worker   
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The type of this environment tier. Valid values:   For Web server tier – Standard    For Worker tier – SQS/HTTP   
    */
  var Type: js.UndefOr[String] = js.native
  
  /**
    * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest compatible worker tier version.  This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it unspecified. 
    */
  var Version: js.UndefOr[String] = js.native
}
object EnvironmentTier {
  
  @scala.inline
  def apply(): EnvironmentTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentTier]
  }
  
  @scala.inline
  implicit class EnvironmentTierMutableBuilder[Self <: EnvironmentTier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
