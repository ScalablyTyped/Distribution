package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxFlags extends StObject
@JSGlobal("ts.JsxFlags")
@js.native
object JsxFlags extends StObject {
  
  @js.native
  sealed trait IntrinsicElement
    extends StObject
       with JsxFlags
  
  /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicIndexedElement
    extends StObject
       with JsxFlags
  
  /** An element from a named property of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicNamedElement
    extends StObject
       with JsxFlags
  
  @js.native
  sealed trait None
    extends StObject
       with JsxFlags
}
