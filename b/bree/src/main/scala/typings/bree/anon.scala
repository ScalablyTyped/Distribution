package typings.bree

import typings.std.RequestCredentials
import typings.std.WorkerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.WorkerOptions> */
  trait PartialWorkerOptions extends StObject {
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[WorkerType] = js.undefined
  }
  object PartialWorkerOptions {
    
    inline def apply(): PartialWorkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWorkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialWorkerOptions] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: WorkerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
