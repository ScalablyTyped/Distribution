package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLocation extends StObject {
  
  /**
    * The Amazon S3 bucket that contains the input document.
    */
  var S3Object: js.UndefOr[typings.awsSdk.clientsTextractMod.S3Object] = js.undefined
}
object DocumentLocation {
  
  inline def apply(): DocumentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentLocation] (val x: Self) extends AnyVal {
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
