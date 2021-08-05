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
  
  inline def default(http: AxiosInstance): TagApi = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(http.asInstanceOf[js.Any]).asInstanceOf[TagApi]
  
  inline def createDeleteTag(http: AxiosInstance): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteTag")(http.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  
  inline def createUpdateTag(http: AxiosInstance): js.Function0[js.Promise[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUpdateTag")(http.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Tag]]]
  
  inline def wrapTag(http: AxiosInstance, data: TagProps): Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTag")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Tag]
  
  inline def wrapTagCollection(http: AxiosInstance, data: CollectionProp[TagProps]): Collection[Tag, TagProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTagCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Tag, TagProps]]
  
  trait Tag
    extends StObject
       with TagProps
       with DefaultElements[TagProps]
       with TagApi
  object Tag {
    
    inline def apply(
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
    
    inline def apply(delete: () => js.Promise[Unit], update: () => js.Promise[Tag]): TagApi = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[TagApi]
    }
    
    extension [Self <: TagApi](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[Tag]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait TagCollection extends StObject {
    
    var items: js.Array[Tag]
    
    var total: Double
  }
  object TagCollection {
    
    inline def apply(items: js.Array[Tag], total: Double): TagCollection = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCollection]
    }
    
    extension [Self <: TagCollection](x: Self) {
      
      inline def setItems(value: js.Array[Tag]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Tag*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagCollectionProps extends StObject {
    
    var items: js.Array[TagProps]
    
    var sys: Type
    
    var total: Double
  }
  object TagCollectionProps {
    
    inline def apply(items: js.Array[TagProps], sys: Type, total: Double): TagCollectionProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCollectionProps]
    }
    
    extension [Self <: TagCollectionProps](x: Self) {
      
      inline def setItems(value: js.Array[TagProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: TagProps*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setSys(value: Type): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagProps extends StObject {
    
    var name: String
    
    var sys: TagSysProps
  }
  object TagProps {
    
    inline def apply(name: String, sys: TagSysProps): TagProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagProps]
    }
    
    extension [Self <: TagProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSys(value: TagSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
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
    
    inline def apply(createdAt: String, environment: SysId, id: String, updatedAt: String, version: Double): TagSysProps = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Tag")
      __obj.asInstanceOf[TagSysProps]
    }
    
    extension [Self <: TagSysProps](x: Self) {
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedBy(value: Sys): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
      
      inline def setEnvironment(value: SysId): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setType(value: typings.contentfulManagement.contentfulManagementStrings.Tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      inline def setUpdatedBy(value: Sys): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
      
      inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
