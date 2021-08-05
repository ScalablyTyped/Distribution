package typings.contentfulManagement

import org.scalablytyped.runtime.StringDictionary
import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.anon.Type
import typings.contentfulManagement.tagMod.TagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTypesMod {
  
  trait Collection[T, TPlain]
    extends StObject
       with CollectionProp[T]
       with DefaultElements[CollectionProp[TPlain]]
  object Collection {
    
    inline def apply[T, TPlain](
      items: js.Array[T],
      limit: Double,
      skip: Double,
      sys: Type,
      toPlainObject: () => CollectionProp[TPlain],
      total: Double
    ): Collection[T, TPlain] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collection[T, TPlain]]
    }
  }
  
  trait CollectionProp[TObj] extends StObject {
    
    var items: js.Array[TObj]
    
    var limit: Double
    
    var skip: Double
    
    var sys: Type
    
    var total: Double
  }
  object CollectionProp {
    
    inline def apply[TObj](items: js.Array[TObj], limit: Double, skip: Double, sys: Type, total: Double): CollectionProp[TObj] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionProp[TObj]]
    }
    
    extension [Self <: CollectionProp[?], TObj](x: Self & CollectionProp[TObj]) {
      
      inline def setItems(value: js.Array[TObj]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: TObj*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSys(value: Type): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultElements[TPlainObject /* <: js.Object */] extends StObject {
    
    def toPlainObject(): TPlainObject
  }
  object DefaultElements {
    
    inline def apply[TPlainObject /* <: js.Object */](toPlainObject: () => TPlainObject): DefaultElements[TPlainObject] = {
      val __obj = js.Dynamic.literal(toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[DefaultElements[TPlainObject]]
    }
    
    extension [Self <: DefaultElements[?], TPlainObject /* <: js.Object */](x: Self & DefaultElements[TPlainObject]) {
      
      inline def setToPlainObject(value: () => TPlainObject): Self = StObject.set(x, "toPlainObject", js.Any.fromFunction0(value))
    }
  }
  
  trait MetaLinkProps extends StObject {
    
    var id: String
    
    var linkType: String
    
    var `type`: String
  }
  object MetaLinkProps {
    
    inline def apply(id: String, linkType: String, `type`: String): MetaLinkProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaLinkProps]
    }
    
    extension [Self <: MetaLinkProps](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetaSysProps extends StObject {
    
    var archivedVersion: js.UndefOr[Double] = js.undefined
    
    var createdAt: String
    
    var createdBy: js.UndefOr[Sys] = js.undefined
    
    var id: String
    
    var publishedVersion: js.UndefOr[Double] = js.undefined
    
    var space: js.UndefOr[Sys] = js.undefined
    
    var status: js.UndefOr[Sys] = js.undefined
    
    var `type`: String
    
    var updatedAt: String
    
    var updatedBy: js.UndefOr[Sys] = js.undefined
    
    var version: Double
  }
  object MetaSysProps {
    
    inline def apply(createdAt: String, id: String, `type`: String, updatedAt: String, version: Double): MetaSysProps = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaSysProps]
    }
    
    extension [Self <: MetaSysProps](x: Self) {
      
      inline def setArchivedVersion(value: Double): Self = StObject.set(x, "archivedVersion", value.asInstanceOf[js.Any])
      
      inline def setArchivedVersionUndefined: Self = StObject.set(x, "archivedVersion", js.undefined)
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedBy(value: Sys): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPublishedVersion(value: Double): Self = StObject.set(x, "publishedVersion", value.asInstanceOf[js.Any])
      
      inline def setPublishedVersionUndefined: Self = StObject.set(x, "publishedVersion", js.undefined)
      
      inline def setSpace(value: Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setStatus(value: Sys): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      inline def setUpdatedBy(value: Sys): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
      
      inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataProps extends StObject {
    
    var tags: js.Array[TagProps]
  }
  object MetadataProps {
    
    inline def apply(tags: js.Array[TagProps]): MetadataProps = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataProps]
    }
    
    extension [Self <: MetadataProps](x: Self) {
      
      inline def setTags(value: js.Array[TagProps]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: TagProps*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait QueryOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var content_type: js.UndefOr[String] = js.undefined
    
    var include: js.UndefOr[Double] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[String] = js.undefined
    
    var skip: js.UndefOr[Double] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    extension [Self <: QueryOptions](x: Self) {
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      inline def setInclude(value: Double): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
}
