package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetadataProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/asset.AssetProps, 'sys'> */
trait OmitAssetPropssys extends StObject {
  
  var fields: Description
  
  var metadata: js.UndefOr[MetadataProps] = js.undefined
}
object OmitAssetPropssys {
  
  @scala.inline
  def apply(fields: Description): OmitAssetPropssys = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAssetPropssys]
  }
  
  @scala.inline
  implicit class OmitAssetPropssysMutableBuilder[Self <: OmitAssetPropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: Description): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataProps): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
