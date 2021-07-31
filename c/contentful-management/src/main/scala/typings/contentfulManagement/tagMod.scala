package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.anon.SysId
import typings.contentfulManagement.anon.Type
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("contentful-management/dist/typings/entities/tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(http: AxiosInstance): TagApi = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(http.asInstanceOf[js.Any]).asInstanceOf[TagApi]
  
  @scala.inline
  def createDeleteTag(http: AxiosInstance): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteTag")(http.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  
  @scala.inline
  def createUpdateTag(http: AxiosInstance): js.Function0[js.Promise[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUpdateTag")(http.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Tag]]]
  
  @scala.inline
  def wrapTag(http: AxiosInstance, data: TagProps): Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTag")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Tag]
  
  @scala.inline
  def wrapTagCollection(http: AxiosInstance, data: CollectionProp[TagProps]): Collection[Tag, TagProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTagCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Tag, TagProps]]
  
  trait Tag
    extends StObject
       with TagProps
       with DefaultElements[TagProps]
       with TagApi
  object Tag {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      name: String,
      sys: TagSysProps,
      toPlainObject: () => TagProps,
      update: () => js.Promise[Tag]
    ): Tag = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Tag]
    }
  }
  
  trait TagApi extends StObject {
    
    def delete(): js.Promise[Unit]
    
    def update(): js.Promise[Tag]
  }
  object TagApi {
    
    @scala.inline
    def apply(delete: () => js.Promise[Unit], update: () => js.Promise[Tag]): TagApi = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[TagApi]
    }
    
    @scala.inline
    implicit class TagApiMutableBuilder[Self <: TagApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[Tag]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait TagCollection extends StObject {
    
    var items: js.Array[Tag]
    
    var total: Double
  }
  object TagCollection {
    
    @scala.inline
    def apply(items: js.Array[Tag], total: Double): TagCollection = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCollection]
    }
    
    @scala.inline
    implicit class TagCollectionMutableBuilder[Self <: TagCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Tag]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Tag*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagCollectionProps extends StObject {
    
    var items: js.Array[TagProps]
    
    var sys: Type
    
    var total: Double
  }
  object TagCollectionProps {
    
    @scala.inline
    def apply(items: js.Array[TagProps], sys: Type, total: Double): TagCollectionProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCollectionProps]
    }
    
    @scala.inline
    implicit class TagCollectionPropsMutableBuilder[Self <: TagCollectionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[TagProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: TagProps*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setSys(value: Type): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagProps extends StObject {
    
    var name: String
    
    var sys: TagSysProps
  }
  object TagProps {
    
    @scala.inline
    def apply(name: String, sys: TagSysProps): TagProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagProps]
    }
    
    @scala.inline
    implicit class TagPropsMutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: TagSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<contentful-management.contentful-management/dist/typings/common-types.MetaSysProps, 'id' | 'space' | 'version' | 'createdAt' | 'createdBy' | 'updatedAt' | 'updatedBy'> & {  type :'Tag',   environment :{  sys :{  id :string,   type :'Link',   linkType :'Environment'}}} */
  trait TagSysProps extends StObject {
    
    var createdAt: String
    
    var createdBy: js.UndefOr[Sys] = js.undefined
    
    var environment: SysId
    
    var id: String
    
    var space: js.UndefOr[Sys] = js.undefined
    
    var `type`: typings.contentfulManagement.contentfulManagementStrings.Tag
    
    var updatedAt: String
    
    var updatedBy: js.UndefOr[Sys] = js.undefined
    
    var version: Double
  }
  object TagSysProps {
    
    @scala.inline
    def apply(createdAt: String, environment: SysId, id: String, updatedAt: String, version: Double): TagSysProps = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Tag")
      __obj.asInstanceOf[TagSysProps]
    }
    
    @scala.inline
    implicit class TagSysPropsMutableBuilder[Self <: TagSysProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedBy(value: Sys): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
      
      @scala.inline
      def setEnvironment(value: SysId): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace(value: Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setType(value: typings.contentfulManagement.contentfulManagementStrings.Tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
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
}
