package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSMOutput extends StObject {
  
  var s3Location: js.UndefOr[S3Location] = js.native
}
object SSMOutput {
  
  @scala.inline
  def apply(): SSMOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSMOutput]
  }
  
  @scala.inline
  implicit class SSMOutputMutableBuilder[Self <: SSMOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
