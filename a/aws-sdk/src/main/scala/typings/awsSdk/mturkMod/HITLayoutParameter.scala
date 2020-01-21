package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HITLayoutParameter extends js.Object {
  /**
    *  The name of the parameter in the HITLayout. 
    */
  var Name: String = js.native
  /**
    * The value substituted for the parameter referenced in the HITLayout. 
    */
  var Value: String = js.native
}

object HITLayoutParameter {
  @scala.inline
  def apply(Name: String, Value: String): HITLayoutParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HITLayoutParameter]
  }
}

