package typings.azureMsalNode

import typings.azureMsalCommon.mod.AccountEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheDistributedIpartitionmanagerMod {
  
  trait IPartitionManager extends StObject {
    
    /**
      * This function should return the correct key being used to save each
      * user's cache information to cache - given an AccountEntity
      *
      * Example: Your application may be partitioning the user's cache
      * information for each user using the homeAccountId thus
      * this function would return the homeAccountId from
      * the provided AccountEntity
      *
      * Visit the [RedisTestApp](https://github.com/AzureAD/microsoft-authentication-library-for-js/tree/dev/samples/msal-node-samples/RedisTestApp) to see it in action.
      *
      * @param accountEntity: AccountEntity
      * @returns Promise<string>
      */
    def extractKey(accountEntity: AccountEntity): js.Promise[String]
    
    /**
      * This function should return the correct key from which to read
      * the specific user's information from cache.
      *
      * Example: Your application may be partitioning the user's cache
      * information for each user using the homeAccountId and thus
      * this function would return the homeAccountId for
      * the user in question
      *
      * Visit the [RedisTestApp](https://github.com/AzureAD/microsoft-authentication-library-for-js/tree/dev/samples/msal-node-samples/RedisTestApp) to see it in action.
      *
      * @returns Promise<string>
      */
    def getKey(): js.Promise[String]
  }
  object IPartitionManager {
    
    inline def apply(extractKey: AccountEntity => js.Promise[String], getKey: () => js.Promise[String]): IPartitionManager = {
      val __obj = js.Dynamic.literal(extractKey = js.Any.fromFunction1(extractKey), getKey = js.Any.fromFunction0(getKey))
      __obj.asInstanceOf[IPartitionManager]
    }
    
    extension [Self <: IPartitionManager](x: Self) {
      
      inline def setExtractKey(value: AccountEntity => js.Promise[String]): Self = StObject.set(x, "extractKey", js.Any.fromFunction1(value))
      
      inline def setGetKey(value: () => js.Promise[String]): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
    }
  }
}
