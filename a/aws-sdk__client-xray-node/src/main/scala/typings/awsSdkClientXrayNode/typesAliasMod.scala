package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasMod {
  
  trait Alias extends StObject {
    
    /**
      * <p>The canonical name of the alias.</p>
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A list of names for the alias, including the canonical name.</p>
      */
    var Names: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p>The type of the alias.</p>
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object Alias {
    
    inline def apply(): Alias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alias]
    }
    
    extension [Self <: Alias](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setNames(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  trait UnmarshalledAlias
    extends StObject
       with Alias {
    
    /**
      * <p>A list of names for the alias, including the canonical name.</p>
      */
    @JSName("Names")
    var Names_UnmarshalledAlias: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledAlias {
    
    inline def apply(): UnmarshalledAlias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAlias]
    }
    
    extension [Self <: UnmarshalledAlias](x: Self) {
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value*))
    }
  }
}
