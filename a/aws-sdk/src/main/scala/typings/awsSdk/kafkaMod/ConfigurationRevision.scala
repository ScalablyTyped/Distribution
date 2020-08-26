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
  def apply(CreationTime: timestampIso8601, Revision: long): ConfigurationRevision = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationRevision]
  }
  @scala.inline
  implicit class ConfigurationRevisionOps[Self <: ConfigurationRevision] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: timestampIso8601): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: long): Self = this.set("Revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

