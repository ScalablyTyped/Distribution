package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobTemplatesResponse extends StObject {
  
  /**
    * List of Job templates.
    */
  var JobTemplates: js.UndefOr[listOfJobTemplate] = js.undefined
  
  /**
    * Use this string to request the next batch of job templates.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListJobTemplatesResponse {
  
  inline def apply(): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
  
  extension [Self <: ListJobTemplatesResponse](x: Self) {
    
    inline def setJobTemplates(value: listOfJobTemplate): Self = StObject.set(x, "JobTemplates", value.asInstanceOf[js.Any])
    
    inline def setJobTemplatesUndefined: Self = StObject.set(x, "JobTemplates", js.undefined)
    
    inline def setJobTemplatesVarargs(value: JobTemplate*): Self = StObject.set(x, "JobTemplates", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
