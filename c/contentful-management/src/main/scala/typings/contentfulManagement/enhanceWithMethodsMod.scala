package typings.contentfulManagement

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enhanceWithMethodsMod {
  
  @JSImport("contentful-management/dist/typings/enhance-with-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[B /* <: Record[String, js.Any] */, M /* <: Record[String, js.Function] */](baseObject: B, methodsObject: M): M & B = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(baseObject.asInstanceOf[js.Any], methodsObject.asInstanceOf[js.Any])).asInstanceOf[M & B]
}
