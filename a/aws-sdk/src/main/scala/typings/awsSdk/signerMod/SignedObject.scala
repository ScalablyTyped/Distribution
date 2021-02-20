package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedObject extends StObject {
  
  /**
    * The S3SignedObject.
    */
  var s3: js.UndefOr[S3SignedObject] = js.native
}
object SignedObject {
  
  @scala.inline
  def apply(): SignedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignedObject]
  }
  
  @scala.inline
  implicit class SignedObjectMutableBuilder[Self <: SignedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3(value: S3SignedObject): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
