package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnershipControlsRule extends StObject {
  
  var ObjectOwnership: typings.awsSdk2Types.clientsS3Mod.ObjectOwnership
}
object OwnershipControlsRule {
  
  inline def apply(ObjectOwnership: ObjectOwnership): OwnershipControlsRule = {
    val __obj = js.Dynamic.literal(ObjectOwnership = ObjectOwnership.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipControlsRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnershipControlsRule] (val x: Self) extends AnyVal {
    
    inline def setObjectOwnership(value: ObjectOwnership): Self = StObject.set(x, "ObjectOwnership", value.asInstanceOf[js.Any])
  }
}
