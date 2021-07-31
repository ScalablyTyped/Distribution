package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFindingsFilterResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the filter that was updated.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the filter that was updated.
    */
  var id: js.UndefOr[string] = js.undefined
}
object UpdateFindingsFilterResponse {
  
  @scala.inline
  def apply(): UpdateFindingsFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFindingsFilterResponse]
  }
  
  @scala.inline
  implicit class UpdateFindingsFilterResponseMutableBuilder[Self <: UpdateFindingsFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
