package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlatformApplicationsInput extends StObject {
  
  /**
    * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListPlatformApplicationsInput {
  
  inline def apply(): ListPlatformApplicationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformApplicationsInput]
  }
  
  extension [Self <: ListPlatformApplicationsInput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
