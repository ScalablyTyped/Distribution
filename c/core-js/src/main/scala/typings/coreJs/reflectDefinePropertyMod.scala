package typings.coreJs

import org.scalablytyped.runtime.TopLevel
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/reflect/define-property", JSImport.Namespace)
@js.native
object reflectDefinePropertyMod
  extends TopLevel[
      js.Function3[
        /* target */ js.Any, 
        /* propertyKey */ PropertyKey, 
        /* attributes */ PropertyDescriptor, 
        Boolean
      ]
    ]

