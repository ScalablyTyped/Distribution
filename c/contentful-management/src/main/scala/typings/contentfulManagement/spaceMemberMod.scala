package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.SpaceMemberPropstoPlainOb
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceMemberMod {
  
  @JSImport("contentful-management/dist/typings/entities/space-member", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapSpaceMember(http: AxiosInstance, data: SpaceMemberProps): SpaceMemberPropstoPlainOb = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapSpaceMember")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[SpaceMemberPropstoPlainOb]
  
  @scala.inline
  def wrapSpaceMemberCollection(http: AxiosInstance, data: CollectionProp[SpaceMemberProps]): Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapSpaceMemberCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps]]
  
  trait SpaceMember
    extends StObject
       with SpaceMemberProps
       with DefaultElements[SpaceMemberProps]
  object SpaceMember {
    
    @scala.inline
    def apply(
      admin: Boolean,
      roles: js.Array[MetaLinkProps],
      sys: MetaSysProps,
      toPlainObject: () => SpaceMemberProps
    ): SpaceMember = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[SpaceMember]
    }
  }
  
  trait SpaceMemberProps extends StObject {
    
    /**
      * User is an admin
      */
    var admin: Boolean
    
    /**
      * Array of Role Links
      */
    var roles: js.Array[MetaLinkProps]
    
    var sys: MetaSysProps
  }
  object SpaceMemberProps {
    
    @scala.inline
    def apply(admin: Boolean, roles: js.Array[MetaLinkProps], sys: MetaSysProps): SpaceMemberProps = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceMemberProps]
    }
    
    @scala.inline
    implicit class SpaceMemberPropsMutableBuilder[Self <: SpaceMemberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
