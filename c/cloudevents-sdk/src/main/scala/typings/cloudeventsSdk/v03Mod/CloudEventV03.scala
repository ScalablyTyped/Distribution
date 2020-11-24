package typings.cloudeventsSdk.v03Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cloudeventsSdk.cloudeventMod.CE because Already inherited */ @js.native
trait CloudEventV03 extends CloudEventV03Attributes {
  
  /**
    * [REQUIRED] Identifies the event. Producers MUST ensure that `source` + `id`
    * is unique for each distinct event. If a duplicate event is re-sent (e.g. due
    * to a network error) it MAY have the same `id`. Consumers MAY assume that
    * Events with identical `source` and `id` are duplicates.
    * @required Non-empty string. Unique within producer.
    * @example An event counter maintained by the producer
    * @example A UUID
    */
  var id: String = js.native
  
  /**
    * [REQUIRED] The version of the CloudEvents specification which the event
    * uses. This enables the interpretation of the context. Compliant event
    * producers MUST use a value of `1.0` when referring to this version of the
    * specification.
    * @required MUST be a non-empty string.
    */
  var specversion: String = js.native
}
object CloudEventV03 {
  
  @scala.inline
  def apply(id: String, source: String, specversion: String, `type`: String): CloudEventV03 = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudEventV03]
  }
  
  @scala.inline
  implicit class CloudEventV03Ops[Self <: CloudEventV03] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecversion(value: String): Self = this.set("specversion", value.asInstanceOf[js.Any])
  }
}
