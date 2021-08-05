package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThemeResponse extends StObject {
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The information about the theme that you are describing.
    */
  var Theme: js.UndefOr[typings.awsSdk.quicksightMod.Theme] = js.undefined
}
object DescribeThemeResponse {
  
  inline def apply(): DescribeThemeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThemeResponse]
  }
  
  extension [Self <: DescribeThemeResponse](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "Theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "Theme", js.undefined)
  }
}
