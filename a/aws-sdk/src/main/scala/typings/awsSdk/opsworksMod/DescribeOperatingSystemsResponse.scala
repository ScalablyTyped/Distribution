package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOperatingSystemsResponse extends StObject {
  
  /**
    * Contains information in response to a DescribeOperatingSystems request.
    */
  var OperatingSystems: js.UndefOr[typings.awsSdk.opsworksMod.OperatingSystems] = js.native
}
object DescribeOperatingSystemsResponse {
  
  @scala.inline
  def apply(): DescribeOperatingSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOperatingSystemsResponse]
  }
  
  @scala.inline
  implicit class DescribeOperatingSystemsResponseMutableBuilder[Self <: DescribeOperatingSystemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatingSystems(value: OperatingSystems): Self = StObject.set(x, "OperatingSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemsUndefined: Self = StObject.set(x, "OperatingSystems", js.undefined)
    
    @scala.inline
    def setOperatingSystemsVarargs(value: OperatingSystem*): Self = StObject.set(x, "OperatingSystems", js.Array(value :_*))
  }
}
