package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAssociationOutputLocation extends StObject {
  
  /**
    * An S3 bucket where you want to store the results of this request.
    */
  var S3Location: js.UndefOr[S3OutputLocation] = js.undefined
}
object InstanceAssociationOutputLocation {
  
  inline def apply(): InstanceAssociationOutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationOutputLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceAssociationOutputLocation] (val x: Self) extends AnyVal {
    
    inline def setS3Location(value: S3OutputLocation): Self = StObject.set(x, "S3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "S3Location", js.undefined)
  }
}
