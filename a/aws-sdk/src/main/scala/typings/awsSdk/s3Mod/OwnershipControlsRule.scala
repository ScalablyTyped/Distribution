package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnershipControlsRule extends StObject {
  
  var ObjectOwnership: typings.awsSdk.s3Mod.ObjectOwnership
}
object OwnershipControlsRule {
  
  @scala.inline
  def apply(ObjectOwnership: ObjectOwnership): OwnershipControlsRule = {
    val __obj = js.Dynamic.literal(ObjectOwnership = ObjectOwnership.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipControlsRule]
  }
  
  @scala.inline
  implicit class OwnershipControlsRuleMutableBuilder[Self <: OwnershipControlsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectOwnership(value: ObjectOwnership): Self = StObject.set(x, "ObjectOwnership", value.asInstanceOf[js.Any])
  }
}
