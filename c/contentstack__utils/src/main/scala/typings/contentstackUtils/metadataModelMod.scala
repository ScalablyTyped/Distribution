package typings.contentstackUtils

import org.scalablytyped.runtime.StringDictionary
import typings.contentstackUtils.contentstackUtilsStrings.asset
import typings.contentstackUtils.contentstackUtilsStrings.entry
import typings.contentstackUtils.styleTypeMod.StyleType
import typings.contentstackUtils.textNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataModelMod {
  
  @JSImport("@contentstack/utils/dist/types/Models/metadata-model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attributeToString(attributes: Attributes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("attributeToString")(attributes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createMetadata(attribute: Attributes): Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("createMetadata")(attribute.asInstanceOf[js.Any]).asInstanceOf[Metadata]
  
  inline def nodeToMetadata(attribute: Attributes, textNode: default): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeToMetadata")(attribute.asInstanceOf[js.Any], textNode.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  trait AssetAttributes
    extends StObject
       with Attributes {
    
    var `data-sys-asset-contenttype`: String
    
    var `data-sys-asset-filelink`: String
    
    var `data-sys-asset-uid`: String
  }
  object AssetAttributes {
    
    inline def apply(
      `data-sys-asset-contenttype`: String,
      `data-sys-asset-filelink`: String,
      `data-sys-asset-uid`: String
    ): AssetAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("data-sys-asset-contenttype")(`data-sys-asset-contenttype`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-sys-asset-filelink")(`data-sys-asset-filelink`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-sys-asset-uid")(`data-sys-asset-uid`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetAttributes]
    }
    
    extension [Self <: AssetAttributes](x: Self) {
      
      inline def `setData-sys-asset-contenttype`(value: String): Self = StObject.set(x, "data-sys-asset-contenttype", value.asInstanceOf[js.Any])
      
      inline def `setData-sys-asset-filelink`(value: String): Self = StObject.set(x, "data-sys-asset-filelink", value.asInstanceOf[js.Any])
      
      inline def `setData-sys-asset-uid`(value: String): Self = StObject.set(x, "data-sys-asset-uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attributes
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var `sys-style-type`: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[entry | asset] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def `setSys-style-type`(value: String): Self = StObject.set(x, "sys-style-type", value.asInstanceOf[js.Any])
      
      inline def `setSys-style-typeUndefined`: Self = StObject.set(x, "sys-style-type", js.undefined)
      
      inline def setType(value: entry | asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EntryAttributes
    extends StObject
       with Attributes {
    
    var `data-sys-content-type-uid`: String
    
    var `data-sys-entry-local`: String
    
    var `data-sys-entry-uid`: String
  }
  object EntryAttributes {
    
    inline def apply(`data-sys-content-type-uid`: String, `data-sys-entry-local`: String, `data-sys-entry-uid`: String): EntryAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("data-sys-content-type-uid")(`data-sys-content-type-uid`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-sys-entry-local")(`data-sys-entry-local`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-sys-entry-uid")(`data-sys-entry-uid`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryAttributes]
    }
    
    extension [Self <: EntryAttributes](x: Self) {
      
      inline def `setData-sys-content-type-uid`(value: String): Self = StObject.set(x, "data-sys-content-type-uid", value.asInstanceOf[js.Any])
      
      inline def `setData-sys-entry-local`(value: String): Self = StObject.set(x, "data-sys-entry-local", value.asInstanceOf[js.Any])
      
      inline def `setData-sys-entry-uid`(value: String): Self = StObject.set(x, "data-sys-entry-uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var attributes: Attributes
    
    var contentTypeUid: js.UndefOr[String] = js.undefined
    
    var itemType: js.UndefOr[entry | asset] = js.undefined
    
    var itemUid: js.UndefOr[String] = js.undefined
    
    var styleType: js.UndefOr[StyleType] = js.undefined
    
    var text: String
  }
  object Metadata {
    
    inline def apply(attributes: Attributes, text: String): Metadata = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUid(value: String): Self = StObject.set(x, "contentTypeUid", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUidUndefined: Self = StObject.set(x, "contentTypeUid", js.undefined)
      
      inline def setItemType(value: entry | asset): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setItemUid(value: String): Self = StObject.set(x, "itemUid", value.asInstanceOf[js.Any])
      
      inline def setItemUidUndefined: Self = StObject.set(x, "itemUid", js.undefined)
      
      inline def setStyleType(value: StyleType): Self = StObject.set(x, "styleType", value.asInstanceOf[js.Any])
      
      inline def setStyleTypeUndefined: Self = StObject.set(x, "styleType", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
