package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginAccessControl extends StObject {
  
  /**
    * The unique identifier of the origin access control.
    */
  var Id: String
  
  /**
    * The origin access control.
    */
  var OriginAccessControlConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginAccessControlConfig] = js.undefined
}
object OriginAccessControl {
  
  inline def apply(Id: String): OriginAccessControl = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginAccessControl]
  }
  
  extension [Self <: OriginAccessControl](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlConfig(value: OriginAccessControlConfig): Self = StObject.set(x, "OriginAccessControlConfig", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlConfigUndefined: Self = StObject.set(x, "OriginAccessControlConfig", js.undefined)
  }
}
