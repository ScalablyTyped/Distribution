package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationInfo extends js.Object {
  
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
  implicit class ConfigurationInfoOps[Self <: ConfigurationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: long): Self = this.set("Revision", value.asInstanceOf[js.Any])
  }
}
