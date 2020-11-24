package typings.carlo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Channel = java.lang.String
  
  type EvaluateFunction = js.Function2[
    /* pageFunction */ (js.Function1[/* repeated */ js.Any, js.Any]) | java.lang.String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ /* repeated */ js.Any, 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any
    ]
  ]
  
  type WindowEvent = typings.carlo.carloStrings.close
}
