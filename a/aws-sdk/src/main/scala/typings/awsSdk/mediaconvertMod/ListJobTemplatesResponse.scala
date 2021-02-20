package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobTemplatesResponse extends StObject {
  
  /**
    * List of Job templates.
    */
  var JobTemplates: js.UndefOr[listOfJobTemplate] = js.native
  
  /**
    * Use this string to request the next batch of job templates.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListJobTemplatesResponse {
  
  @scala.inline
  def apply(): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListJobTemplatesResponseMutableBuilder[Self <: ListJobTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTemplates(value: listOfJobTemplate): Self = StObject.set(x, "JobTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTemplatesUndefined: Self = StObject.set(x, "JobTemplates", js.undefined)
    
    @scala.inline
    def setJobTemplatesVarargs(value: JobTemplate*): Self = StObject.set(x, "JobTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
