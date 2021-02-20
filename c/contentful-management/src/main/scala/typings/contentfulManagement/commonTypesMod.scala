package typings.contentfulManagement

import org.scalablytyped.runtime.StringDictionary
import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.anon.Type
import typings.contentfulManagement.tagMod.TagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTypesMod {
  
  @js.native
  trait Collection[T, TPlain]
    extends CollectionProp[T]
       with DefaultElements[CollectionProp[TPlain]]
  object Collection {
    
    @scala.inline
    def apply[T, TPlain](
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
  
  @js.native
  trait CollectionProp[TObj] extends StObject {
    
    var items: js.Array[TObj] = js.native
    
    var limit: Double = js.native
    
    var skip: Double = js.native
    
    var sys: Type = js.native
    
    var total: Double = js.native
  }
  object CollectionProp {
    
    @scala.inline
    def apply[TObj](items: js.Array[TObj], limit: Double, skip: Double, sys: Type, total: Double): CollectionProp[TObj] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionProp[TObj]]
    }
    
    @scala.inline
    implicit class CollectionPropMutableBuilder[Self <: CollectionProp[_], TObj] (val x: Self with CollectionProp[TObj]) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[TObj]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: TObj*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: Type): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultElements[TPlainObject /* <: js.Object */] extends StObject {
    
    def toPlainObject(): TPlainObject = js.native
  }
  object DefaultElements {
    
    @scala.inline
    def apply[TPlainObject /* <: js.Object */](toPlainObject: () => TPlainObject): DefaultElements[TPlainObject] = {
      val __obj = js.Dynamic.literal(toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[DefaultElements[TPlainObject]]
    }
    
    @scala.inline
    implicit class DefaultElementsMutableBuilder[Self <: DefaultElements[_], TPlainObject /* <: js.Object */] (val x: Self with DefaultElements[TPlainObject]) extends AnyVal {
      
      @scala.inline
      def setToPlainObject(value: () => TPlainObject): Self = StObject.set(x, "toPlainObject", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MetaLinkProps extends StObject {
    
    var id: String = js.native
    
    var linkType: String = js.native
    
    var `type`: String = js.native
  }
  object MetaLinkProps {
    
    @scala.inline
    def apply(id: String, linkType: String, `type`: String): MetaLinkProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaLinkProps]
    }
    
    @scala.inline
    implicit class MetaLinkPropsMutableBuilder[Self <: MetaLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetaSysProps extends StObject {
    
    var archivedVersion: js.UndefOr[Double] = js.native
    
    var createdAt: String = js.native
    
    var createdBy: js.UndefOr[Sys] = js.native
    
    var id: String = js.native
    
    var publishedVersion: js.UndefOr[Double] = js.native
    
    var space: js.UndefOr[Sys] = js.native
    
    var status: js.UndefOr[Sys] = js.native
    
    var `type`: String = js.native
    
    var updatedAt: String = js.native
    
    var updatedBy: js.UndefOr[Sys] = js.native
    
    var version: Double = js.native
  }
  object MetaSysProps {
    
    @scala.inline
    def apply(createdAt: String, id: String, `type`: String, updatedAt: String, version: Double): MetaSysProps = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaSysProps]
    }
    
    @scala.inline
    implicit class MetaSysPropsMutableBuilder[Self <: MetaSysProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchivedVersion(value: Double): Self = StObject.set(x, "archivedVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivedVersionUndefined: Self = StObject.set(x, "archivedVersion", js.undefined)
      
      @scala.inline
      def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedBy(value: Sys): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishedVersion(value: Double): Self = StObject.set(x, "publishedVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishedVersionUndefined: Self = StObject.set(x, "publishedVersion", js.undefined)
      
      @scala.inline
      def setSpace(value: Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setStatus(value: Sys): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedBy(value: Sys): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetadataProps extends StObject {
    
    var tags: js.Array[TagProps] = js.native
  }
  object MetadataProps {
    
    @scala.inline
    def apply(tags: js.Array[TagProps]): MetadataProps = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataProps]
    }
    
    @scala.inline
    implicit class MetadataPropsMutableBuilder[Self <: MetadataProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: js.Array[TagProps]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: TagProps*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait QueryOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var content_type: js.UndefOr[String] = js.native
    
    var include: js.UndefOr[Double] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[String] = js.native
    
    var skip: js.UndefOr[Double] = js.native
  }
  object QueryOptions {
    
    @scala.inline
    def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      @scala.inline
      def setInclude(value: Double): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
}
