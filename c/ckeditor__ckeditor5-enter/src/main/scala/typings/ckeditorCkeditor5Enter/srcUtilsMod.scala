package typings.ckeditorCkeditor5Enter

import typings.ckeditorCkeditor5Engine.srcModelSchemaMod.Schema
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("@ckeditor/ckeditor5-enter/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCopyOnEnterAttributes[T](schema: Schema, allAttributes: js.Iterable[T]): Generator[T, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCopyOnEnterAttributes")(schema.asInstanceOf[js.Any], allAttributes.asInstanceOf[js.Any])).asInstanceOf[Generator[T, Any, Any]]
}
