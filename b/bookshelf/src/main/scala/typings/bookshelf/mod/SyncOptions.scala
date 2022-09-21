package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncOptions extends StObject {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var transacting: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Knex.Transaction */ Any
  ] = js.undefined
  
  var withSchema: js.UndefOr[String] = js.undefined
}
object SyncOptions {
  
  inline def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  
  extension [Self <: SyncOptions](x: Self) {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setTransacting(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Knex.Transaction */ Any
    ): Self = StObject.set(x, "transacting", value.asInstanceOf[js.Any])
    
    inline def setTransactingUndefined: Self = StObject.set(x, "transacting", js.undefined)
    
    inline def setWithSchema(value: String): Self = StObject.set(x, "withSchema", value.asInstanceOf[js.Any])
    
    inline def setWithSchemaUndefined: Self = StObject.set(x, "withSchema", js.undefined)
  }
}
