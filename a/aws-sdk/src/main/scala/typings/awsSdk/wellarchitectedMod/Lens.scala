package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lens extends StObject {
  
  var Description: js.UndefOr[LensDescription] = js.undefined
  
  /**
    * The ARN of a lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensArn] = js.undefined
  
  /**
    * The version of a lens.
    */
  var LensVersion: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensVersion] = js.undefined
  
  var Name: js.UndefOr[LensName] = js.undefined
  
  /**
    * The Amazon Web Services account ID that owns the lens.
    */
  var Owner: js.UndefOr[LensOwner] = js.undefined
  
  /**
    * The ID assigned to the share invitation.
    */
  var ShareInvitationId: js.UndefOr[typings.awsSdk.wellarchitectedMod.ShareInvitationId] = js.undefined
  
  /**
    * The tags assigned to the lens.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Lens {
  
  inline def apply(): Lens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lens]
  }
  
  extension [Self <: Lens](x: Self) {
    
    inline def setDescription(value: LensDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setLensVersion(value: LensVersion): Self = StObject.set(x, "LensVersion", value.asInstanceOf[js.Any])
    
    inline def setLensVersionUndefined: Self = StObject.set(x, "LensVersion", js.undefined)
    
    inline def setName(value: LensName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: LensOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setShareInvitationId(value: ShareInvitationId): Self = StObject.set(x, "ShareInvitationId", value.asInstanceOf[js.Any])
    
    inline def setShareInvitationIdUndefined: Self = StObject.set(x, "ShareInvitationId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
