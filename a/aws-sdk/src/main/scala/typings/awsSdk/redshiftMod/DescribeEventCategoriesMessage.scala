package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventCategoriesMessage extends StObject {
  
  /**
    * The source type, such as cluster or parameter group, to which the described event categories apply. Valid values: cluster, cluster-snapshot, cluster-parameter-group, cluster-security-group, and scheduled-action.
    */
  var SourceType: js.UndefOr[String] = js.native
}
object DescribeEventCategoriesMessage {
  
  @scala.inline
  def apply(): DescribeEventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventCategoriesMessage]
  }
  
  @scala.inline
  implicit class DescribeEventCategoriesMessageMutableBuilder[Self <: DescribeEventCategoriesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
