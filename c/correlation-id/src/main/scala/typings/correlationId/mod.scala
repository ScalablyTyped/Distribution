package typings.correlationId

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("correlation-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindId[T /* <: js.Function1[/* repeated */ Any, Any] */](id: String, work: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bindId")(id.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bindId[T /* <: js.Function1[/* repeated */ Any, Any] */](work: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("bindId")(work.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
  
  inline def withId[T](id: String, work: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("withId")(id.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def withId[T](work: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("withId")(work.asInstanceOf[js.Any]).asInstanceOf[T]
}
