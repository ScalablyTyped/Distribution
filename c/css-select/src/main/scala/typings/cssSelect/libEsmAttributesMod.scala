package typings.cssSelect

import typings.cssSelect.libEsmTypesMod.CompiledQuery
import typings.cssSelect.libEsmTypesMod.InternalOptions
import typings.cssWhat.libEsTypesMod.AttributeAction
import typings.cssWhat.libEsTypesMod.AttributeSelector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmAttributesMod {
  
  @JSImport("css-select/lib/esm/attributes", "attributeRules")
  @js.native
  val attributeRules: Record[
    AttributeAction, 
    js.Function3[
      /* next */ CompiledQuery[Any], 
      /* data */ AttributeSelector, 
      /* options */ InternalOptions[Any, Any], 
      CompiledQuery[Any]
    ]
  ] = js.native
}
