package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProblemDetail extends StObject {
  
  /**
    * The problem detail's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The problem detail's name.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object ProblemDetail {
  
  @scala.inline
  def apply(): ProblemDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProblemDetail]
  }
  
  @scala.inline
  implicit class ProblemDetailMutableBuilder[Self <: ProblemDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
