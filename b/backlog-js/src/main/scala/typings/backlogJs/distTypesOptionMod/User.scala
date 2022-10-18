package typings.backlogJs.distTypesOptionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object User {
  
  @js.native
  sealed trait RoleType extends StObject
  @JSImport("backlog-js/dist/types/option", "User.RoleType")
  @js.native
  object RoleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RoleType & Double] = js.native
    
    @js.native
    sealed trait Admin
      extends StObject
         with RoleType
    /* 1 */ val Admin: typings.backlogJs.distTypesOptionMod.User.RoleType.Admin & Double = js.native
    
    @js.native
    sealed trait GuestReporter
      extends StObject
         with RoleType
    /* 5 */ val GuestReporter: typings.backlogJs.distTypesOptionMod.User.RoleType.GuestReporter & Double = js.native
    
    @js.native
    sealed trait GuestViewer
      extends StObject
         with RoleType
    /* 6 */ val GuestViewer: typings.backlogJs.distTypesOptionMod.User.RoleType.GuestViewer & Double = js.native
    
    @js.native
    sealed trait Reporter
      extends StObject
         with RoleType
    /* 3 */ val Reporter: typings.backlogJs.distTypesOptionMod.User.RoleType.Reporter & Double = js.native
    
    @js.native
    sealed trait User
      extends StObject
         with RoleType
    /* 2 */ val User: typings.backlogJs.distTypesOptionMod.User.RoleType.User & Double = js.native
    
    @js.native
    sealed trait Viewer
      extends StObject
         with RoleType
    /* 4 */ val Viewer: typings.backlogJs.distTypesOptionMod.User.RoleType.Viewer & Double = js.native
  }
  
  trait GetRecentlyViewedParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetRecentlyViewedParams {
    
    inline def apply(): GetRecentlyViewedParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRecentlyViewedParams]
    }
    
    extension [Self <: GetRecentlyViewedParams](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait GetUserActivitiesParams extends StObject {
    
    var activityTypeId: js.UndefOr[js.Array[ActivityType]] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var maxId: js.UndefOr[Double] = js.undefined
    
    var minId: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetUserActivitiesParams {
    
    inline def apply(): GetUserActivitiesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetUserActivitiesParams]
    }
    
    extension [Self <: GetUserActivitiesParams](x: Self) {
      
      inline def setActivityTypeId(value: js.Array[ActivityType]): Self = StObject.set(x, "activityTypeId", value.asInstanceOf[js.Any])
      
      inline def setActivityTypeIdUndefined: Self = StObject.set(x, "activityTypeId", js.undefined)
      
      inline def setActivityTypeIdVarargs(value: ActivityType*): Self = StObject.set(x, "activityTypeId", js.Array(value*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      inline def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      inline def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      inline def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait GetUserStarsCountParams extends StObject {
    
    var since: js.UndefOr[String] = js.undefined
    
    var until: js.UndefOr[String] = js.undefined
  }
  object GetUserStarsCountParams {
    
    inline def apply(): GetUserStarsCountParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetUserStarsCountParams]
    }
    
    extension [Self <: GetUserStarsCountParams](x: Self) {
      
      inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
  
  trait GetUserStarsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var maxId: js.UndefOr[Double] = js.undefined
    
    var minId: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetUserStarsParams {
    
    inline def apply(): GetUserStarsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetUserStarsParams]
    }
    
    extension [Self <: GetUserStarsParams](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      inline def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      inline def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      inline def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait PatchUserParams extends StObject {
    
    var mailAddress: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var roleType: js.UndefOr[RoleType] = js.undefined
  }
  object PatchUserParams {
    
    inline def apply(): PatchUserParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchUserParams]
    }
    
    extension [Self <: PatchUserParams](x: Self) {
      
      inline def setMailAddress(value: String): Self = StObject.set(x, "mailAddress", value.asInstanceOf[js.Any])
      
      inline def setMailAddressUndefined: Self = StObject.set(x, "mailAddress", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
      
      inline def setRoleTypeUndefined: Self = StObject.set(x, "roleType", js.undefined)
    }
  }
  
  trait PostUserParams extends StObject {
    
    var mailAddress: String
    
    var name: String
    
    var password: String
    
    var roleType: RoleType
    
    var userId: String
  }
  object PostUserParams {
    
    inline def apply(mailAddress: String, name: String, password: String, roleType: RoleType, userId: String): PostUserParams = {
      val __obj = js.Dynamic.literal(mailAddress = mailAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], roleType = roleType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostUserParams]
    }
    
    extension [Self <: PostUserParams](x: Self) {
      
      inline def setMailAddress(value: String): Self = StObject.set(x, "mailAddress", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setRoleType(value: RoleType): Self = StObject.set(x, "roleType", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
