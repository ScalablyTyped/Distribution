package typings.gitlabNBHG3ede.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDotDTsMod.UserGPGKeys
import typings.gitlabNBHG3ede.indexDotDTsMod.UserImpersonationTokens
import typings.gitlabNBHG3ede.indexDotDTsMod.UserKeys
import typings.gitlabNBHG3ede.indexDotDTsMod.Users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserCustomAttributes extends StObject {
  
  var UserCustomAttributes: Instantiable1[
    /* options */ BaseServiceOptions, 
    typings.gitlabNBHG3ede.indexDotDTsMod.UserCustomAttributes
  ]
  
  var UserEmails: Instantiable0[typings.gitlabNBHG3ede.indexDotDTsMod.UserEmails]
  
  var UserGPGKeys: Instantiable0[typings.gitlabNBHG3ede.indexDotDTsMod.UserGPGKeys]
  
  var UserImpersonationTokens: Instantiable0[typings.gitlabNBHG3ede.indexDotDTsMod.UserImpersonationTokens]
  
  var UserKeys: Instantiable0[typings.gitlabNBHG3ede.indexDotDTsMod.UserKeys]
  
  var Users: Instantiable0[typings.gitlabNBHG3ede.indexDotDTsMod.Users]
}
object UserCustomAttributes {
  
  inline def apply(
    UserCustomAttributes: Instantiable1[
      /* options */ BaseServiceOptions, 
      typings.gitlabNBHG3ede.indexDotDTsMod.UserCustomAttributes
    ],
    UserEmails: Instantiable0[typings.gitlabNBHG3ede.indexDotDTsMod.UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): UserCustomAttributes = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes.asInstanceOf[js.Any], UserEmails = UserEmails.asInstanceOf[js.Any], UserGPGKeys = UserGPGKeys.asInstanceOf[js.Any], UserImpersonationTokens = UserImpersonationTokens.asInstanceOf[js.Any], UserKeys = UserKeys.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCustomAttributes]
  }
  
  extension [Self <: UserCustomAttributes](x: Self) {
    
    inline def setUserCustomAttributes(
      value: Instantiable1[
          /* options */ BaseServiceOptions, 
          typings.gitlabNBHG3ede.indexDotDTsMod.UserCustomAttributes
        ]
    ): Self = StObject.set(x, "UserCustomAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserEmails(value: Instantiable0[typings.gitlabNBHG3ede.indexDotDTsMod.UserEmails]): Self = StObject.set(x, "UserEmails", value.asInstanceOf[js.Any])
    
    inline def setUserGPGKeys(value: Instantiable0[UserGPGKeys]): Self = StObject.set(x, "UserGPGKeys", value.asInstanceOf[js.Any])
    
    inline def setUserImpersonationTokens(value: Instantiable0[UserImpersonationTokens]): Self = StObject.set(x, "UserImpersonationTokens", value.asInstanceOf[js.Any])
    
    inline def setUserKeys(value: Instantiable0[UserKeys]): Self = StObject.set(x, "UserKeys", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: Instantiable0[Users]): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
  }
}
