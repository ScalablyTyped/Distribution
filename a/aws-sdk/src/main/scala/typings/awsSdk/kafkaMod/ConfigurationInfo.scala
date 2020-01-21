package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

