package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LensSummary extends StObject {
  
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  var Description: js.UndefOr[LensDescription] = js.undefined
  
  var LensAlias: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN of the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  var LensName: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensName] = js.undefined
  
  /**
    * The status of the lens.
    */
  var LensStatus: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensStatus] = js.undefined
  
  /**
    * The type of the lens.
    */
  var LensType: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensType] = js.undefined
  
  /**
    * The version of the lens.
    */
  var LensVersion: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensVersion] = js.undefined
  
  var Owner: js.UndefOr[AwsAccountId] = js.undefined
  
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object LensSummary {
  
  inline def apply(): LensSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LensSummary]
  }
  
  extension [Self <: LensSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: LensDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensAliasUndefined: Self = StObject.set(x, "LensAlias", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setLensName(value: LensName): Self = StObject.set(x, "LensName", value.asInstanceOf[js.Any])
    
    inline def setLensNameUndefined: Self = StObject.set(x, "LensName", js.undefined)
    
    inline def setLensStatus(value: LensStatus): Self = StObject.set(x, "LensStatus", value.asInstanceOf[js.Any])
    
    inline def setLensStatusUndefined: Self = StObject.set(x, "LensStatus", js.undefined)
    
    inline def setLensType(value: LensType): Self = StObject.set(x, "LensType", value.asInstanceOf[js.Any])
    
    inline def setLensTypeUndefined: Self = StObject.set(x, "LensType", js.undefined)
    
    inline def setLensVersion(value: LensVersion): Self = StObject.set(x, "LensVersion", value.asInstanceOf[js.Any])
    
    inline def setLensVersionUndefined: Self = StObject.set(x, "LensVersion", js.undefined)
    
    inline def setOwner(value: AwsAccountId): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
