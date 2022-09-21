package typings.cssSelect

import typings.cssSelect.libTypesMod.CompiledQuery
import typings.cssSelect.libTypesMod.InternalOptions
import typings.cssWhat.typesMod.AttributeAction
import typings.cssWhat.typesMod.AttributeSelector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributesMod {
  
  @JSImport("css-select/lib/attributes", "attributeRules")
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
