package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the prompt.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the prompt.
    */
  var Id: js.UndefOr[PromptId] = js.undefined
  
  /**
    * The name of the prompt.
    */
  var Name: js.UndefOr[PromptName] = js.undefined
}
object PromptSummary {
  
  @scala.inline
  def apply(): PromptSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptSummary]
  }
  
  @scala.inline
  implicit class PromptSummaryMutableBuilder[Self <: PromptSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: PromptId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: PromptName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
