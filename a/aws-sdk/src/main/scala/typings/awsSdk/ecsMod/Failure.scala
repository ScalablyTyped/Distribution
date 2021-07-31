package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failure extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the failed resource.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the failure.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the failure.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object Failure {
  
  @scala.inline
  def apply(): Failure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Failure]
  }
  
  @scala.inline
  implicit class FailureMutableBuilder[Self <: Failure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
