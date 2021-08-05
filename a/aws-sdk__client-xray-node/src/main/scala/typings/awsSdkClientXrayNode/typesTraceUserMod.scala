package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typings.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTraceUserMod {
  
  trait TraceUser extends StObject {
    
    /**
      * <p>Services that the user's request hit.</p>
      */
    var ServiceIds: js.UndefOr[js.Array[ServiceId] | Iterable[ServiceId]] = js.undefined
    
    /**
      * <p>The user's name.</p>
      */
    var UserName: js.UndefOr[String] = js.undefined
  }
  object TraceUser {
    
    inline def apply(): TraceUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceUser]
    }
    
    extension [Self <: TraceUser](x: Self) {
      
      inline def setServiceIds(value: js.Array[ServiceId] | Iterable[ServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      inline def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
      
      inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    }
  }
  
  trait UnmarshalledTraceUser
    extends StObject
       with TraceUser {
    
    /**
      * <p>Services that the user's request hit.</p>
      */
    @JSName("ServiceIds")
    var ServiceIds_UnmarshalledTraceUser: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.undefined
  }
  object UnmarshalledTraceUser {
    
    inline def apply(): UnmarshalledTraceUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTraceUser]
    }
    
    extension [Self <: UnmarshalledTraceUser](x: Self) {
      
      inline def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      inline def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
    }
  }
}
