package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricPolicyRule extends StObject {
  
  /**
    * A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
    */
  var ObjectGroup: typings.awsSdk.mediastoreMod.ObjectGroup = js.native
  
  /**
    * A name that allows you to refer to the object group.
    */
  var ObjectGroupName: typings.awsSdk.mediastoreMod.ObjectGroupName = js.native
}
object MetricPolicyRule {
  
  @scala.inline
  def apply(ObjectGroup: ObjectGroup, ObjectGroupName: ObjectGroupName): MetricPolicyRule = {
    val __obj = js.Dynamic.literal(ObjectGroup = ObjectGroup.asInstanceOf[js.Any], ObjectGroupName = ObjectGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricPolicyRule]
  }
  
  @scala.inline
  implicit class MetricPolicyRuleMutableBuilder[Self <: MetricPolicyRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectGroup(value: ObjectGroup): Self = StObject.set(x, "ObjectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectGroupName(value: ObjectGroupName): Self = StObject.set(x, "ObjectGroupName", value.asInstanceOf[js.Any])
  }
}
