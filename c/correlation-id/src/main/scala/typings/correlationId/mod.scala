package typings.correlationId

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("correlation-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindId[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](id: String, work: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bindId")(id.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def bindId[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](work: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("bindId")(work.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
  
  inline def withId(id: String, work: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withId")(id.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def withId(work: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withId")(work.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
