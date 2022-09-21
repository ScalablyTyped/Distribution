package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServiceIdMod {
  
  trait ServiceId extends StObject {
    
    /**
      * <p/>
      */
    var AccountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p/>
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * <p/>
      */
    var Names: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p/>
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object ServiceId {
    
    inline def apply(): ServiceId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceId]
    }
    
    extension [Self <: ServiceId](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setNames(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  trait UnmarshalledServiceId
    extends StObject
       with ServiceId {
    
    /**
      * <p/>
      */
    @JSName("Names")
    var Names_UnmarshalledServiceId: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledServiceId {
    
    inline def apply(): UnmarshalledServiceId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledServiceId]
    }
    
    extension [Self <: UnmarshalledServiceId](x: Self) {
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value*))
    }
  }
}
