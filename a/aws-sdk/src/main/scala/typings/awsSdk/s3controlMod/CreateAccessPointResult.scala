package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPointResult extends StObject {
  
  /**
    * The ARN of the access point.  This is only supported by Amazon S3 on Outposts. 
    */
  var AccessPointArn: js.UndefOr[S3AccessPointArn] = js.undefined
  
  /**
    * The name or alias of the access point.
    */
  var Alias: js.UndefOr[typings.awsSdk.s3controlMod.Alias] = js.undefined
}
object CreateAccessPointResult {
  
  inline def apply(): CreateAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPointResult]
  }
  
  extension [Self <: CreateAccessPointResult](x: Self) {
    
    inline def setAccessPointArn(value: S3AccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    inline def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
  }
}
