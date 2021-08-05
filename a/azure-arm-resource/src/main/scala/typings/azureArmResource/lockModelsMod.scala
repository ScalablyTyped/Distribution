package typings.azureArmResource

import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockModelsMod {
  
  @JSImport("azure-arm-resource/lib/lock/models", "BaseResource")
  @js.native
  class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/lock/models", "CloudError")
  @js.native
  class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  @js.native
  trait ManagementLockListResult
    extends StObject
       with Array[ManagementLockObject] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ManagementLockObject
    extends typings.msRestAzure.mod.BaseResource {
    
    /**
      * The resource ID of the lock.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete
      * means authorized users are able to read and modify the resources, but not delete. ReadOnly
      * means authorized users can only read from a resource, but they can't modify or delete it.
      * Possible values include: 'NotSpecified', 'CanNotDelete', 'ReadOnly'
      */
    var level: String = js.native
    
    /**
      * The name of the lock.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * Notes about the lock. Maximum of 512 characters.
      */
    var notes: js.UndefOr[String] = js.native
    
    /**
      * The owners of the lock.
      */
    var owners: js.UndefOr[js.Array[ManagementLockOwner]] = js.native
    
    /**
      * The resource type of the lock - Microsoft.Authorization/locks.
      */
    val `type`: js.UndefOr[String] = js.native
  }
  
  trait ManagementLockOwner extends StObject {
    
    /**
      * The application ID of the lock owner.
      */
    var applicationId: js.UndefOr[String] = js.undefined
  }
  object ManagementLockOwner {
    
    inline def apply(): ManagementLockOwner = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementLockOwner]
    }
    
    extension [Self <: ManagementLockOwner](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    }
  }
  
  trait Operation extends StObject {
    
    /**
      * The object that represents the operation.
      */
    var display: js.UndefOr[OperationDisplay] = js.undefined
    
    /**
      * Operation name: {provider}/{resource}/{operation}
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object Operation {
    
    inline def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    extension [Self <: Operation](x: Self) {
      
      inline def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait OperationDisplay extends StObject {
    
    /**
      * Operation type: Read, write, delete, etc.
      */
    var operation: js.UndefOr[String] = js.undefined
    
    /**
      * Service provider: Microsoft.Authorization
      */
    var provider: js.UndefOr[String] = js.undefined
    
    /**
      * Resource on which the operation is performed: Profile, endpoint, etc.
      */
    var resource: js.UndefOr[String] = js.undefined
  }
  object OperationDisplay {
    
    inline def apply(): OperationDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDisplay]
    }
    
    extension [Self <: OperationDisplay](x: Self) {
      
      inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  @js.native
  trait OperationListResult
    extends StObject
       with Array[Operation] {
    
    /**
      * URL to get the next set of operation list results if there are any.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
}
