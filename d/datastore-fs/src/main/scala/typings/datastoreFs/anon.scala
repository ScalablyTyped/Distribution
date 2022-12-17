package typings.datastoreFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CreateIfMissing extends StObject {
    
    var createIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var errorIfExists: js.UndefOr[Boolean] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var putManyConcurrency: js.UndefOr[Double] = js.undefined
  }
  object CreateIfMissing {
    
    inline def apply(): CreateIfMissing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateIfMissing]
    }
    
    extension [Self <: CreateIfMissing](x: Self) {
      
      inline def setCreateIfMissing(value: Boolean): Self = StObject.set(x, "createIfMissing", value.asInstanceOf[js.Any])
      
      inline def setCreateIfMissingUndefined: Self = StObject.set(x, "createIfMissing", js.undefined)
      
      inline def setErrorIfExists(value: Boolean): Self = StObject.set(x, "errorIfExists", value.asInstanceOf[js.Any])
      
      inline def setErrorIfExistsUndefined: Self = StObject.set(x, "errorIfExists", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setPutManyConcurrency(value: Double): Self = StObject.set(x, "putManyConcurrency", value.asInstanceOf[js.Any])
      
      inline def setPutManyConcurrencyUndefined: Self = StObject.set(x, "putManyConcurrency", js.undefined)
    }
  }
  
  trait DeleteManyConcurrency extends StObject {
    
    var createIfMissing: Boolean
    
    var deleteManyConcurrency: Double
    
    var errorIfExists: Boolean
    
    var `extension`: String
    
    var getManyConcurrency: Double
    
    var putManyConcurrency: Double
  }
  object DeleteManyConcurrency {
    
    inline def apply(
      createIfMissing: Boolean,
      deleteManyConcurrency: Double,
      errorIfExists: Boolean,
      `extension`: String,
      getManyConcurrency: Double,
      putManyConcurrency: Double
    ): DeleteManyConcurrency = {
      val __obj = js.Dynamic.literal(createIfMissing = createIfMissing.asInstanceOf[js.Any], deleteManyConcurrency = deleteManyConcurrency.asInstanceOf[js.Any], errorIfExists = errorIfExists.asInstanceOf[js.Any], getManyConcurrency = getManyConcurrency.asInstanceOf[js.Any], putManyConcurrency = putManyConcurrency.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteManyConcurrency]
    }
    
    extension [Self <: DeleteManyConcurrency](x: Self) {
      
      inline def setCreateIfMissing(value: Boolean): Self = StObject.set(x, "createIfMissing", value.asInstanceOf[js.Any])
      
      inline def setDeleteManyConcurrency(value: Double): Self = StObject.set(x, "deleteManyConcurrency", value.asInstanceOf[js.Any])
      
      inline def setErrorIfExists(value: Boolean): Self = StObject.set(x, "errorIfExists", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setGetManyConcurrency(value: Double): Self = StObject.set(x, "getManyConcurrency", value.asInstanceOf[js.Any])
      
      inline def setPutManyConcurrency(value: Double): Self = StObject.set(x, "putManyConcurrency", value.asInstanceOf[js.Any])
    }
  }
}
