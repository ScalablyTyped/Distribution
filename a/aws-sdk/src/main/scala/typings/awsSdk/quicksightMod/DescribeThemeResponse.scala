package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThemeResponse extends StObject {
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * The information about the theme that you are describing.
    */
  var Theme: js.UndefOr[typings.awsSdk.quicksightMod.Theme] = js.native
}
object DescribeThemeResponse {
  
  @scala.inline
  def apply(): DescribeThemeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThemeResponse]
  }
  
  @scala.inline
  implicit class DescribeThemeResponseMutableBuilder[Self <: DescribeThemeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = StObject.set(x, "Theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "Theme", js.undefined)
  }
}
