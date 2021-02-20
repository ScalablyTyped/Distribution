package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFilterResponse extends StObject {
  
  /**
    * The filter's details.
    */
  var filter: js.UndefOr[Filter] = js.native
}
object DescribeFilterResponse {
  
  @scala.inline
  def apply(): DescribeFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFilterResponse]
  }
  
  @scala.inline
  implicit class DescribeFilterResponseMutableBuilder[Self <: DescribeFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
