package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationRevision extends js.Object {
  /**
    * 
    The time when the configuration revision was created.
    
    */
  var CreationTime: timestampIso8601 = js.native
  /**
    * 
    The description of the configuration revision.
    
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * 
    The revision number.
    
    */
  var Revision: long = js.native
}

object ConfigurationRevision {
  @scala.inline
  def apply(CreationTime: timestampIso8601, Revision: long, Description: string = null): ConfigurationRevision = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationRevision]
  }
}

