package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object User {
  
  @js.native
  sealed trait RoleType extends StObject
  @JSImport("backlog-js", "Option.User.RoleType")
  @js.native
  object RoleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RoleType with Double] = js.native
    
    @js.native
    sealed trait Admin extends RoleType
    /* 1 */ val Admin: typings.backlogJs.mod.Option.User.RoleType.Admin with Double = js.native
    
    @js.native
    sealed trait GuestReporter extends RoleType
    /* 5 */ val GuestReporter: typings.backlogJs.mod.Option.User.RoleType.GuestReporter with Double = js.native
    
    @js.native
    sealed trait GuestViewer extends RoleType
    /* 6 */ val GuestViewer: typings.backlogJs.mod.Option.User.RoleType.GuestViewer with Double = js.native
    
    @js.native
    sealed trait Reporter extends RoleType
    /* 3 */ val Reporter: typings.backlogJs.mod.Option.User.RoleType.Reporter with Double = js.native
    
    @js.native
    sealed trait User extends RoleType
    /* 2 */ val User: typings.backlogJs.mod.Option.User.RoleType.User with Double = js.native
    
    @js.native
    sealed trait Viewer extends RoleType
    /* 4 */ val Viewer: typings.backlogJs.mod.Option.User.RoleType.Viewer with Double = js.native
  }
  
  @js.native
  trait GetRecentlyViewedParams extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
  }
  object GetRecentlyViewedParams {
    
    @scala.inline
    def apply(): GetRecentlyViewedParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRecentlyViewedParams]
    }
    
    @scala.inline
    implicit class GetRecentlyViewedParamsMutableBuilder[Self <: GetRecentlyViewedParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait GetUserActivitiesParams extends StObject {
    
    var activityTypeId: js.UndefOr[js.Array[ActivityType]] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var maxId: js.UndefOr[Double] = js.native
    
    var minId: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
  }
  object GetUserActivitiesParams {
    
    @scala.inline
    def apply(): GetUserActivitiesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetUserActivitiesParams]
    }
    
    @scala.inline
    implicit class GetUserActivitiesParamsMutableBuilder[Self <: GetUserActivitiesParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityTypeId(value: js.Array[ActivityType]): Self = StObject.set(x, "activityTypeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTypeIdUndefined: Self = StObject.set(x, "activityTypeId", js.undefined)
      
      @scala.inline
      def setActivityTypeIdVarargs(value: ActivityType*): Self = StObject.set(x, "activityTypeId", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      @scala.inline
      def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait GetUserStarsCountParams extends StObject {
    
    var since: js.UndefOr[String] = js.native
    
    var until: js.UndefOr[String] = js.native
  }
  object GetUserStarsCountParams {
    
    @scala.inline
    def apply(): GetUserStarsCountParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetUserStarsCountParams]
    }
    
    @scala.inline
    implicit class GetUserStarsCountParamsMutableBuilder[Self <: GetUserStarsCountParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      @scala.inline
      def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
  
  @js.native
  trait GetUserStarsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var maxId: js.UndefOr[Double] = js.native
    
    var minId: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
  }
  object GetUserStarsParams {
    
    @scala.inline
    def apply(): GetUserStarsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetUserStarsParams]
    }
    
    @scala.inline
    implicit class GetUserStarsParamsMutableBuilder[Self <: GetUserStarsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      @scala.inline
      def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait PatchUserParams extends StObject {
    
    var mailAddress: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var roleType: js.UndefOr[RoleType] = js.native
  }
  object PatchUserParams {
    
    @scala.inline
    def apply(): PatchUserParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchUserParams]
    }
    
    @scala.inline
    implicit class PatchUserParamsMutableBuilder[Self <: PatchUserParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMailAddress(value: String): Self = StObject.set(x, "mailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailAddressUndefined: Self = StObject.set(x, "mailAddress", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleTypeUndefined: Self = StObject.set(x, "roleType", js.undefined)
    }
  }
  
  @js.native
  trait PostUserParams extends StObject {
    
    var mailAddress: String = js.native
    
    var name: String = js.native
    
    var password: String = js.native
    
    var roleType: RoleType = js.native
    
    var userId: String = js.native
  }
  object PostUserParams {
    
    @scala.inline
    def apply(mailAddress: String, name: String, password: String, roleType: RoleType, userId: String): PostUserParams = {
      val __obj = js.Dynamic.literal(mailAddress = mailAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], roleType = roleType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostUserParams]
    }
    
    @scala.inline
    implicit class PostUserParamsMutableBuilder[Self <: PostUserParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMailAddress(value: String): Self = StObject.set(x, "mailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
