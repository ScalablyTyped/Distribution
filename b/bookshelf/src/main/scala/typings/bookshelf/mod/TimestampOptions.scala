package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampOptions extends StObject {
  
  var method: js.UndefOr[String] = js.undefined
}
object TimestampOptions {
  
  inline def apply(): TimestampOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampOptions]
  }
  
  extension [Self <: TimestampOptions](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
