package typings.coreJs

import org.scalablytyped.runtime.TopLevel
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/object/define-property", JSImport.Namespace)
@js.native
object definePropertyMod
  extends TopLevel[
      js.Function3[
        /* o */ js.Any, 
        /* propertyKey */ PropertyKey, 
        /* attributes */ PropertyDescriptor, 
        js.Any
      ]
    ]

