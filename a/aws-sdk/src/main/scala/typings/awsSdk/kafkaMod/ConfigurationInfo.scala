package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationInfo extends StObject {
  
  /**
    * 
    ARN of the configuration to use.
    
    */
  var Arn: string = js.native
  
  /**
    * 
    The revision of the configuration to use.
    
    */
  var Revision: long = js.native
}
object ConfigurationInfo {
  
  @scala.inline
  def apply(Arn: string, Revision: long): ConfigurationInfo = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationInfo]
  }
  
  @scala.inline
  implicit class ConfigurationInfoMutableBuilder[Self <: ConfigurationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: long): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
  }
}
