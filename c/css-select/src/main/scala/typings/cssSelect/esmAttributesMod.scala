package typings.cssSelect

import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssWhat.typesMod.AttributeAction
import typings.cssWhat.typesMod.AttributeSelector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAttributesMod {
  
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
