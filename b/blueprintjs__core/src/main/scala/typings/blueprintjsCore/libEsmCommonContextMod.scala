package typings.blueprintjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonContextMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]:? @blueprintjs/core.@blueprintjs/core/lib/esm/common/context.Validator<K>}
    }}}
    */
  @js.native
  trait ValidationMap[T] extends StObject
  
  type Validator[K] = js.Function5[
    /* props */ StringDictionary[Any], 
    /* propName */ K, 
    /* componentName */ String, 
    /* location */ String, 
    /* propFullName */ String, 
    js.UndefOr[js.Error]
  ]
}
